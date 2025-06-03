// カメのアルルがとあるテストを受けたところ、点数は N 点でした。
// 正整数 N が標準入力から与えられます。
// テストの点数が 0 点以上 100 点以下であるならば valid、そうでないならば invalid を出力してください。

import java.util.Scanner;

public class Main {
  private static final int MIN_SCORE = 0;
  private static final int MAX_SCORE = 100;
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      String inputStr = scanner.nextLine().trim();
      int score = parseInt(inputStr);

      if (isValidScore(score)) {
        System.out.println("valid");
      } else {
        System.out.println("invalid");
      }

      
    } catch (NumberFormatException e) {
      System.out.println("数値として認識できませんでした。正の整数を入力してください。");
    }
  }

  private static int parseInt(String str) throws NumberFormatException {
    return Integer.parseInt(str);
  }

  private static boolean isValidScore(int score) {
    return score >= MIN_SCORE && score <= MAX_SCORE;
  }
}
