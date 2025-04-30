import java.util.Scanner;

/**
 * 2 つの文字列 S,T が、標準入力で一行ずつ与えられます。
 * これらの文字列をこの順に繋げて得られる文字列を出力してください。
 */
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String text = scanner.nextLine();
            String text2 = scanner.nextLine();
            System.out.println(Concatenate.stringConcatenate(text, text2));
        }
    }
}

/**
 * 文字列を繋げるロジックを持つクラス
 */
class Concatenate {
    public static String stringConcatenate(String str1, String str2) {
        StringBuilder sb = new StringBuilder(str1.length() + str2.length());
        sb.append(str1);
        sb.append(str2);

        return sb.toString();
    }
}