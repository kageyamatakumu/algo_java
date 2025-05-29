// 文字列 S が 1 行目に、2 つの正の整数 N,M が空白区切りで 2 行目に入力されます。
// S の前から N 番目の文字と、前から M 番目の文字を入れ替えた文字列を出力してください。
// ただしここでは、文字列 S の先頭の文字は 1 文字目であるとします。

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            String inputStr = scanner.nextLine();

            String[] inputStrArr = scanner.nextLine().trim().split(" ");
            validateArrLength(inputStrArr);

            int a = Integer.parseInt(inputStrArr[0]) - 1;
            int b = Integer.parseInt(inputStrArr[1]) - 1;

            StringBuilder sb = new StringBuilder(inputStr);
            validateStrLength(a, b, sb);

            char charA = inputStr.charAt(a);
            char charB = inputStr.charAt(b);

            sb.setCharAt(a, charA);
            sb.setCharAt(b, charB);

            String result = sb.toString();

            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("数字として認識できません: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("入力エラー: " + e.getMessage());
        }
    }

    private static void validateArrLength(String[] arr) {
        if (arr.length != 2) {
            throw new IllegalArgumentException("2つの値を空白区切りで入力してください");
        }
    }

    private static void validateStrLength(int a, int b, StringBuilder baseStr) {
        int length = baseStr.length();

        if (a < 0 || a >= length) {
            throw new IllegalArgumentException("文字列 S の長さ以内の正しい位置を指定してください（1 以上 " + length + " 以下）");
        }

        if (b < 0 || b >= length) {
            throw new IllegalArgumentException("文字列 S の長さ以内の正しい位置を指定してください（1 以上 " + length + " 以下）");
        }
    }
}
