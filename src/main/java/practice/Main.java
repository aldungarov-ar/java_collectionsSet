package practice;

import java.util.Scanner;

public class Main {
    //public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmailList emailList = new EmailList();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }

            int index = input.indexOf(' ') != -1 ? input.indexOf(' ') : input.length();
            String command = input.substring(0, index);

            switch (command) {
                case "ADD":
                    String email = input.substring(index + 1);
                    emailList.add(email);
                    break;
                case "LIST":
                    for (String s : emailList.getSortedEmails()) {
                        System.out.println(s);
                    }
            }
        }
    }
}
