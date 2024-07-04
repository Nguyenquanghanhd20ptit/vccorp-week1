package singletonPattern;

public class SingletonMain {
    public static void main(String[] args) {
        User user = User.getInstance();
        user.setId(1);
        user.setName("Hạnh");
        user.setEmail("hanhd20ptit@gmail.com");
        user.setPhoneNumber("0383870219");
        user.setAddress("Hà Đông - Hà Nội");
        user.showUser();

        User user2 = User.getInstance();
        user2.setName("Nguyễn Quang Hạnh");
        user.showUser();
    }
}
