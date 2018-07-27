package tr.com.obss.model;

public class Authors {
    private int authorID;
    private int name;
    private int surname;
    private String insertDate;
    private String updateDate;
    private String insertedBy;

    public Authors(){

    }

    public Authors(Authors authors){
        this.authorID = authors.getAuthorID();
        this.name = authors.getName();
        this.surname = authors.getSurname();
        this.insertDate = authors.getInsertDate();
        this.updateDate = authors.getUpdateDate();
        this.insertedBy = authors.getInsertedBy();
    }

    public int getAuthorID() {
        return authorID;
    }

    public void setAuthorID(int authorID) {
        this.authorID = authorID;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getSurname() {
        return surname;
    }

    public void setSurname(int surname) {
        this.surname = surname;
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
