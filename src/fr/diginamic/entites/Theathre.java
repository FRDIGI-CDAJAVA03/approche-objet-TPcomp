package fr.diginamic.entites;

import java.math.BigDecimal;

public class Theathre {
    private String name;
    private int capacity;
    private int totalClient;
    private BigDecimal recetteTotal;

    public Theathre(String name, int capacity, int totalClient) {
        this.name = name;
        this.capacity = capacity;
        this.totalClient = totalClient;
        if(totalClient != 0){
            this.recetteTotal = BigDecimal.valueOf(totalClient * 12.5);
        }
    }

    public void inscrire(int nbClient, BigDecimal prix) {
        System.out.println("Nombre de client total : " + this.totalClient);
        if(nbClient + this.totalClient >= this.capacity){
            System.out.println("Ooops sorry no place available left.");
        } else if (nbClient <= this.capacity){
            this.totalClient += nbClient;
            BigDecimal recette = prix.multiply(BigDecimal.valueOf(nbClient));
            this.recetteTotal = this.recetteTotal.add(recette);
        }
        System.out.println("Nombre de client total après dernier inscrit : " + this.totalClient);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getTotalClient() {
        return totalClient;
    }

    public void setTotalClient(int totalClient) {
        this.totalClient = totalClient;
    }

    public BigDecimal getRecetteTotal() {
        return recetteTotal;
    }

    public void setRecetteTotal(BigDecimal recetteTotal) {
        this.recetteTotal = recetteTotal;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", totalClient=" + totalClient +
                ", recetteTotal=" + recetteTotal;
    }
}
