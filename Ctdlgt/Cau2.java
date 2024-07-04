import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cau2 {
    private static final String URL_PATTERN =
           "^(http|https):\\/\\/([a-zA-Z0-9-]+\\.)+[a-z]{2,6}(\\/\\S*)?$";

    private static final Pattern pattern = Pattern.compile(URL_PATTERN);

    public static boolean isValidURL(String url) {
        Matcher matcher = pattern.matcher(url);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một url:");
        String url = scanner.nextLine();
        if(isValidURL(url)){
            System.out.println("Url: " +url + " là url hợp lệ");
        }
        else {
            System.out.println("Url: " +url + " là url không hợp lệ");
        }
    }
}
