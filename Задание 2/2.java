public class Main {
    public static String приветствие(String имя) {
        // Приветствие с именем в правильном регистре
        return "Привет, " + имя.substring(0, 1).toUpperCase() + имя.substring(1).toLowerCase() + "!";
    }

    public static void main(String[] args) {
        String имя = "аНнА";
        System.out.println(приветствие(имя));  // Привет, Анна!
    }
}
