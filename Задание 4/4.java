public class Main {
    public static void квадраты_чисел(int начало, int шаг) {
        // Выводим квадраты чисел, начиная с наименьшего числа
        int число = начало;
        for (int i = 0; i < 5; i++) {  // Для примера выводим первые 5 чисел
            System.out.print(число * число + " ");
            число += шаг;
        }
    }

    public static void main(String[] args) {
        int начало = 5;
        int шаг = 1;
        квадраты_чисел(начало, шаг);  // 25 36 49 64 81
    }
}
