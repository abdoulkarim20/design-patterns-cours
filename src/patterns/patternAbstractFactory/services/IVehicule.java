package patterns.patternAbstractFactory.services;

import patterns.patternAbstractFactory.entities.Automobile;
import patterns.patternAbstractFactory.entities.Scooter;

public interface IVehicule {
    Automobile createAutomobile(Automobile automobile);
    Scooter createScooter(Scooter scooter);
}
