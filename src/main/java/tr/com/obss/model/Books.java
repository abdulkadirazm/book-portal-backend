package tr.com.obss.model;

public class Books {

    private int bookID;
    private String title;
    private String publishDate;
    private String insertDate;
    private String updateDate;
    private String insertedBy;

    public Books(){


    }

    public Books(Books books){
        this.bookID = books.getBookID();
        this.title = books.getTitle();
        this.publishDate = books.getPublishDate();
        this.insertDate = books.getInsertDate();
        this.updateDate = books.getUpdateDate();
        this.insertedBy = books.getInsertedBy();
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(String insertDate) {
        this.insertDate = insertDate;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getInsertedBy() {
        return insertedBy;
    }

    public void setInsertedBy(String insertedBy) {
        this.insertedBy = insertedBy;
    }
}
