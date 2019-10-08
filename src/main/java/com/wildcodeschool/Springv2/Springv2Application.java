package com.wildcodeschool.Springv2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

@Controller
@SpringBootApplication
public class Springv2Application {

	public static void main(String[] args) {
		SpringApplication.run(Springv2Application.class, args);
	}


	@RequestMapping("/doctors/{id}")
	@ResponseBody
	public String doctors(@PathVariable int id) {
		if (id <= 8 && id >= 1) {
			throw new ResponseStatusException(HttpStatus.SEE_OTHER, "See other");
		}else if (id == 9) {
			return "Christopher Eccleston est l'acteur n°" + id;
		}else if (id == 10) {
			return "David Tennant est l'acteur n°" + id;
		}else if (id == 11) {
			return "Matt Smith est l'acteur n°" + id;
		}else if (id == 12) {
			return "Peter Capaldi est l'acteur n°" + id;
		}else if (id == 13) {
			return "Jodie Whittaker est l'acteur n°" + id;
		}
		throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Impossible de récupérer l'incarnation <numéro de l'incarnation>");
	}
}
