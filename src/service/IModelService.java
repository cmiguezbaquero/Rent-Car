package service;

import model.Model;

import java.util.ArrayList;

public interface IModelService {

    Model findByName (String name);
    void add (Model model);
    void deleteById(Long id);
    ArrayList findAll();
    void update(Model model);
}
