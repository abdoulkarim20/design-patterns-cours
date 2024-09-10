package patterns.patternAbstractFactory.services;

import patterns.patternAbstractFactory.entities.Automobile;
import patterns.patternAbstractFactory.entities.Scooter;

public class VehiculeImpl implements IVehicule{
    @Override
    public Automobile createAutomobile(Automobile automobile) {
        return automobile;
    }

    @Override
    public Scooter createScooter(Scooter scooter) {
        return scooter;
    }
}
