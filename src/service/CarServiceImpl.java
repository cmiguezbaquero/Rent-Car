package service;

import model.Car;
import model.Client;
import repository.CarRepository;
import repository.ClientRepository;
import repository.ICarRepository;

import java.util.ArrayList;

public class CarServiceImpl implements ICarService{

    private ICarRepository repository;
    public CarServiceImpl() {
         repository = CarRepository.getCarRepository();
    }

    public void add(Car car) {
        repository.add(car);

    }

    public void deleteById(Long id) {

    }

    public ArrayList findAll() {
        return null;
    }

    public Client findByLicensePlate(String licensePlate) {
        return null;
    }

    public void update(Car car) {

    }
}
