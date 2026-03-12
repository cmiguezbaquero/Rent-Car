package controller;

import model.RentalOffice;
import service.IRentalOfficeService;
import service.RentalOfficeServiceImpl;

import java.util.ArrayList;

public class RentalOfficeController {

    private IRentalOfficeService service;
    public RentalOfficeController () {
        service = new RentalOfficeServiceImpl();
    }

    public void add (Long id, String address, Integer feeForDelivery){
        RentalOffice rentalOffice = new RentalOffice(id, address, feeForDelivery);
        service.add(rentalOffice);
    }

    public void deleteById(Long id){
        service.deleteById(id);
    }

    public ArrayList findAll(){
        return service.findAll();
    }

    public RentalOffice findByAddress(String address){
        return service.findByAddress(address);
    }

    public void update (Long id, String address, Integer feeForDelivery){
        RentalOffice rentalOffice = new RentalOffice(id,address,feeForDelivery);
        service.update(rentalOffice);
    }
}
