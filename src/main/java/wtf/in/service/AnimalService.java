package wtf.in.service;

import java.util.List;
import java.util.Optional;

import wtf.in.entity.Animal;


public interface AnimalService {
	
	public String upsert (Animal p);
	public Optional<Animal> getAnimal (Integer i1);
	public String removeAnimal (Integer i2);
	public List<Animal> getAllAnimal();

}
