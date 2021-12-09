import atm.ATM;
import user.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        ATM atm = new ATM();
        atm.process(amount);

        User user = User.builder()
                .name("Dima")
                .age(18)
                .height(177)
                .race("black")
                .occupation("Co-founder of InstaNet")
                .build();
        System.out.println(user);
    }
}
