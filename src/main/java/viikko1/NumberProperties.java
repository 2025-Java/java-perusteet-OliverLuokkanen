package viikko1;

public class NumberProperties {
    public static String describe(int n) {
        if (n == 0) return "nolla";
        boolean isPositive = n > 0;
        boolean isEven = n % 2 == 0;
        if (isPositive && isEven) return "positiivinen parillinen";
        if (isPositive && !isEven) return "positiivinen pariton";
        if (!isPositive && isEven) return "negatiivinen parillinen";
        if (!isPositive && !isEven) return "negatiivinen pariton";
        return "";
    }
}