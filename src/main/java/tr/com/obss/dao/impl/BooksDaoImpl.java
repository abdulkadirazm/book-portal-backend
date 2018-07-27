package tr.com.obss.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import tr.com.obss.dao.BooksDao;
import tr.com.obss.model.Books;

import java.sql.Date;
import java.util.List;

@Repository("booksDao")
public class BooksDaoImpl implements BooksDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addBook(Books books) {
        jdbcTemplate.update("INSERT INTO books (bookID, title, publishDate, insertDate, updateDate, insertedBy) VALUES (?, ?, ?, ?, ?, ?)",
                books.getBookID(), books.getTitle(), books.getPublishDate(), new java.sql.Timestamp(new java.util.Date().getTime()), books.getUpdateDate(), books.getInsertedBy());
        System.out.println("Book Added!!");
    }

    @Override
    public void editBook(Books books, int bookID) {
        Books bookOld = (Books) jdbcTemplate.queryForObject("SELECT * FROM books where bookID = ? ",
                new Object[] { bookID }, new BeanPropertyRowMapper(Books.class));

        jdbcTemplate.update("UPDATE books SET title = ? , publishDate= ? , insertDate = ? , updateDate = ? , insertedBy = ? WHERE bookID = ? ",
                books.getTitle(), books.getPublishDate(), bookOld.getInsertDate(), new java.sql.Timestamp(new java.util.Date().getTime()), books.getInsertedBy(), bookID);
        System.out.println("Book Updated!!");
    }

    @Override
    public void deleteBook(int bookID) {
        jdbcTemplate.update("DELETE from books WHERE bookID = ? ", bookID);
        System.out.println("Book Deleted!!");
    }

    @Override
    public Books getBook(int bookID) {
        Books books = (Books) jdbcTemplate.queryForObject("SELECT * FROM books where bookID = ? ",
                new Object[] { bookID }, new BeanPropertyRowMapper(Books.class));

        return books;
    }

    @Override
    public List getAllBook() {
        List < BooksDao > books = jdbcTemplate.query("SELECT * FROM books", new BeanPropertyRowMapper(Books.class));

        return books;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
}
