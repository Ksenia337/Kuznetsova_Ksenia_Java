import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String y = "Вячеслав";
        if (x.equals(y)) {
            System.out.print("Привет, " + x);
        }
        else {
            System.out.print("Нет такого имени");
        }
    }
}