import java.util.Scanner;

/**
 * 2 つの正の整数 A,B が空白区切りで入力されます。
 * A+B の値を出力してください。
 */

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String[] arr = scanner.nextLine().trim().split(" ");
            if (arr.length != 2) {
                throw new IllegalArgumentException("2つの正の整数を入力してください。");
            }

            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            System.out.println(a + b);

        } catch (NumberFormatException e) {
            System.out.println("数字として認識できません: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("入力エラー: " + e.getMessage());
        }
    }
}


