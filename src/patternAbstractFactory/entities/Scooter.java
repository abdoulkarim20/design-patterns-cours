package patternAbstractFactory.entities;

public class Scooter extends Vehicule {
    public Scooter() {
    }

    public Scooter(String model, String couleur, int puissance) {
        super(model, couleur, puissance);
    }

    @Override
    public void afficherCaracteristique() {
        System.out.println("Le model du scooter est: " + getModel() + "\nLa couleur du scooter est: " + getCouleur() + "\nLa puissance du scooter est: " + getPuissance());
    }
}
