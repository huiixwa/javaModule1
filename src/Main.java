import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int min = 10;
        int max = random.nextInt(991) + 10;
        int secretNumber = random.nextInt(max - min + 1) + min;

        System.out.println("Загадайте число от " + min + " до " + max);
        System.out.println("1. Загадал\n2. Выход");
        System.out.print("Ваш выбор: ");

        int choice = scanner.nextInt();
        if (choice == 1) {
            int numGuesses = 0;
            int guess = 0;

            while (true) {
                numGuesses++;
                System.out.print("Вы загадали " + guess + "?\n1. Больше\n2. Меньше\n3. Угадал\n4. Выход\nВаш выбор: ");

                int action = scanner.nextInt();
                if (action == 3) {
                    System.out.println("Поздравляем, программа угадала число " + secretNumber + " за " + numGuesses + " попыток!");
                    break;
                } else if (action == 4) {
                    break;
                } else if (action == 1) {
                    min = guess + 1;
                } else if (action == 2) {
                    max = guess - 1;
                }

                guess = (max + min) / 2;
            }
        }

        System.out.println("До новых встреч!");
    }
}