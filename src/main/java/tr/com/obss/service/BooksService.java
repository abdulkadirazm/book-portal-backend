package tr.com.obss.service;

import tr.com.obss.model.Books;

import java.util.List;

public interface BooksService {

    public Books addBook(Books books);
    public Books editBook(Books books, int bookID);
    public void deleteBook(int bookID);
    public Books getBook(int bookID);
    public List<Books> getAllBook();
}
