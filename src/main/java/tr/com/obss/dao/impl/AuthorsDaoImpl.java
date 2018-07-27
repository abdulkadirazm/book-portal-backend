package tr.com.obss.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import tr.com.obss.dao.AuthorsDao;
import tr.com.obss.model.Authors;

import java.util.List;

@Repository("authorsDao")
public class AuthorsDaoImpl implements AuthorsDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void addAuthor(Authors authors) {
        jdbcTemplate.update("INSERT INTO authors (authorID, name, surname, insertDate, updateDate, insertedBy) VALUES (?, ?, ?, ?, ?, ?)",
                authors.getAuthorID(), authors.getName(), new java.sql.Timestamp(new java.util.Date().getTime()),authors.getUpdateDate(), authors.getInsertedBy(), authors.getSurname());
        System.out.println("Author Added!!");
    }

    @Override
    public void editAuthor(Authors authors, int authorID) {
        Authors authorsOld = (Authors) jdbcTemplate.queryForObject("SELECT * FROM authors where authorID = ? ",
                new Object[] { authorID }, new BeanPropertyRowMapper(Authors.class));
        jdbcTemplate.update("UPDATE authors SET name = ? , surname = ? , insertDate = ?, updateDate = ?, insertedBy = ?  WHERE authorID = ? ",
                authors.getName(), authors.getSurname(), authorsOld.getInsertDate(),new java.sql.Timestamp(new java.util.Date().getTime()), authors.getInsertedBy(), authorID);
        System.out.println("Author Updated!!");
    }

    @Override
    public void deleteAuthor(int authorID) {
        jdbcTemplate.update("DELETE from authors WHERE userID = ? ", authorID);
        System.out.println("User Deleted!!");
    }

    @Override
    public Authors getAuthor(int authorID) {
        Authors authors = (Authors) jdbcTemplate.queryForObject("SELECT * FROM authors where authorID = ? ",
                new Object[] { authorID }, new BeanPropertyRowMapper(Authors.class));

        return authors;
    }

    @Override
    public List getAllAuthor() {
        List < AuthorsDao > authors = jdbcTemplate.query("SELECT * FROM authors", new BeanPropertyRowMapper(Authors.class));

        return authors;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
