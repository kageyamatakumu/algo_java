import java.util.Scanner;

/**
 * 1 以上 100 以下の整数 N が標準入力から与えられます。
 * N を 5 で割ったあまりを標準出力するプログラムを作成してください。
 */
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
            if(!scanner.hasNextInt()) {
                System.err.println("Error: 数字を入力してださい");
                return;
            }
            int n = scanner.nextInt();
            if(!Validator.isValidRange(n)) {
                System.err.println("Error: 1以上100以下の整数を入力してください。");
                return;
            }
            System.out.println(Remainder.remainderValue(n, 5));
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
 * 値を割って余りを返すロジックを持つクラス
 */
class Remainder {
    /**
     * 2つの整数を受け取り、最初の整数を2番目の整数で割った余りを返します。
     *
     * @param divided 割られる整数
     * @param divisor 割る整数。0以外である必要があります。
     * @return 割った余りの整数
     * @throws ArithmeticException divisor が 0 の場合にスローされます。
     */
    public static int remainderValue(int divided, int divisor) {
        if(divisor == 0) {
            throw new ArithmeticException("divisor cannot be zero");
        }
        return divided % divisor;
    }
}
