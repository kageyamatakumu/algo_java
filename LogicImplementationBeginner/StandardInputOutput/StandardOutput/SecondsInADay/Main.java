/**
 * 1 日は 24 時間、 1 時間は 60 分、1 分は 60 秒です。
 * 1 日は何秒かを計算し、整数で出力するプログラムを作成してください。
 */
public class Main {
    final static int hoursOfDay = 24;
    final static int minutesOfHour = 60;
    final static int secondsOfMinutes = 60;

    public static void main(String[] args) {
        // 1日が何分かを計算する
        int minutes = parseMinutes(hoursOfDay);

        // 1日が何秒か計算する
        int seconds = parseSeconds(minutes);

        // 表示する
        System.out.println(seconds);
    }

    /**
     * 時間から何分かを計算する
     * @param hours 時間
     * @return 分
     */
    private static int parseMinutes(int hours) {
        return minutesOfHour * hours;
    }

    /**
     * 分から何秒かを計算する
     * @param minutes 分
     * @return 秒
     */
    private static int parseSeconds(int minutes) {
        return secondsOfMinutes * minutes;
    }


}
