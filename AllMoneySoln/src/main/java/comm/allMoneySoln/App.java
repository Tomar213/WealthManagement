package comm.allMoneySoln;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import comm.allMoneySoln.Repositoryy.repository;


@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories("comm.allMoneySoln.*")
@ComponentScan(basePackages = { "comm.*" })
//@EntityScan("comm.*")


public class App {
	public static void main(String args[])
	{
		SpringApplication.run(App.class, args);
		
	}

}
