package mochizukiTools;

public class Params {
    /*Informations App*/
    public static final String APP_ASCII_LOGO = """
             _____    __                                _              _    __      __    \s
            |  __ \\  /_/                               | |            | |  /\\ \\    / /\\   \s
            | |  | | ___  ___ ___  _   ___   _____ _ __| |_ ___       | | /  \\ \\  / /  \\  \s
            | |  | |/ _ \\/ __/ _ \\| | | \\ \\ / / _ | '__| __/ _ \\  _   | |/ /\\ \\ \\/ / /\\ \\ \s
            | |__| |  __| (_| (_) | |_| |\\ V |  __| |  | ||  __/ | |__| / ____ \\  / ____ \\\s
            |_____/ \\___|\\___\\___/ \\__,_| \\_/ \\___|_|   \\__\\___|  \\____/_/    \\_\\/_/    \\_\\""";
    public static final String APP_TITLE = "Approche Objet - TP Complémentaires";
    public static final String APP_DESCRIPTION = """
            Découverte du langage Java sous l'angle de la Programmation Orientée Objet,
            au travers une suite d'exercices pratiques

            Dans ces exercices vous devrez respecter les principes de la POO :
                -   Encapsulation des données (variables privées avec getters et setters).
                    Attention : Les setters ne seront pas toujours recommandés, notamment dans
                    le cas de classes contenant des variables liées.
                -   Association
                -   Héritage
                    Dans les exercices on ne précisera pas toujours les types des attributs d’instances. Ce sera à
                    vous de choisir les types appropriés.
            """;
    public static final String APP_AUTHOR = "FRDIGI-CDAJAVA03";
    public static final int APP_MAJOR_VERSION = 1;
    public static final int APP_MINOR_VERSION = 0;
    public static final int APP_REVISION_VERSION = 0;
    public static final String DATE = "24/05/2023";
    public static final String APP_REPO = "https://github.com/FRDIGI-CDAJAVA03/approche-objet-TPcomp.git";

    public static void welcomePrompt() {
        Utils.clearConsole();
        System.out.println(Utils.Colors.ANSI_BLUE + APP_ASCII_LOGO + Utils.Colors.ANSI_RESET);
        System.out.println(Utils.Colors.ANSI_GREEN + APP_TITLE.toUpperCase() + " v" + APP_MAJOR_VERSION + "." + APP_MINOR_VERSION + "." + APP_REVISION_VERSION + Utils.Colors.ANSI_RESET);
        System.out.println(Utils.Colors.ANSI_PURPLE + "By " + APP_AUTHOR + " - " + DATE + Utils.Colors.ANSI_RESET);
        System.out.println(Utils.Colors.ANSI_BLUE + "Repository : " + APP_REPO + Utils.Colors.ANSI_RESET);
        System.out.println("\n" + APP_DESCRIPTION);
        System.out.println("========================================================================================");
    }
}
