// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        String tempstring = "1231";
        int temp = 0;
        for (int i = 0; i < tempstring.length(); i++) {
            temp += Integer.parseInt(String.valueOf(tempstring.charAt(i)));
        }
        System.out.println(temp);

    }
}