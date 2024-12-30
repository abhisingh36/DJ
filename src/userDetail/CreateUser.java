package userDetail;

import java.util.Map;
import java.util.Scanner;

public class CreateUser {
    public static void main(String[] args) {
        User user = new User();
        Scanner sc = new Scanner(System.in);

        user.setUsername(sc.next());
        user.setEmail(sc.next());
        user.setPassword(sc.next());


    }
}
