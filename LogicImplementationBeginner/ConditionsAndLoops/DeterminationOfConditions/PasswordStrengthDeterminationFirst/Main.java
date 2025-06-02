// パスワードを表す文字列 S が標準入力から与えられます。
// S が password という文字列と一致している場合には dangerous、そうでない場合は safe を出力してください。

import java.util.Scanner;

public class Main {
  private static final String DANGEROUS_PASSWORD = "password";
  public static void main(String[] args) {
    try(Scanner scanner = new Scanner(System.in)) {
      String inputStr = scanner.nextLine();

      if (isDangerousPassword(inputStr)) {
        System.out.println("dangerous");
      } else {
        System.out.println("safe");
      }
    }
  }

  private static boolean isDangerousPassword(String str) {
    return DANGEROUS_PASSWORD.equals(str);
  }
}