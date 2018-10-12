package tr.com.obss.model;

public class Users {

    private int userID;
    private int roleID;
    private String username;
    private String email;
    private String password;


    public int getRoleID() {
        return roleID;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }

    public Users(){

    }

    public Users(Users user) {
        this.userID = user.getUserID();
        this.email = user.getEmail();
        this.username = user.getUsername();
        this.password = user.getPassword();
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
