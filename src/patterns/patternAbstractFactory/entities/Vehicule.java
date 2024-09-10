package patterns.patternAbstractFactory.entities;

public abstract class Vehicule {
    private String model;
    private String couleur;
    private int puissance;

    public Vehicule() {
    }

    public Vehicule(String model, String couleur, int puissance) {
        this.model = model;
        this.couleur = couleur;
        this.puissance = puissance;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }
    public abstract void afficherCaracteristique();
}
