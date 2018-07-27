package tr.com.obss.service;

import tr.com.obss.model.Authors;

import java.util.List;

public interface AuthorsService {

    public Authors addAuthor(Authors authors);
    public Authors editAuthor(Authors authors, int authorID);
    public void deleteAuthor(int authorID);
    public Authors getAuthor(int authorID);
    public List<Authors> getAllAuthor();
}
