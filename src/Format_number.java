import java.sql.SQLOutput;
import java.util.Scanner;
public class Format_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        format_number(number);
    }

    public static void format_number(String number) {
        char[] numberChars = number.toCharArray();
        char[] chars = number.toCharArray();
        for (char c : chars) {
            if (!Character.isDigit(c)) {
                System.out.println("Не все символы являются цифрами");
                return;
            }
        }

        if (numberChars[0] != '8') {
            System.out.println("Это не российский номер телефона");
            return;
        }
        if (number.length() != 11) {
            System.out.println("Неверное число символов");
            return;
        }
        System.out.println(numberChars[0] + "(" + numberChars[1] + numberChars[2] + numberChars[3] + ")" + " " + numberChars[4] + numberChars[5] + numberChars[6] + "-" + numberChars[7] + numberChars[8] + "-" + numberChars[9] + numberChars[10]);
        return;
    }
}
