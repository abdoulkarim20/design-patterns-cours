package patternAbstractFactory.services;

import patternAbstractFactory.entities.Automobile;
import patternAbstractFactory.entities.Scooter;

public interface IVehicule {
    Automobile createAutomobile(Automobile automobile);
    Scooter createScooter(Scooter scooter);
}
