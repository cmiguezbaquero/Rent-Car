package model;

import java.util.ArrayList;

public class RentalOffice {

    private Long id;
    private String address;
    private Integer feeForDelivery;
    private ArrayList<Car> cars;
    private ArrayList<Rental> rentals;

    public RentalOffice(Long id, String address, Integer feeForDelivery) {
        this.id = id;
        this.address = address;
        this.feeForDelivery = feeForDelivery;
        this.cars = new ArrayList<>();
        this.rentals = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getFeeForDelivery() {
        return feeForDelivery;
    }

    public void setFeeForDelivery(Integer feeForDelivery) {
        this.feeForDelivery = feeForDelivery;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }

    public ArrayList<Rental> getRentals() {
        return rentals;
    }

    public void setRental(Rental rental) {
        this.rentals.add(rental);
    }
}
