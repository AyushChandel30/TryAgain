package wtf.in.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import wtf.in.entity.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {

}
