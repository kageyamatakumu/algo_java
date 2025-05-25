// 長さ 5 の文字列 S が標準入力から与えられます。文字列 S の中央の文字を出力してください。
// たとえば入出力例 1 に示す通り、S= power に対しては、文字 w を出力します。

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String inputStr = scanner.nextLine().trim();
            validate(inputStr);

            char centerChar = getCenterChar(inputStr);

            System.out.println(centerChar);
        } catch (IllegalArgumentException e) {
            System.out.println("入力エラー: " + e.getMessage());
        } 
    }

    private static void validate(String str) {
        if (str.length() != 5) {
            throw new IllegalArgumentException("長さ5文字の文字を入力してください");
        }
    }

    private static char getCenterChar(String str) {
        return str.charAt(str.length() / 2);
    }
}
