// 2 つの正の整数 A,B が空白区切りで入力されます。A が B の倍数かどうかを判定してください。

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            String[] arr = scanner.nextLine().trim().split(" ");
            validate(arr);

            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);

            String result = a % b == 0 ? "Yes" : "No";

            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("数字として認識できません: " + e.getMessage());
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