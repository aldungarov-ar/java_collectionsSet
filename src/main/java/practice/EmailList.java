package practice;

import java.util.*;
import java.util.regex.Pattern;

public class EmailList {

    private final TreeSet<String> emailList = new TreeSet<>();

    public void add(String email) {
        if (email.isEmpty()) {
            System.out.println("Неверный формат email");
            return;
        }
        email = email.toLowerCase();
        String pattern = "^(\\w+)@(\\S+){2,6}\\.([A-Za-z]{2,})";
        boolean matches = Pattern.compile(pattern).matcher(email).matches();
        if (matches) {
            emailList.add(email);
        } else {
            System.out.println("Неверный формат email");
        }
    }

    public List<String> getSortedEmails() {
        return new ArrayList<>(emailList);
    }

}
