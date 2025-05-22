// 3 つの文字列 S, T, U が空白区切りで入力されます。U と T と S をこの順につなげた文字列を出力してください。

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String[] arr = scanner.nextLine().trim().split(" ");
            validate(arr);

            StringBuilder builder = new StringBuilder();

            // U, T, S の順で連結するため、配列を逆順に処理
            for(int i = arr.length - 1; i >= 0; i--) {
                builder.append(arr[i]);
            }

            String result = builder.toString();

            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println("入力エラー: " + e.getMessage());
        }
    }

    private static void validate(String[] arr) {
        if (arr.length != 3) {
            throw new IllegalArgumentException("3つの値を空白区切りで入力してください");
        }
    }
}
