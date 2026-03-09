package repository;

import model.Car;
import model.Client;

import java.util.ArrayList;

public class CarRepository implements ICarRepository{
    private ArrayList<Car> car;
    private static CarRepository carRepository;

    private CarRepository() {
        car = new ArrayList<>();
        addInitialCar();
    }



    public static CarRepository getCarRepository() {
        if(carRepository == null){
            carRepository = new CarRepository();
        }
        return carRepository;
    }

    public void add(Car car){
        car.setId(nextIdAvailable());
        car.add(car);
    }

    public void update(Car car ){
        car.set(car.indexOf(findById(car.getId())), car);
    }

    public ArrayList findAll(){
        return car;
    }

    public void deleteById(Long id){
        for (Car car : car) {
            if (car.getId() == id) {
                car.remove(car);
                break;
            }
        }
    }

    public Long nextIdAvailable(){
        if(!car.isEmpty()){
            return car.get(car.size()-1).getId() + 1;
        }
        else{
            return (long)1;
        }
    }

    public Car findById(Long id) {
        for (Car car1 : car) {
            if(car1.getId() == id){
                return car1;
            }
        }
        return null;
    }

    public Client findByDni(String dni){
        for (Client client : clients) {
            if(client.getDni().equals(dni)){
                return client;
            }
        }
        return null;
    }

    public void cleanUp(){
        clients = new ArrayList<>();
    }

    public void addInitialCar(){
        add(new Car("0892HRS", "Redondela", "DS"));
        add(new Car("", "", ""));


}
