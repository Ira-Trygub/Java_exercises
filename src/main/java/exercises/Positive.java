package exercises;

public class Positive {
    public static int sum(int[] arr) {
        int sum = 0;
//        for (int i = 0; i < arr.length ; i++) {
//            sum += (arr[i] > 0) ? arr[i] : 0;
        for (int j : arr) {
            sum += Math.max(j, 0);
        }
        return sum;
    }

    public static String remove(String str) {
        return str.substring(1, str.length() - 1);


    }

    public static int makeNegative(final int x) {

        return (x > 0) ? -x : x;
    }


    public static String solution(String str) {
        String new_str = "";
        for (int i = 0; i < str.length(); i++) {
            new_str += str.charAt(str.length() - i - 1);
        }
        return new_str;
    }

    public static int summation(int n) {
        int res = 0;
        for (int i = 0; i<= n; i++) {
    res += i;
        }
        return res;
    }

    static String noSpace(final String x) {
       return x.replaceAll(" ", "");
    }

    public static String boolToWord(boolean b)
    {
        return (b == true) ? "Yes" : "No";
    }

    public static String numberToString(int num) {
        return String.valueOf(num);
    }

    public int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
        for ( Boolean i : arrayOfSheeps) {
          count += (i) ? 1 : 0;
        };
        return count;
    }

}