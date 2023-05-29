package fr.diginamic.operations;

public class CalculMoyenne {
    private double[] values;
    public CalculMoyenne(){
        this.values = new double[]{};
    }
    public void ajout(double appendedValue){
        if(this.values.length == 0){
            this.values = new double[]{appendedValue};
        } else {
            final double[] NEW_VALUES = new double[this.values.length + 1];
            for(int i=0; i<this.values.length; i++){
                NEW_VALUES[i] = this.values[i];
            }
            NEW_VALUES[NEW_VALUES.length - 1] = appendedValue;
            this.values = NEW_VALUES;
        }
    }
    public double calcul(){
        if(this.values.length < 1){
            throw new ArithmeticException("Medium of empty double table can't work!");
        }
        double medium = 0;
        for(double value: this.values){
            medium += value;
        }
        return medium / this.values.length;
    }
}
