package com.kadiraksoy.SpringBootMongoDb;

import com.kadiraksoy.SpringBootMongoDb.model.Address;
import com.kadiraksoy.SpringBootMongoDb.model.Gender;
import com.kadiraksoy.SpringBootMongoDb.model.Student;
import com.kadiraksoy.SpringBootMongoDb.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

@SpringBootApplication
public class SpringBootMongoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMongoDbApplication.class, args);
	}

//	@Bean
//	CommandLineRunner runner(StudentRepository studentRepository){
//		return args -> {
//			Address address = new Address("İstanbul","34","Türkiye");
//			Student student = new Student("kadir",
//					"aksoy",
//					"kadir.aksoy@outlook.com.tr",
//					Gender.MALE,
//					address,
//					List.of("Computer Science"),
//					BigDecimal.TEN,
//					LocalDateTime.now()
//			);
//
//			studentRepository.insert(student);
//		};
//	}

}
