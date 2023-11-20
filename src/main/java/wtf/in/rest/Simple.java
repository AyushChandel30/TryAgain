package wtf.in.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Simple {

	@GetMapping("/")
	public ResponseEntity<String> m1 () {
		String msg = "Home page";
		return new ResponseEntity<String> (msg, HttpStatus.OK);
	}
	
}
