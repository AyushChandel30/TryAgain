package wtf.in.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wtf.in.entity.Animal;
import wtf.in.repo.AnimalRepository;

@Service
public class AnimalServiceImp implements AnimalService {
	
	private AnimalRepository ar;
	
	@Autowired
	public AnimalServiceImp (AnimalRepository ar) {
		this.ar =ar;
	}

	@Override
	public String upsert(Animal p) {
		ar.save(p);
		return "Record recieved successfully";
	}

	@Override
	public Optional<Animal> getAnimal(Integer i1) {
		Optional<Animal> findById = ar.findById(i1);
		return findById;
	}

	@Override
	public String removeAnimal(Integer i2) {
		ar.deleteById(i2);
		return "Record deleted";
	}
	
	

}
