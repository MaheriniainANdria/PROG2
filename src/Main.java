import model.Appartement;
import model.Immeuble;
import model.Quartier;
import model.Statut;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Appartement appartement1 = new Appartement("A1", "Appartement Ivandry", "Description 1", 400.000, Statut.LIBRE, null);
        Appartement appartement2 = new Appartement("A2", "Appartement Analamahitsy", "Description 2", 300.000, Statut.OCCUPE, null);
        Appartement appartement3 = new Appartement("A3", "Appartement Alarobia", "Description 3", 500.000, Statut.LIBRE, null);

        Immeuble immeuble1 = new Immeuble("I1", "Immeuble Jade", 5, List.of(appartement1, appartement2));
        Immeuble immeuble2 = new Immeuble("I2", "Immeuble Saphir", 3, List.of(appartement3));

        Quartier quartier = new Quartier("Q1", "Quartier d'Ivandry", List.of(immeuble1, immeuble2));

        boolean present = quartier.contientAppartement(appartement1);
        System.out.println("L'appartement 1 est présent dans le quartier : " + present);

        int totalAppartements = quartier.compterAppartements();
        System.out.println("Nombre total d'appartements dans le quartier : " + totalAppartements);
    }
}

