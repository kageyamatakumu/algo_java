// 0 以上 23 以下の整数 X が標準入力から与えられます。
// 現在の時刻が X 時のとき、日が変わる ( 24 時になる) まであと何時間かかるかを計算してください。

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int HOURS = 24;

        try (Scanner scanner = new Scanner(System.in)) {
            String inputStr = scanner.nextLine().trim();
            validate(inputStr);

            int parsedInt = Integer.parseInt(inputStr);

            System.out.println(HOURS - parsedInt);
        } catch (NumberFormatException e) {
            System.out.println("数字として認識できません: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("入力エラー: " + e.getMessage());
        }
    }

    private static void validate(String str) {
        try {
            int parsedInt = Integer.parseInt(str);

            if (!rangeCheck(parsedInt)) {
                throw new IllegalArgumentException("0以上23以下の整数で入力してください");
            }
        } catch (NumberFormatException e) {
            throw new NumberFormatException("整数で入力してください");
        }
    }

    private static boolean rangeCheck(int num) {
        return num >= 0 && num < 24;
    }
}
