package viikko1;

public class PasswordAttempts {
    public static String login(String[] tries) {
        String correct = "java123";
        int maxTries = Math.min(tries.length, 3);
        for (int i = 0; i < maxTries; i++) {
            if (tries[i].equals(correct)) {
                return "Tervetuloa!";
            }
        }
        return "Liian monta virheellistä yritystä.";
    }
}