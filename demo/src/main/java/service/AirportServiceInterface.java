package service;

import entity.Airport;
import org.springframework.data.domain.Page;

import java.util.List;

public interface AirportServiceInterface {

    public abstract List<Airport> getAllAirports();
    public abstract Airport getAirportById(Integer airportId);
    public abstract void saveAirport(Airport airport);
    public abstract void deleteAirport(Integer airpportId);
}
