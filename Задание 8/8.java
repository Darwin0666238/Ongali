public class Main {
    public static String преобразовать_регистр(String строка) {
        // Преобразуем строку в верхний или нижний регистр в зависимости от количества заглавных и строчных букв
        int заглавные = 0;
        int строчные = 0;
        for (char символ : строка.toCharArray()) {
            if (Character.isUpperCase(символ)) {
                заглавные++;
            } else if (Character.isLowerCase(символ)) {
                строчные++;
            }
        }
        
        if (заглавные > строчные) {
            return строка.toUpperCase();
        } else if (заглавные < строчные) {
            return строка.toLowerCase();
        } else {
            return строка.toLowerCase();
        }
    }

    public static void main(String[] args) {
        String строка1 = "ABccAAr";
        String строка2 = "abCCaaR";
        System.out.println(преобразовать_регистр(строка1));  // ABCCAAR
        System.out.println(преобразовать_регистр(строка2));  // abccaar
    }
}
