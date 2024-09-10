package patterns.patternAbstractFactory.client;

import patterns.patternAbstractFactory.entities.Automobile;
import patterns.patternAbstractFactory.entities.Scooter;
import patterns.patternAbstractFactory.services.IVehicule;
import patterns.patternAbstractFactory.services.VehiculeImpl;

public class VehiculeClient {
    public static void main(String[] args) {
        IVehicule iVehicule = new VehiculeImpl();
        Automobile automobile = new Automobile();
        automobile.setModel("Carburant");
        automobile.setCouleur("Rouge");
        automobile.setPuissance(57676);
        automobile.setEspace(2.0);
        System.out.println("----------------Scooter informations-------------------");
        iVehicule.createAutomobile(automobile);
        Scooter scooter=new Scooter("Neuve","Verte",2534);
        iVehicule.createScooter(scooter);
        scooter.afficherCaracteristique();
        System.out.println("----------------Automobile informations-------------------");
        automobile.afficherCaracteristique();
    }
}
