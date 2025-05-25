// 2 つの正の整数 A,B が空白区切りで入力されます。 A と B のうち一の位が小さい方の値を出力してください。
// ただし、A と B の一の位は異なることが保証されています。
// 補足
// 整数の一の位はその数を 10 で割った余りと等しいです。
// たとえば 17 の一の位は 7 ですが、これは 17 を 10 で割った余りと一致します。

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String[] inputArrStr = scanner.nextLine().trim().split(" ");
            validate(inputArrStr);

            int a = Integer.parseInt(inputArrStr[0]);
            int b = Integer.parseInt(inputArrStr[1]);

            int result = firstPlaceComparison(a, b);

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

    private static int firstPlaceComparison(int a, int b) {
        int aFirstPlace = a % 10;
        int bFirstPlace = b % 10;

        if (aFirstPlace == bFirstPlace) {
            throw new IllegalArgumentException("A と B の一の位は異なる様に入力してください");
        }

        return (aFirstPlace > bFirstPlace) ? b : a;
    }
}
