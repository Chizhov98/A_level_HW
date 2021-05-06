package ua.chizhov.hw3;

import java.util.Random;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
       /* Решение
Описание переменных:

a – число, "загаданное" компьютером;
b – очередное число, вводимое пользователем.

Алгоритм решения задачи:

Программа генерирует псевдослучайное число, которое записывается в переменную a.

Пока число a не совпадет с числом b, пользователю будет предлагаться ввести очередное число. При этом, если b > a, то на экран будет выдаваться сообщение "Много". Иначе будет проверяться условие b < a.
При его положительном значении появится сообщение "Мало", иначе сообщение "Угадал".*/


        System.out.println("Привет, давай сыграем в игру ))");
        System.out.println("Сейчас компьютер загадает число от 0 до 10( включительно), а ты попробуй угадать ");
        System.out.println("Ну что !? Поехали...");
        System.out.println("Как думаешь какое число загадал компьтер ?");

        System.out.println(gameResalt(gameCountAttempt()));

    }

    public static String gameResalt(int attempt) {

        if (attempt == 1) {
            return "Да ты просто везунчик, угадал(а) с первой попыткиБ молодец ";
        } else if (attempt >= 5) {
            return "Молодец  угадал(а), у тебя ушло на это " + attempt + " попыток.";
        }
        return "Молодец  угадал(а), у тебя ушло на это всего  " + attempt + " попытки.";
    }

    public static int gameCountAttempt() {
        Random random = new Random();
        int a = random.nextInt(11);
        Scanner in = new Scanner(System.in);

        int count = 1;
        boolean result = false;
        do {
            int b = in.nextInt();
            if (b > 10 || b < 0) {
                System.out.println("Пожалуйста, будь повниательней число должно быть больше 0 но не более 10");
                System.out.println("Попробуй еще раз, какое число загадал компьютер? ");
                count++;
            } else if (b == a) {
                return count;
            } else if (b > a) {
                System.out.println("Многовато, попробуй число поменьше :");
                count++;

            } else if (b < a) {
                System.out.println("Мало,компютер выбрал чсло побольше, попробуй еще :");
                count++;
            }


        } while (result == false);
        return count;
    }
}
