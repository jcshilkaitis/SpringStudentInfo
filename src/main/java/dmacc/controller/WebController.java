package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.StudentInfo;
import dmacc.repository.StudentRepository;

/**
 * @author Joe Shilkaitis - jshilkaitis
 * CIS175 - Fall 2022
 * Oct 29, 2022
 */
@Controller
public class WebController {
	@Autowired
	StudentRepository repo;

	@GetMapping("/viewAllStudents")
	public String viewAllStudents(Model model) {
		if (repo.findAll().isEmpty()) {
			return addNewStudent(model);
		}
		model.addAttribute("studentinfo", repo.findAll());
		return "viewAllStudents";
	}

	@GetMapping("/addStudent")
	public String addNewStudent(Model model) {
		StudentInfo si = new StudentInfo();
		model.addAttribute("newStudent", si);
		return "addStudent";
	}

	@PostMapping("/addStudent")
	public String addNewStudent(@ModelAttribute StudentInfo si, Model model) {
		repo.save(si);
		return viewAllStudents(model);
	}

	@GetMapping("/editStudent/{id}")
	public String editStudent(@PathVariable("id") long id, Model model) {
		StudentInfo si = repo.findById(id).orElse(null);
		model.addAttribute("newStudent", si);
		return "editStudent";
	}

	@PostMapping("/updateStudent/{id}")
	public String updateStudent(StudentInfo si, Model model) {
		repo.save(si);
		return viewAllStudents(model);
	}

	@GetMapping("/deleteStudent/{id}")
	public String deleteUser(@PathVariable("id") long id, Model model) {
		StudentInfo si = repo.findById(id).orElse(null);
		repo.delete(si);
		return viewAllStudents(model);
	}
}
