package service;


import entity.Aircraft;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import repository.AircraftRepository;

import java.util.List;

@Service
public class AircraftService implements AircraftServiceInterface {
    @Autowired
    private AircraftRepository aircraftRepository;



    @Override
    public List<Aircraft> getAllAircrafts() {
        return aircraftRepository.findAll();
    }

    @Override
    public Aircraft getAircraftById(Long aircraftId) {
        return aircraftRepository.findById(aircraftId).orElse(null);
    }

    @Override
    public void saveAircraft(Aircraft aircraft) {
        if(aircraft==null) throw new IllegalArgumentException();
        aircraftRepository.save(aircraft);
    }

    @Override
    public void deleteAircraftById(Long aircraftId) {
        aircraftRepository.deleteById(aircraftId);
    }
}
