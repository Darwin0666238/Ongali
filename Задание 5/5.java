public class Main {
    public static void арифметический_ряд(int начало, int шаг, int количество_шагов) {
        // Выводим числа арифметического ряда
        for (int i = 0; i < количество_шагов; i++) {
            System.out.print(начало + " ");
            начало += шаг;
        }
    }

    public static void main(String[] args) {
        int начало = 1;
        int шаг = 2;
        int количество_шагов = 5;
        арифметический_ряд(начало, шаг, количество_шагов);  // 1 3 5 7 9
    }
}
