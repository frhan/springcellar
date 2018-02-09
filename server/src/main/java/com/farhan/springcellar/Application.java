package com.farhan.springcellar;

import com.farhan.springcellar.domain.Wine;
import com.farhan.springcellar.repository.WineRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	@Autowired
	private WineRespository repository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner init(WineRespository domainRepository) {
		return args -> {
			repository.deleteAll();

			// save a couple of customers
			repository.save(new Wine("Name1","http://placehold.it/460x250/e67e22/ffffff&text=HTML5","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, ",500,"ABCD"));
			repository.save(new Wine("Name12","http://placehold.it/460x250/e67e22/ffffff&text=HTML5","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, ",400,"ABCD"));
			repository.save(new Wine("Name13","http://placehold.it/460x250/e67e22/ffffff&text=HTML5","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, ",503,"ABCD"));

		};

	}


		public void run(String... args) throws Exception {

		repository.deleteAll();

		// save a couple of customers
		repository.save(new Wine("Name1","http://placehold.it/460x250/e67e22/ffffff&text=HTML5","description 1",500,"ABCD"));
		repository.save(new Wine("Name12","http://placehold.it/460x250/e67e22/ffffff&text=HTML5","description 2",400,"ABCD"));
		repository.save(new Wine("Name13","http://placehold.it/460x250/e67e22/ffffff&text=HTML5","description 2",503,"ABCD"));

		// fetch all customers
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Wine customer : repository.findAll()) {
			System.out.println(customer);
		}
		System.out.println();

		// fetch an individual customer
		System.out.println("Customer found with findByFirstName('Alice'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByName("Alice"));

		System.out.println("Customers found with findByLastName('Smith'):");
		System.out.println("--------------------------------");
		for (Wine customer : repository.findByGrapes("Smith")) {
			System.out.println(customer);
		}

	}

}