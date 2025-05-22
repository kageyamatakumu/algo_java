// 3 つの整数 A,B,C が空白区切りで入力されます。3 つの整数の平均値を整数で出力してください。
// ただし、答えは整数になることが保証されています。

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String[] arr = scanner.nextLine().trim().split( " ");
            validate(arr);

            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int c = Integer.parseInt(arr[2]);

            int result = average(a, b, c);

            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println("入力エラー: " + e.getMessage());
        }
    }

    private static void validate(String[] arr) {
        if (arr.length != 3) {
            throw new IllegalArgumentException("3つの値を空白区切りで入力してください");
        }

        try {
            for (String string : arr) {
                Integer.parseInt(string);
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("入力された値は数値ではありません");
        }
    }

    private static int average(int a, int b, int c) {
        return (a + b + c) / 3;
    }
}
