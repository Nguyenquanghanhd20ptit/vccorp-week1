package AdapterPattern.ClassAdapter;

import java.util.Scanner;

public class ClassAdapterMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số điện thoại");
        String s = scanner.nextLine();
        IPhoneTarget checkPhone = new CheckPhoneAdapter();
        if(checkPhone.isPhoneNumber(s)){
            System.out.println(s + ": Là số điện thoại hợp lệ");
        }else {
            System.out.println(s + ": Không phải là số điện thoại");
        }
    }
}
