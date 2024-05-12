package patternAbstractFactory.services;

import patternAbstractFactory.entities.Automobile;
import patternAbstractFactory.entities.Scooter;

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
