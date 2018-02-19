package me.celler;

import me.celler.model.Wine;
import me.celler.repositories.WineRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CellerApplication {

	@Autowired
	private WineRespository repository;

	public static void main(String[] args) {
		SpringApplication.run(CellerApplication.class, args);
	}

	@Bean
	CommandLineRunner init(WineRespository domainRepository) {
		return args -> {
			repository.deleteAll();

			// save a couple of customers
			repository.save(new Wine("Name1", "http://placehold.it/460x250/e67e22/ffffff&text=HTML5", "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut",
							500,"Grapes","Country","Region",2001));
			repository.save(new Wine("Name2", "http://placehold.it/460x250/e67e22/ffffff&text=HTML5", "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut",
							500,"Grapes","Country","Region",2001));
			repository.save(new Wine("Name3", "http://placehold.it/460x250/e67e22/ffffff&text=HTML5", "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut",
							500,"Grapes","Country","Region",2001));
		};

	}

}
