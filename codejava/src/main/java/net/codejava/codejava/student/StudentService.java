package net.codejava.codejava.student;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class StudentService {
    @Autowired
    private StudentRepository repo;

    public List<Student> listAll() {
        return repo.findAll();
    }
}
