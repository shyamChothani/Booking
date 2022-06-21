package service;

import entity.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import repository.AirportRepository;

import java.util.List;

@Service
public class AirportService implements AirportServiceInterface {

    private AirportRepository airportRepository;

    @Autowired
    public AirportService(AirportRepository airportRepository){
        this.airportRepository = airportRepository;
    }


    @Override
    public List<Airport> getAllAirports() {
        return airportRepository.findAll();
    }

    @Override
    public Airport getAirportById(Integer airportId) {
        return airportRepository.findById(airportId).orElse(null);
    }



    @Override
    public void saveAirport(Airport airport) {
        airportRepository.save(airport);
    }

    @Override
    public void deleteAirport(Integer airportId) {
        airportRepository.deleteById(airportId);
    }
}