/**
 * 27182 を 818 で割った余りを表示するプログラムを作成してください。
 */
public class Main {
    public static void main(String[] args) {
        int a = 27182;
        int b = 818;
        int result = calculateRemainder(a, b);

        System.out.println(result);
    }

    /**
     * 2つの整数の割り算の余りを計算する。
     *
     * @param dividend 割られる数
     * @param divisor 割る数（0は禁止）
     * @return dividendをdivisorで割ったときの余り
     * @throws IllegalArgumentException divisorが0の場合
     */
    private static int calculateRemainder(int dividend, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Divisor must not be zero.");
        }
        return dividend % divisor;
    }
}
