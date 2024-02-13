package task3;

public class Main {
    public static void main(String[] args) {
        String str = "Hello world";
        char[] charArray = str.toCharArray();
        char[] newCharArray = new char[charArray.length * 2];
        for (int i = 0; i < charArray.length; i++) {
            newCharArray[i * 2] = charArray[i];
            newCharArray[i * 2 + 1] = charArray[i];
        }
        System.out.println(new String(newCharArray));
    }
}
