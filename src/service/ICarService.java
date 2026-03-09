package service;

import model.Car;
import model.Client;

import java.util.ArrayList;

public interface ICarService {

    void add(Car car);

    void deleteById(Long id);

    ArrayList findAll();

    Client findByLicensePlate(String licensePlate);

    void update(Car car);
}
