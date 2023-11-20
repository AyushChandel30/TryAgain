package wtf.in.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import wtf.in.entity.Animal;
import wtf.in.service.AnimalService;

@RestController
public class Simple {

	private AnimalService as;
	
	@Autowired
	public Simple(AnimalService as) {
		this.as = as;
	}
	
	@GetMapping("/")
	public ResponseEntity<String> m1 () {
		String msg = "Home page";
		return new ResponseEntity<String> (msg, HttpStatus.OK);
	}
	
	@PostMapping(value="/adding")
	public ResponseEntity<String> add (@RequestBody Animal a1) {
		String msg = as.upsert(a1);
		return new ResponseEntity<String> (msg, HttpStatus.CREATED);
	}
	
	@PutMapping(value ="/updating")
	public ResponseEntity<String> update (@RequestBody Animal a2) {
		String msg = as.upsert(a2);
		return new ResponseEntity<String> (msg, HttpStatus.OK);		
	}
	
	@GetMapping (value="getting/{i1}")
	public ResponseEntity<Optional<Animal>> get (@PathVariable("i1") Integer i1){
		Optional<Animal> animal = as.getAnimal(i1);
		return new ResponseEntity<Optional<Animal>> (animal, HttpStatus.OK);
	}

	@DeleteMapping(value="/delete/{i2}")
	public ResponseEntity<String> delete (@PathVariable("i2") Integer i2){
		String removeAnimal = as.removeAnimal(i2);
		return new ResponseEntity<String> (removeAnimal, HttpStatus.OK);
	}

}
