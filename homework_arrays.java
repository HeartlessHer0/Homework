import java.util.Random;
import java.util.Scanner;
public class homework_arrays {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размерность массива:");
        int a = scanner.nextInt();

        int n = 51;
        int[][] mass = new int[a][a];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = random.nextInt(n);
            }
        }
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + " ");
                ;
            }
            System.out.println(" ");
        }
        /* Ниже расписан цикл задания 1. Посчитать сумму четных чисел на главной диагонали
         */
        int sum = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if (i == j) {
                    if (mass[i][j] % 2 == 0)
                        sum += mass[i][j];
                }
            }
        }
        System.out.println("Сумма четных чисел на главной диагонали = " + sum);

        /* Ниже расписан цикл задания 2. Вывести нечетные элементы находящиеся под главной диагональю(включительно
         */
        System.out.println("Нечетные элементы находящиеся поднижней диагональю(включительно): ");
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (mass[i][j] % 2 != 0)
                    System.out.print(mass[i][j] + " ");
            }
        }

        /* Ниже расписан цикл задания 3. Проверить произведение какой диагонали больше
         */
        int d_main = 1;
        int d_secondary = 1;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if (i == j)
                    d_main *= mass[i][j];
                if (j == (mass.length - i) - 1)
                    d_secondary *= mass[i][j];
            }
        }
        System.out.println(" ");
        if (d_main > d_secondary)
            System.out.println("Произведение элементов основной диагонали больше чем произведение элементов побочной:" + (d_main + ">" + d_secondary));
        if (d_main < d_secondary)
            System.out.println("Произведение элементов основной диагонали меньше чем произведение элементов побочной:" + (d_main + "<" + d_secondary));
        if (d_main == d_secondary)
            System.out.println("Произведение элементов основной диагонали равно произведению элементов побочной:" + (d_main + "=" + d_secondary));

        /* Ниже расписан цикл задания 4. Посчитать сумму четных элементов стоящих над главной диагональю
         */
        sum = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = i + 1; j < mass[i].length; j++) {
                if (mass[i][j] % 2 == 0)
                    sum += mass[i][j];
            }
        }
        System.out.println("Сумма четных элементов стоящих над главной диагональю: " + sum);
        /* Ниже расписан цикл задания 5. Транспонировать матрицу
         */
        int buffer = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = i + 1; j < mass[i].length; j++) {
                buffer = mass[i][j];
                mass[i][j] = mass[j][i];
                mass[j][i] = buffer;
            }

        }
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + " ");
                ;
            }
            System.out.println(" ");
        }

    }
}

