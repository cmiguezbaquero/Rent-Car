package model;

import java.util.ArrayList;

public class RentalOffice {

    private Long id;
    private String address;
    private Integer feeForDelivery;
    private ArrayList<Car> car;
    private ArrayList<Rental> rental;

    public RentalOffice(Long id, String address, Integer feeForDelivery, ArrayList<Car> car, ArrayList<Rental> rental) {
        this.id = id;
        this.address = address;
        this.feeForDelivery = feeForDelivery;
        this.car = car;
        this.rental = rental;
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

    public ArrayList<Car> getCar() {
        return car;
    }

    public void setCar(ArrayList<Car> car) {
        this.car = car;
    }

    public ArrayList<Rental> getRental() {
        return rental;
    }

    public void setRental(ArrayList<Rental> rental) {
        this.rental = rental;
    }
}
