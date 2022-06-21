package service;

import entity.Aircraft;
import entity.Airport;
import entity.Flight;
import org.springframework.stereotype.Service;
import repository.AircraftRepository;
import repository.AirportRepository;
import repository.FlightRepository;

@Service
public class AdminService implements AdminServiceInterface {

    private AircraftRepository aircraftRepository;
    private AirportRepository airportRepository;
    private FlightRepository flightRepository;

    @Override
    public void saveAircraft(Aircraft aircraft) {
        if(aircraft==null) throw new IllegalArgumentException();
        aircraftRepository.save(aircraft);
    }

    @Override
    public void deleteAircraftById(Long aircraftId) {
        aircraftRepository.deleteById(aircraftId);
    }

    @Override
    public void saveAirport(Airport airport) {
        airportRepository.save(airport);
    }

    @Override
    public void deleteAirport(Integer airportId) {
        airportRepository.deleteById(airportId);
    }

    @Override
    public void saveFlight(Flight flight) {
        flightRepository.save(flight);
    }

    @Override
    public void deleteFlightById(long flightId) {
        flightRepository.deleteById(flightId);
    }
}
