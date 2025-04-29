import java.util.Scanner;

/**
 * 1以上100以下の整数Nを受け取り、2倍して出力するプログラム
 */
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            if (!scanner.hasNextInt()) {
                System.err.println("Error: 数字を入力してください。");
                return;
            }
            int n = scanner.nextInt();
            if (!Validator.isValidRange(n)) {
                System.err.println("Error: 1以上100以下の整数を入力してください。");
                return;
            }
            System.out.println(Doubler.doubleValue(n));
        }
    }
}

/**
 * 入力値のバリデーションを行うクラス
 */
class Validator {
    public static boolean isValidRange(int n) {
        return n >= 1 && n <= 100;
    }
}

/**
 * 値を2倍にするロジックを持つクラス
 */
class Doubler {
    public static int doubleValue(int n) {
        return n * 2;
    }
}
