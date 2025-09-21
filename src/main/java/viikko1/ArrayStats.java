package viikko1;

public class ArrayStats {
    public static double average(int[] arr) {
        if (arr == null || arr.length == 0) return 0.0;
        double sum = 0.0;
        for (int n : arr) sum += n;
        return sum / arr.length;
    }
    public static int max(int[] arr) {
        if (arr == null || arr.length == 0) return Integer.MIN_VALUE;
        int max = arr[0];
        for (int n : arr) if (n > max) max = n;
        return max;
    }
}