/**
 * 1 行目に 1 を、2 行目に 2 を、3 行目に 3 を表示するプログラムを作成してください。
 */
public class Main {
    final static int MAX_NUMBER = 3;
    public static void main(String[] args) {
        printSequentialNumbers(MAX_NUMBER);
    }

    /**
     * 1からmaxまでの連続した整数を行ごとに表示
     * @param max 表示する最大の整数
     */
    private static void printSequentialNumbers(int max) {
        for(int i = 1; i <= max; i++) {
            System.out.println(i);
        }
    }
}
