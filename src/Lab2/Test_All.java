package Lab2;
import java.lang.*;
public class Test_All {
    public static void main(String[] args) {
        Ball b1 = new Ball(100, 100);
        System.out.println(b1);
        b1.move (30, 45);
        System.out.println(b1);
        System.out.println("-------------------------------");
        Ball b2 = new Ball (500, 0);
        System.out.println(b2);
        b2.move ( -50, 11);
        System.out.println(b2);
        System.out.println("-------------------------------");
        Ball b3 = new Ball ( -111, -3);
        System.out.println(b3);
        b3.move (50, 6);
        System.out.println(b3);
        System.out.println("-------------------------------");

        Author a1 = new Author("Platon", "Platon@mail.ru", 'm');
        System.out.println(a1.toString());
        Author a2 = new Author("Alex","Alex_Hunter@djuba.ya", 'm');
        System.out.println(a2.toString());
        Author a3 = new Author("Unknown", "12345@google.com",'u');
        System.out.println(a3.toString());
    }
}
