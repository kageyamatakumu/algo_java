// カメのアルルは A 時に出社し、B 時に退社しました。
// その途中、C 時から D 時までの間休憩を取っていました。
// A,B,C,D の値が標準入力から与えられます。
// アルルが働いていた時間を計算し出力するプログラムを作成してください。

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try(Scanner scanner = new Scanner(System.in)) {
      String[] inputStrArr = scanner.nextLine().trim().split(" ");
      checkArrLength(inputStrArr);

      int[] times = convertToIntArr(inputStrArr);
      checkNumBetween(times);
      checkOrder(
        times[0],
        times[2],
        times[3],
        times[1]
      );

      int start = times[0];
      int end = times[1];
      int restStart = times[2];
      int restEnd = times[3];

      int workingTime = (end - start) - (restEnd - restStart);
      System.out.println(workingTime);

    } catch(NumberFormatException e) {
      System.out.println("数字として認識できません: " + e.getMessage());
    } catch(IllegalArgumentException e) {
      System.out.println("入力エラー: " + e.getMessage());
    }
  }

  private static void checkArrLength(String[] arr) {
    if(arr.length != 4) {
      throw new IllegalArgumentException("4つの値を空白区切りで入力してください");
    }
  }

  private static void checkNumBetween(int[] intStr) {
    for(int num : intStr) {
      if(num < 0 || num > 23) {
        throw new IllegalArgumentException("0 以上 23 以下の整数で入力してください");
      }
    }
  }

  private static void checkOrder(int a, int c, int d, int b) {
    if (!(a <= c && c <= d && d <= b)) {
      throw new IllegalArgumentException("A≤C≤D≤Bになるように入力してください");
  }
  }

  private static int[] convertToIntArr(String[] strArr) throws NumberFormatException{
    int length = strArr.length;
    int[] intArr = new int[length];

    for(int i = 0; i < length; i++) {
      int num = Integer.parseInt(strArr[i]);
      intArr[i] = num;
    }

    return intArr;
  }
}
