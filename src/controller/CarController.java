package controller;

import model.*;
import service.CarServiceImpl;
import service.ICarService;

import java.util.ArrayList;


public class CarController {
    private ICarService service;
    public CarController() {
        service = new CarServiceImpl();
    }

    public void add (String licensePlate, RentalOffice rentalOffice, Model model){
        Car car = new Car(licensePlate, rentalOffice, model);
        service.add(car);
    }

    public void deleteById(Long id){
        service.deleteById(id);

    }

    public ArrayList findAll(){
        return service.findAll();
    }

    public Client findByLicensePlate(String licensePlate){
        return service.findByLicensePlate(licensePlate);
    }

    public void update(Long id, String licensePlate, RentalOffice rentalOffice, Model model){
        Car car  = new Car(id, licensePlate, rentalOffice, model);
        service.update(car);
    }

}
