package patterns.patternAbstractFactory.entities;

public class Automobile extends Vehicule {
    private double espace;

    public double getEspace() {
        return espace;
    }

    public void setEspace(double espace) {
        this.espace = espace;
    }

    @Override
    public void afficherCaracteristique() {
        System.out.println("Le model de l'automobile est: " + getModel() + "\nLa couleur de l'automobile est: " + getCouleur() + "\nLa puissance de l'automobile est: " + getPuissance() + "\nL'espace de l'automobile est: " + getEspace());
    }
}
