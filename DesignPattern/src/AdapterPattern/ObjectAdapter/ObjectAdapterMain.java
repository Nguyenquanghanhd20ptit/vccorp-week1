package AdapterPattern.ObjectAdapter;

import java.util.Scanner;

public class ObjectAdapterMain {
    public static void main(String[] args) {
        IPhoneTarget phoneTarget = new CheckPhoneAdapter();
        System.out.println("Nhập số điện thoại: ");
        Scanner scanner = new Scanner(System.in);
        String phone = scanner.nextLine();
        if(phoneTarget.isPhoneNumber(phone)){
            System.out.println(phone + ": là số điện thoại");
        }else {
            System.out.println(phone + ": không phải là số điện thoại");
        }
    }
}
