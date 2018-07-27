package tr.com.obss.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tr.com.obss.dao.AuthorsDao;
import tr.com.obss.model.Authors;
import tr.com.obss.service.AuthorsService;

import java.util.List;

@Service
public class AuthorsServiceImpl implements AuthorsService{

    @Autowired
    private AuthorsDao authorsDao;

    @Override
    public Authors addAuthor(Authors authors) {
        authorsDao.addAuthor(authors);
        return authors;
    }

    @Override
    public Authors editAuthor(Authors authors, int authorID) {
        authorsDao.editAuthor(authors,authorID);
        return authors;
    }

    @Override
    public void deleteAuthor(int authorID) {
        authorsDao.deleteAuthor(authorID);
    }

    @Override
    public Authors getAuthor(int authorID) {
        return authorsDao.getAuthor(authorID);
    }

    @Override
    public List<Authors> getAllAuthor() {
        return authorsDao.getAllAuthor();
    }
}
