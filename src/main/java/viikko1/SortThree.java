package viikko1;

public class SortThree {
    public static String ascending(int a, int b, int c) {
        int x = a, y = b, z = c;
        if (x > y) { int tmp = x; x = y; y = tmp; }
        if (y > z) { int tmp = y; y = z; z = tmp; }
        if (x > y) { int tmp = x; x = y; y = tmp; }
        return x + "," + y + "," + z;
    }
}