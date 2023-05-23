package com.controller;


	import java.util.List;
	import java.util.Optional;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestParam;
	import org.springframework.web.bind.annotation.RestController;

	import com.entity.Student;
	import com.repository.StudentRepository;
	@RestController
	public class StudentController {

		@Autowired
		StudentRepository sr;
		@PostMapping("/stud")                                   
	    public String m3() {
		return "Hello Student";
	}
	@PostMapping("/savestudent")
	public void savestudent(@RequestBody Student s) {      
		sr.save(s);
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getStream());
		System.out.println(s.getYop());
	}
	@GetMapping("/getstudent")
	public Student getStudent(@RequestParam int id) {      
		Optional<Student> oe=sr.findById(id);
		return oe.get();     
	}
	@GetMapping("/getallstudentdata")
	public List<Student>getAllStudents(){                     
		return sr.findAll();	
	}

	@DeleteMapping("/deletestudentdata")
	public String deleteemployee(@RequestParam int id) {    
		sr.deleteById(id);
		return "Deleted succesfully";
		
	}
	@PutMapping("/updatestudentdata")
	public void updateEmployeeData(@RequestBody Student s) {               
	 sr.save(s);
	}

		}


