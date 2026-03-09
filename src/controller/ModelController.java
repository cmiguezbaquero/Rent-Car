package controller;

import model.Model;
import service.IModelService;
import service.ModelServiceImpl;

import java.util.ArrayList;

public class ModelController {

    private IModelService service;
    public ModelController (){
        service = new ModelServiceImpl();
    }

    public void add(Long id, String name, Integer pricePerDay){

        Model model = new Model(id, name, pricePerDay);
        service.add(model);
    }

    public void deleteById (Long id){
        service.deleteById(id);
    }

    public ArrayList findAll (){
        return service.findAll();
    }

    public Model findByName (String name){
        return service.findByName (name);
    }

    public void update (Long id, String name, Integer pricePerDay){
        Model model = new Model(id, name,pricePerDay);
        service.update(model);
    }
}
