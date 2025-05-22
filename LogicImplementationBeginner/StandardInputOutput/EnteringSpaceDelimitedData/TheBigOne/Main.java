
// 2 つの正の整数 A,B が空白区切りで入力されます。 A と B のうち大きい方の値を出力してください。
// ただし、A と B の値は異なることが保証されています。

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String[] inputArrStr = scanner.nextLine().trim().split(" ");
            validate(inputArrStr);

            int a = Integer.parseInt(inputArrStr[0]);
            int b = Integer.parseInt(inputArrStr[1]);

            int bigNum = Math.max(a, b);

            System.out.println(bigNum);
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
        if (arr[0].equals(arr[1])) {
            throw new IllegalArgumentException("異なる2つの値を入力してください");
        }
    }
}
