package service;

import entity.Passenger;

import java.util.List;

public interface PassengerServiceInterface {

    public abstract List<Passenger> getAllPassengers();
    public abstract Passenger getPassengerById(Long passengerId);
    public abstract void savePassenger(Passenger passenger);
    public abstract void deletePassengerById(Long passengerId);
}
