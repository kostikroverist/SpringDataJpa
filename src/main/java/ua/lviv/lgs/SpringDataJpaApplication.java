package ua.lviv.lgs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ua.lviv.lgs.domain.Univercity;
import ua.lviv.lgs.service.UnivercityServer;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {

	ConfigurableApplicationContext ctx= SpringApplication.run(SpringDataJpaApplication.class, args);
		UnivercityServer service = ctx.getBean(UnivercityServer.class);

	Univercity univercity = new Univercity();
	univercity.setName("Franka");
	univercity.setAmountOfStudents(33321);
	univercity.setNumberOfInstitutes(23);
	univercity.setUniversityAddress("Франка");

	//sava to db
//		service.save(univercity);

//read from db
		System.out.println(service.findById((long)2));

		System.out.println(service.findByUniversityAddress("шевченка"));


		Univercity updateEror = service.findById((long)3);
		updateEror.setUniversityAddress("Стрийська");

		service.update(updateEror);

		//read all

		service.findAll().stream().forEach(System.out::println);



	}

}
