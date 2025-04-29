
/**
 * 1 行目に文字列 123 * 456 を出力し、 2 行目に 123×456 の計算結果を出力するプログラムを作成してください。
 */
public class Main {
    private static final String ERROR_MESSAGE_INVALID_NUMBER = "数値への変換に失敗しました。";

    public static void main(String[] args) {
        String str1 = "123";
        String str2 = "456";
        String text = String.format("%s * %s", str1, str2);

        // 1 行目に文字列 123 * 456 を出力
        System.out.println(text);

        // 2 行目に 123×456 の計算結果を出力する
        try {
            int result = parseAndMultiply(str1, str2);
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println(ERROR_MESSAGE_INVALID_NUMBER);
        }
    }

    /**
     * 文字列を整数に変換する。
     * @param str 数字の文字列
     * @return 変換した整数
     * @throws NumberFormatException 文字列が整数に変換できない場合
     */
    private static int parseInt(String str) throws NumberFormatException {
        return Integer.parseInt(str);
    }

    /**
     * ２つの文字列を数値に変換し、積を計算する。
     * @param str1 1つ目の数字（文字列）
     * @param str2 2つ目の数字（文字列）
     * @return 2つの数字の積
     * @throws NumberFormatException 文字列を数値に変換する際にエラー
     */
    private static int parseAndMultiply(String str1, String str2) throws NumberFormatException {
        int a = parseInt(str1);
        int b = parseInt(str2);
        return a * b;
    }
}
