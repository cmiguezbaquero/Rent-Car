package service;

import model.Model;
import repository.IModelRepository;
import repository.ModelRepository;

import java.util.ArrayList;

public class ModelServiceImpl implements IModelService {

    public IModelRepository repository;
    public ModelServiceImpl(){
        repository = ModelRepository.getModelRepository();
    }

    public void add (Model model){
        repository.add(model);
    }

    public void deleteById (Long id){
        repository.deleteById(id);
    }

    public ArrayList findAll(){
        return repository.findAll();
    }

    public Model findByName (String name){
        return repository.findByName (name);
    }

    public void update(Model model){
        repository.update(model);
    }
}
