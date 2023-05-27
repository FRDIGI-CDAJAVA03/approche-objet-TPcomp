package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {
    double[] tableauDouble;
    private int LENGTH;

    public CalculMoyenne() {
    }

    public double[] ajout(double[] tableauDouble, double o){
        double[] newTab = new double[this.tableauDouble.length+1];
        for (int i = 0; i < this.tableauDouble.length; i++) {
            newTab[i] += this.tableauDouble[i];
        }
        newTab[newTab.length-1] = o;
        this.tableauDouble = newTab;
        return this.tableauDouble;
    }

    public double calculMoyenn(){
        double val = 0.0;
        for (int i = 0; i < this.tableauDouble.length; i++) {
            val += this.tableauDouble[i];
        }
        return val/this.tableauDouble.length;
    }

    public double[] getTableauDouble() {
        return tableauDouble;
    }

    public void setTableauDouble(double[] tableauDouble) {
        this.tableauDouble = tableauDouble;
    }

    public int getLENGTH() {
        return LENGTH;
    }

    @Override
    public String toString() {
        return "tableauDouble = " + Arrays.toString(tableauDouble) +
                ", LENGTH=" + LENGTH;
    }
}
