package model;

import java.util.ArrayList;

public class Model {

    private Long id;
    private String name;
    private Integer pricePerDay;
    private ArrayList<Car> car;

    public Model(Long id, String name, Integer pricePerDay, ArrayList<Car> car) {
        this.id = id;
        this.name = name;
        this.pricePerDay = pricePerDay;
        this.car = car;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Integer pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public ArrayList<Car> getCar() {
        return car;
    }

    public void setCar(ArrayList<Car> car) {
        this.car = car;
    }
}
