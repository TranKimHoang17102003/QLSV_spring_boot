package net.codejava.codejava.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import java.util.List;

@Controller
public class AppController {
    @Autowired
    private StudentService service;

    @RequestMapping("/")
    public String viewHomePage(Model model) {
        List<Student> listStudents = service.listAll();
        model.addAttribute("listStudents", listStudents);

        return "index";
    }
}
