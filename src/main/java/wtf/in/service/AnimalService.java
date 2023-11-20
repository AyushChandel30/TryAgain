package wtf.in.service;

import java.util.Optional;

import wtf.in.entity.Animal;


public interface AnimalService {
	
	public String upsert (Animal p);
	public Optional<Animal> getPlayer (Integer i1);
	public String removePlayer (Integer i2);

}
