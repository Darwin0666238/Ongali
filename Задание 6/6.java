import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void управление_ячейками() {
        int[] ячейки = new int[3];
        Arrays.fill(ячейки, Integer.MAX_VALUE);  // Инициализируем ячейки максимальным значением
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите число (0 для выхода): ");
            int число = scanner.nextInt();
            if (число == 0) {
                break;
            }
            int minIndex = 0;
            for (int i = 1; i < ячейки.length; i++) {
                if (ячейки[i] < ячейки[minIndex]) {
                    minIndex = i;
                }
            }
            if (ячейки[minIndex] == Integer.MAX_VALUE) {
                ячейки[minIndex] = число;
            } else {
                ячейки[minIndex] = число;
            }
            System.out.println(Arrays.toString(ячейки));
        }
    }

    public static void main(String[] args) {
        управление_ячейками();
    }
}
