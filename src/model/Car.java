package model;

import java.util.ArrayList;

public class Car {

    private Long id;
    private String licensePlate;
    private ArrayList<Rental> rentals;
    private RentalOffice rentalOffice;
    private Model model;

    public Car(Long id, String licensePlate, RentalOffice rentalOffice, Model model) {
        this.id = id;
        this.licensePlate = licensePlate;
        this.rentals = new ArrayList<>();
        this.rentalOffice = rentalOffice;
        this.model = model;
    }

    public Car(String licensePlate, RentalOffice rentalOffice, Model model) {
        this.licensePlate = licensePlate;
        this.rentals = new ArrayList<>();
        this.rentalOffice = rentalOffice;
        this.model = model;
    }

    public Long getId() {
        return id;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public ArrayList<Rental> getRentals() {
        return rentals;
    }

    public RentalOffice getRentalOffice() {
        return rentalOffice;
    }

    public Model getModel() {
        return model;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void setRentals(ArrayList<Rental> rentals) {
        this.rentals = rentals;
    }

    public void setRentalOffice(RentalOffice rentalOffice) {
        this.rentalOffice = rentalOffice;
    }

    public void setModel(Model model) {
        this.model = model;
    }

}
