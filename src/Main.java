import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        do {
            System.out.print("Введіть номер завдання: ");
            n = in.nextInt();
            switch (n){
                case 1 -> Task1();
                case 2 -> Task2();
            }
            System.out.println();
        } while(n != 0);
    }
    static void Task1(){
        for (double i = -1; i < 1; i += 0.2) {
            System.out.print(i + "\t");
        }
    }
    static void Task2(){
        double sum = 0, num;
        int count = 0;
        Scanner in = new Scanner(System.in);
        do {
            num = in.nextDouble();
            if (num > 0) sum += num;
            else if (num < 0) count++;
        } while(num != 0);
        System.out.println("Сума додатніх: " + sum);
        System.out.println("Кількість від'ємних" + count);
    }
    static void Task3(){
        Scanner in = new Scanner(System.in);
        int count = 0;
        System.out.println("Введіть рядок:");
        String str = in.next();
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) count++;
        }
        System.out.println("Кількість великих літер");
    }

}