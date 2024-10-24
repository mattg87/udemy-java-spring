package com.SpringCourse.HibernateJPA;

import com.SpringCourse.HibernateJPA.dao.StudentDAO;
import com.SpringCourse.HibernateJPA.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HibernateJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateJpaApplication.class, args);
	}

	public void createStudent(StudentDAO studentDAOParam) {
		System.out.println("Creating student object...");
		Student theStudent = new Student("Joe", "Shmo", "joe@shmo.com");

		System.out.println("Saving student object...");
		studentDAOParam.save(theStudent);

		System.out.println("Saved Student. ID: " + theStudent.getId());
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			createStudent(studentDAO);
		};
	}
}
