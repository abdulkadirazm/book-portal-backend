package tr.com.obss.dao;

import tr.com.obss.model.Books;

import java.util.List;

public interface BooksDao {

    public void addBook(Books books);
    public void editBook(Books books, int bookID);
    public void deleteBook(int bookID);
    public Books getBook(int bookID);
    public List<Books> getAllBook();
}
