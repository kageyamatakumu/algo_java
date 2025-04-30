import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n1 = InputNum.inputNum(scanner);
            int n2 = InputNum.inputNum(scanner);

            int result = Adder.adder(n1, n2);
            System.out.println(result);
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

class Adder {
    public static int adder(int a, int b) {
        return a + b;
    }
}

class InputNum {
    public static int inputNum(Scanner scanner) {
        if (!scanner.hasNextInt()) {
            throw new IllegalArgumentException("Error: 数字を入力してください");
        }
        return scanner.nextInt();
    }
}