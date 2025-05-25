// 標準入力から正の整数 N が与えられます。
// 税抜価格が N 円の商品を買った際の税込価格を求めてください。
// ただし、税率は 10% であるとします。

import java.util.Scanner;

public class Main {

    final static double TAX = 1.1;
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String inputStr = scanner.nextLine().trim();
            int price = Integer.parseInt(inputStr);

            if (price <= 0) {
                throw new IllegalArgumentException("正の整数を入力してください");
            }

            int totalPrice = (int) addTax(price);

            System.out.println(totalPrice);
        } catch(NumberFormatException e) {
            System.out.println("数字として認識できません: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("入力エラー: " + e.getMessage());
        }
    }

    private static double addTax(int price) {
        return price * TAX;
    }
}
