package com.SpringCourse.HibernateJPA;

import com.SpringCourse.HibernateJPA.dao.StudentDAO;
import com.SpringCourse.HibernateJPA.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class HibernateJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateJpaApplication.class, args);
	}

	private void createStudent(StudentDAO studentDAOParam) {
		System.out.println("Creating student object...");
		Student theStudent = new Student("Bob", "Shmo", "joe@shmo.com");

		System.out.println("Saving student object...");
		studentDAOParam.save(theStudent);

		System.out.println("Saved Student. ID: " + theStudent.getId());
	}

	private void queryForStudents(StudentDAO studentDAO) {
		List<Student> listOfStudents = studentDAO.findAll();

		for (Student aStudent: listOfStudents) {
			System.out.println(aStudent);
		}
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			//createStudent(studentDAO);

			queryForStudents(studentDAO);
		};
	}
}
