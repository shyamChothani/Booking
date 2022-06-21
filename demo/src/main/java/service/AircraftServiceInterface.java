package service;

import entity.Aircraft;

import java.util.List;

public interface AircraftServiceInterface {

    public abstract List<Aircraft> getAllAircrafts();
    public abstract Aircraft getAircraftById(Long aircraftId);
    public abstract void saveAircraft (Aircraft aircraft);
    public abstract void deleteAircraftById(Long aircraftId);
}
