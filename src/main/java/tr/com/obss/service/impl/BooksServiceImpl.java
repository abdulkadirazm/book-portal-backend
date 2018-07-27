package tr.com.obss.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tr.com.obss.dao.BooksDao;
import tr.com.obss.model.Books;
import tr.com.obss.service.BooksService;

import java.util.List;

@Service
public class BooksServiceImpl implements BooksService {

    @Autowired
    private BooksDao booksDao;

    @Override
    public Books addBook(Books books) {

        booksDao.addBook(books);
        return books;
    }

    @Override
    public Books editBook(Books books, int bookID) {

        booksDao.editBook(books, bookID);
        return books;
    }

    @Override
    public void deleteBook(int bookID) {
        booksDao.deleteBook(bookID);
    }

    @Override
    public Books getBook(int bookID) {
        return booksDao.getBook(bookID);
    }

    @Override
    public List<Books> getAllBook() {
        return booksDao.getAllBook();
    }
}
