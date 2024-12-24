package http;

import java.util.Scanner;

public class HTTPMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("HTTP CODE : ");
        int httpCodeInput = scanner.nextInt(); scanner.nextLine();

        HTTP status = HTTP.findByCode(httpCodeInput);
        if (status == null) {
            System.out.println("정의되지 않은 코드");
        } else {
            System.out.println(status.getCode() + " " + status.getMessage());
            System.out.println("isSuccess = " + status.isSuccess());
        }
    }
}
