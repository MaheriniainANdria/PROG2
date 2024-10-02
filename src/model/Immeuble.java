package model;

import java.util.List;

public class Immeuble extends Endroit {
    private int nombreEtages;
    private List<Appartement> appartements;

    public Immeuble(String id, String nom, int nombreEtages, List<Appartement> appartements) {
        super(id, nom);
        this.nombreEtages = nombreEtages;
        this.appartements = appartements;
    }

    public int getNombreEtages() {
        return nombreEtages;
    }

    @Override
    public int compterAppartements() {
        return appartements.size();
    }

    public List<Appartement> getAppartements() {
        return appartements;
    }
}

