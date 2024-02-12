package task1.util;

import java.util.Locale;

public class Util {
    public static String getNumberBlocks(String str) {
        return str.substring(0, 4) + str.substring(9, 13);
    }

    public static String getDocumentNumber(String str) {
        return str.substring(0, 5) + "***" + str.substring(8, 14) + "***" + str.substring(17);
    }

    public static String getBriefe(String str) {
        return str.substring(5, 8).toLowerCase(Locale.ROOT) + "/"
                + str.substring(14, 17).toLowerCase(Locale.ROOT) + "/"
                + str.substring(19, 20).toLowerCase(Locale.ROOT) + "/"
                + str.substring(21).toLowerCase(Locale.ROOT);
    }

    public static StringBuilder getBriefeByStringbuilder(String str) {
        StringBuilder str1 = new StringBuilder("Letters:");
        return str1.append(str.toUpperCase()).delete(8, 13).replace(11, 17, "/")
                .replace(15, 17, "/").replace(17, 18, "/");
    }

    public static void checkSubsting(String str) {
        if (str.toLowerCase().contains("abc")) {
            System.out.println("номер документа содержит последовательность \"abc\"");
        } else {
            System.out.println("номер документа не содержит последовательность \"abc\"");
        }
    }

    public static void checkBegin(String str) {
        if (str.startsWith("555")) {
            System.out.println("номер документа начинается с последовательности \"555\"");
        } else {
            System.out.println("номер документа не начинается с последовательности \"555\"");
        }

    }

    public static void checkEnd(String str) {
        if (str.endsWith("1a2b")) {
            System.out.println("номер документа заканчивается последовательностью \"1a2b\"");
        } else {
            System.out.println("номер документа не заканчивается последовательностью \"1a2b\"");
        }

    }

}
