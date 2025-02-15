package singletonPattern;

public class User {
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private static User user;

    private User() {
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void setUser(User user) {
        User.user = user;
    }

    public static User getInstance(){
        if(user == null){
           user = new User();
        }
        return user;
    }
    public void showUser(){
        System.out.println("Tên người dùng: " + name + "\n"
        + "Số điện thoại người dùng: " + phoneNumber + "\n"
        + "Email người dùng: " + email + "\n"
        + "Địa chỉ người dùng: " + address + "\n");
    }
}
