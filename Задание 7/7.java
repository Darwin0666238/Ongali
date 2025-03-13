import java.util.*;

public class Main {
    public static String удалить_повторы(String строка) {
        // Удаляем повторяющиеся слова, оставляя только одно вхождение
        String[] слова = строка.split(" ");
        Set<String> уникальные_слова = new LinkedHashSet<>();
        for (String слово : слова) {
            уникальные_слова.add(слово);
        }
        return String.join(" ", уникальные_слова);
    }

    public static void main(String[] args) {
        String строка = "abc abc ab abc ab acs acs";
        System.out.println(удалить_повторы(строка));  // abc ab acs
    }
}
