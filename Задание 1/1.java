public class Main {
    public static boolean проверка_окончания(String строка1, String строка2) {
        // Проверяем, является ли вторая строка окончанием первой
        return строка1.endsWith(строка2);
    }

    public static void main(String[] args) {
        String строка1 = "abc";
        String строка2 = "bc";
        System.out.println(проверка_окончания(строка1, строка2));  // true
    }
}
