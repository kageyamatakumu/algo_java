// 2 つの文字列 S,T が空白区切りで入力されます。S と T が等しい文字列であるかを判定してください。

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String[] arr = scanner.nextLine().trim().split(" ");
            validate(arr);

            String result = arr[0].equals(arr[1]) ? "Yes" : "No";

            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println("入力エラー: " + e.getMessage());
        }
    }

    private static void validate(String[] arr) {
        if (arr.length != 2) {
            throw new IllegalArgumentException("2つの値を空白区切りで入力してください");
        }
    }
}
