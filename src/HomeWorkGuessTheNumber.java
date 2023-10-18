import java.util.Random;
import java.util.Scanner;

public class HomeWorkGuessTheNumber {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String name = "Гра Вгадай число";
        System.out.println(name);
        int number = random.nextInt(10);
        //System.out.println(number);

        while (true) {
            System.out.println("Введіть число від 0 до 10: ");
            int manualNum = scanner.nextInt();

            if (manualNum > number) {
                System.out.println("Ваше число більше, ніж потрібно: ");
            } else if (manualNum < number) {
                    System.out.println("Ваше число менше, ніж потрібно: ");
            } else {
                break;
            }
        }
        System.out.println("Вітаємо! Ви вгадали число: " + number);


    }
}

















