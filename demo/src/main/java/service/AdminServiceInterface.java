package service;

import entity.Aircraft;
import entity.Airport;
import entity.Flight;

public interface AdminServiceInterface {
    public abstract void saveAircraft (Aircraft aircraft);
    public abstract void deleteAircraftById(Long aircraftId);
    public abstract void saveAirport(Airport airport);
    public abstract void deleteAirport(Integer airpportId);
    public abstract void saveFlight(Flight flight);
    public abstract void deleteFlightById(long flightId);
}
