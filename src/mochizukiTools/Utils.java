package mochizukiTools;

public class Utils {
    public static class Colors {
        public static final String ANSI_RESET = "\u001B[0m";
        public static final String ANSI_BLACK = "\u001B[30m";
        public static final String ANSI_RED = "\u001B[31m";
        public static final String ANSI_GREEN = "\u001B[32m";
        public static final String ANSI_YELLOW = "\u001B[33m";
        public static final String ANSI_BLUE = "\u001B[34m";
        public static final String ANSI_PURPLE = "\u001B[35m";
        public static final String ANSI_CYAN = "\u001B[36m";
        public static final String ANSI_WHITE = "\u001B[37m";
    }


    public static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                Runtime.getRuntime().exec("cls");
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (final Exception e) {
            System.out.println("ca merde");
        }
    }

    public static void msgPrompt(String i_str) {
        System.out.printf("[%sprompt%s]%s%s%s\n", Colors.ANSI_PURPLE, Colors.ANSI_RESET, Colors.ANSI_PURPLE, i_str, Colors.ANSI_RESET);
    }

    public static void msgWarning(String i_str) {
        System.out.printf("[%swarning%s]%s\n", Colors.ANSI_YELLOW, Colors.ANSI_RESET, i_str);
    }

    public static void msgError(String i_str) {
        System.out.printf("[%sError%s]%s\n", Colors.ANSI_RED, Colors.ANSI_RESET, i_str);
    }

    public static void msgResult(String i_str) {
        System.out.printf("[%sresult%s]%s%s%s\n", Colors.ANSI_GREEN, Colors.ANSI_RESET, Colors.ANSI_GREEN, i_str, Colors.ANSI_RESET);
    }

    public static void msgTitle(String i_str) {
        System.out.printf("[%stitle%s]%s%s%s\n", Colors.ANSI_PURPLE, Colors.ANSI_RESET, Colors.ANSI_PURPLE, i_str, Colors.ANSI_RESET);
    }

    public static void msgInfo(String i_str) {
        System.out.printf("[%sinfo%s]%s%s%s\n", Colors.ANSI_BLUE, Colors.ANSI_RESET, Colors.ANSI_BLUE, i_str, Colors.ANSI_RESET);
    }

    public static void msgDebug(String i_str) {
        System.out.printf("[%sDEBUG%s]%s%s%s\n", Colors.ANSI_CYAN, Colors.ANSI_RESET, Colors.ANSI_CYAN, i_str, Colors.ANSI_RESET);
    }

    public static int generateRandomInt(int i_min, int i_max) {
        double randomDouble = Math.random();
        randomDouble = randomDouble * i_max + i_min;
        return (int) randomDouble;
    }

    public static void beep() {
        java.awt.Toolkit.getDefaultToolkit().beep();
    }

    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
