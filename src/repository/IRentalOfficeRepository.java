package repository;

import model.RentalOffice;

import java.util.ArrayList;

public interface IRentalOfficeRepository {

    RentalOffice findByAddress (String address);
    void add (RentalOffice rentalOffice);
    void deleteById (Long id);
    ArrayList findAll();
    RentalOffice findById(Long id);
    void update(RentalOffice rentalOffice);
}
