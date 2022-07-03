import java.util.Scanner;

class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Зададим длину массива:");
        int s = sc.nextInt();
        int numbers[] = new int[s];
        System.out.println("Введём элементы для массива:");
        for (int i = 0; i < s; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("Элементы массива кратные 3:");
        for (int a = 0; a < s; a++) {
            if (numbers[a] % 3 == 0) {
                System.out.println(numbers[a] + " ");
            }
        }
    }
}