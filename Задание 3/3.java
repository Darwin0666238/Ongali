public class Main {
    public static String удалить_гласные(String строка) {
        // Удаляем все гласные из строки
        String гласные = "аеёиоуыэюяaeiouy";
        StringBuilder sb = new StringBuilder();
        for (char символ : строка.toCharArray()) {
            if (гласные.indexOf(Character.toLowerCase(символ)) == -1) {
                sb.append(символ);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String строка = "Привет, Анна!";
        System.out.println(удалить_гласные(строка));  // Првт, нн!
    }
}
