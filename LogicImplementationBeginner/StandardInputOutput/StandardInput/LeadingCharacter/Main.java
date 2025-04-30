import java.util.Scanner;

/**
 * 文字列 S が標準入力で与えられます。
 * 文字列 S の先頭の文字を出力してください。 たとえば、文字列 algo の先頭の文字は a です。
 */
public class Main {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            String text = scanner.next();
            System.out.println(FirstCharacter.getFirstCharacter(text));
        }
    }
}

class FirstCharacter {
    public static char getFirstCharacter(String str) {
        if(str == null || str.isEmpty()) {
            throw new IllegalArgumentException("入力は null または空ではいけません。");
        }
        return str.charAt(0);
    }
}