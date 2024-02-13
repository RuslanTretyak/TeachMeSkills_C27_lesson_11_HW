package task2;

public class Main {
    public static void main(String[] args) {
        String str = "Найти самое длинное слово в строке и вывести его на экран";
        System.out.println(str + "\n");
        printWordMaxLength(str);
        printWordMinLength(str);

    }
    private static void printWordMaxLength(String str) {
        String[] stringArray = str.split(" ");
        int wordMaxLength = 0;
        int wordMaxLengthIndex = 0;
        for (int i = 0; i < stringArray.length; i++) {
            if (wordMaxLength <= stringArray[i].length()) {
                wordMaxLengthIndex = i;
                wordMaxLength = stringArray[i].length();
            }
        }
        System.out.println("самое длинное слово в строке - " + stringArray[wordMaxLengthIndex]);
    }
    private static void printWordMinLength(String str) {
        String[] stringArray = str.split(" ");
        int wordMinLength = stringArray[0].length();
        int wordMinLengthIndex = 0;
        for (int i = 0; i < stringArray.length; i++) {
            if (wordMinLength >= stringArray[i].length()) {
                wordMinLength = stringArray[i].length();
                wordMinLengthIndex = i;
            }

        }
        System.out.println("самое короткое слово в строке - " + stringArray[wordMinLengthIndex]);
    }
}
