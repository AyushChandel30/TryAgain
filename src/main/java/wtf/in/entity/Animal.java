package wtf.in.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table (name="Jaanver")
@Entity
public class Animal {

	@Id
	@Column (name="kramaank")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer number;
	@Column (name="GharKaNaam")
	private String petName;
	@Column (name="JaanverKaNaam")
	private String animalName;
	
}
