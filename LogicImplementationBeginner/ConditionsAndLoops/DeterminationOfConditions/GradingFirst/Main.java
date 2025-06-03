// カメのアルルはとあるテストで N 点を取りました。
// このテストの評定は、点数に応じて次のように決まります。
// A: 90 点以上 100 点以下
// B: 80 点以上 89 点以下
// C: 79 点以下
// 正整数 N が標準入力から与えられます。
// アルルの評定を計算し出力するプログラムを作成してください。

import java.util.Scanner;

public class Main {
  private static final String A_GRADING = "A";
  private static final String B_GRADING = "B";
  private static final String C_GRADING = "C";
  private static final String INVALID = "invalid";

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      String inputStr = scanner.nextLine().trim();
      int score = parseInt(inputStr);
      String result = grading(score);

      System.out.println(result);
    } catch (NumberFormatException e) {
      System.out.println("無効な入力です。正の整数（0〜100）を入力してください。");
    }
  }

  private static int parseInt(String str) throws NumberFormatException {
    return Integer.parseInt(str);
  }

  private static String grading(int score) {
    if (score < 0 || score > 100) {
      return INVALID;
    } else if (score >= 90) {
      return A_GRADING;
    } else if (score >= 80) {
      return B_GRADING;
    } else {
      return C_GRADING;
    }
  }
}
