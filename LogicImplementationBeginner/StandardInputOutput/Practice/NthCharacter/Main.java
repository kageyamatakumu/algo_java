// 文字列 S と正の整数 N が改行区切りで入力されます。S の前から N 番目の文字を出力してください。
// ただしここでは、文字列 S の先頭の文字は 1 文字目であるとします。

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String inputStr = scanner.nextLine().trim();
            int inputNum = readIntFromInput(scanner);

            validate(inputStr, inputNum);

            // Javaの文字列は0-indexのため、N番目の文字は (N-1) 番目のインデックス
            System.out.println(inputStr.charAt(inputNum - 1));
            
        } catch(NumberFormatException e) {
            System.out.println("数字として認識できません: " + e.getMessage());
        } catch(IllegalArgumentException e) {
            System.out.println("入力エラー: " + e.getMessage());
        }
    }

    private static void validate(String inputStr, int inputNum) {
        if (inputNum < 1 || inputNum > inputStr.length()) {
            throw new IllegalArgumentException("N は 1 以上 " + inputStr.length() + " 以下である必要があります");
        }
    }

    private static int readIntFromInput(Scanner scanner) {
        String str = scanner.nextLine();

        try {
            int parsedInt = Integer.parseInt(str);

            return parsedInt;
        } catch (NumberFormatException e) {
            throw new NumberFormatException("数字を入力してください");
        }
    }
}
