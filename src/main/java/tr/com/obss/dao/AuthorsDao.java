package tr.com.obss.dao;

import tr.com.obss.model.Authors;

import java.util.List;

public interface AuthorsDao {
    public void addAuthor(Authors authors);
    public void editAuthor(Authors authors, int authorID);
    public void deleteAuthor(int authorID);
    public Authors getAuthor(int authorID);
    public List<Authors> getAllAuthor();
}
