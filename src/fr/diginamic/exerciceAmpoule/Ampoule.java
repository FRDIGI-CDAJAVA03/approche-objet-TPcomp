package fr.diginamic.exerciceAmpoule;

import mochizukiTools.Utils;

public class Ampoule {
    private static boolean etat;

    public Ampoule() {
        setEtat(false);
    }

    public void clic() {
        Utils.msgInfo("clic...");
        if (getEtat()) {
            setEtat(false);
            Utils.msgResult(this.toString());
        } else {
            setEtat(true);
            Utils.msgResult(this.toString());
        }
        Utils.beep();
    }

    public static boolean getEtat() {
        return etat;
    }

    public static void setEtat(boolean etat) {
        Ampoule.etat = etat;
    }

    @Override
    public String toString() {
        String strEtat = null;
        if (getEtat()) strEtat = "Allumée";
        else strEtat = "Eteinte";
        return strEtat;
    }
}
