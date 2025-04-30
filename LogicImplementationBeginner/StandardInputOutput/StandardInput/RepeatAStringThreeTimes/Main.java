import java.util.Scanner;

/**
 * 文字列 S が標準入力で与えられます。
 * S を 3 回繰り返してできる文字列を出力するプログラムを作成してください。
 */
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String text = scanner.next();
            System.out.println(Repeat.repeatString(text, 3));
        }
    }
}

/**
 * 文字列を繰り返すロジックを持つクラス
 */
class Repeat {
    /**
     * 与えられた文字列を指定された回数だけ繰り返した文字列を返します。
     *
     * @param str 繰り返す文字列
     * @param n   繰り返し回数
     * @return 繰り返された文字列
     */
    public static String repeatString(String str, int n) {
        if (str == null || n <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(str.length() * n);
        for (int i = 0; i < n; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}


