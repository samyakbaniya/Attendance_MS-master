import model.Classs;
import model.User;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Connection conn = DBUtils.connect();
        Scanner sc = new Scanner(System.in);
        List<User> user_list = DBUtils.display_user(conn);
        List<Classs> class_list = DBUtils.display_class(conn);


        System.out.println("Enter your username:");
        String username = sc.next();
        System.out.println("Enter your desired password:");
        String password = sc.next();
        User user = new User(0, username, password);
        DBUtils.insert_user(conn, user);


        System.out.println("Enter your classname:");
        String classname = sc.next();
        Classs classobject = new Classs(0, classname);
        DBUtils.insert_class(conn, classobject);

        System.out.println("Enter your username:");
        username = sc.next();
        System.out.println("Enter your password:");
        password = sc.next();
        System.out.println("Enter your classname:");
        classname = sc.next();
        user = new User(0, username, password);
        classobject = new Classs(0, classname);
        DBUtils.insert_attendence(conn, user, classobject);


        for (User u : user_list) {
            System.out.println(u.getId() + "." + " Name: " + u.getUsername());
        }

        for (Classs c : class_list) {
            System.out.println(c.getId() + "." + " Name: " + c.getClassname());
        }

    }
}


