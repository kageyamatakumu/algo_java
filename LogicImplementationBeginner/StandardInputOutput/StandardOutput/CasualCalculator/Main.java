/**
 * 314×(159+265)−358 の計算結果を出力するプログラムを作成してください。
 */
public class Main {
    public static void main(String[] args) {
        int num1 = 314;
        int num2 = 159;
        int num3 = 265;
        int num4 = 358;

        int result = calculateExpression(num1, num2, num3, num4);
        System.out.println(result);
    }

    /**
     * num1 × (num2 + num3) − num4 の形式の計算を行います。
     * @param num1 基盤になる数値
     * @param num2 括弧内の最初の数値
     * @param num3 括弧内の二番目の数値
     * @param num4 最後に引く数値
     * @return 計算結果
     */
    private static int calculateExpression(int num1, int num2, int num3, int num4) {
        int sum = plus(num2, num3);

        int multiple = multiply(num1, sum);

        int result = subtract(multiple, num4);

        return result;
    }

    /**
     * 2つの整数を足し算
     * @param a 1つ目の整数
     * @param b 2つ目の整数
     * @return ２つの整数の和
     */
    private static int plus(int a, int b) {
        return a + b;
    }

    /**
     * 2つの整数を掛け算
     * @param a 1つ目の整数
     * @param b 2つ目の整数
     * @return 2つの整数の積
     */
    private static int multiply(int a, int b) {
        return a * b;
    }

    /**
     * 2つの整数の引き算
     * @param a 1つ目の整数
     * @param b 2つ目の整数
     * @return 2つの整数の差
     */
    private static int subtract(int a, int b) {
        return a - b;
    }
}
