// 4 つの正の整数 A,B,C,D が空白区切りで入力されます。4 つの整数の最大値を出力してください。

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            String[] inputArrStr = scanner.nextLine().trim().split(" ");

            checkLength(inputArrStr);

            int[] numList = convertToInteger(inputArrStr);

            int result = getMaxValueInArr(numList);

            System.out.println(result);

        } catch (NumberFormatException e) {
            System.out.println("数字として認識できません: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("入力エラー: " + e.getMessage());
        }
    }

    private static void checkLength(String[] arrStr) {
        if (arrStr.length != 4) {
            throw new IllegalArgumentException("4つの値を空白区切り文字で入力してください");
        }
    }

    private static int[] convertToInteger(String[] arrStr) throws NumberFormatException {
        int[] result = new int[arrStr.length];
        for (int i = 0; i < arrStr.length; i++) {
            result[i] = Integer.parseInt(arrStr[i]);
        }
        return result;
    }

    private static int getMaxValueInArr(int[] arrNum) {
        int maxNum = arrNum[0];

        for(int num : arrNum) {
            if (maxNum < num) {
                maxNum = num;
            }
        }

        return maxNum;
    }
}
