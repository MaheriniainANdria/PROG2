package model;

import java.util.List;

public class Quartier extends Endroit {
    private List<Immeuble> immeubles;

    public Quartier(String id, String nom, List<Immeuble> immeubles) {
        super(id, nom);
        this.immeubles = immeubles;
    }

    @Override
    public int compterAppartements() {
        return immeubles.stream().mapToInt(Immeuble::compterAppartements).sum();
    }

    public List<Immeuble> getImmeubles() {
        return immeubles;
    }

    public boolean contientAppartement(Appartement appartement) {
        return immeubles.stream().anyMatch(immeuble ->
                immeuble.getAppartements().contains(appartement)
        );
    }
}

