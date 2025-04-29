/**
 * 123×456 を計算するプログラムを作成してください。
 */
public class Main {
    public static void main(String[] args) {
        int a = 123;
        int b = 456;
        int result = multiply(a, b);

        System.out.println(result);
    }

    /**
     * 2つの整数の積を計算する。
     * @param a 1つ目の整数
     * @param b 2つ目の整数
     * @return aとbの積
     */
    private static int multiply(int a, int b) {
        return a * b;
    }
}
