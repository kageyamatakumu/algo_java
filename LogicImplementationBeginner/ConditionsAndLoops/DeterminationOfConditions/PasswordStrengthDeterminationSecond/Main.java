// パスワードを表す文字列 S が標準入力から与えられます。
// S が 6 文字以下の場合は dangerous、そうでない場合は safe を出力してください。

import java.util.Scanner;

public class Main {
  private static final int MIN_SAFE_PASSWORD_LENGTH = 7;

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      String inputStr = scanner.nextLine();

      if (isTooShort(inputStr)) {
        System.out.println("dangerous");
      } else {
        System.out.println("safe");
      }
    }
  }

  private static boolean isTooShort(String password) {
    if (password == null) return true;
    return password.length() < MIN_SAFE_PASSWORD_LENGTH;
  }
}