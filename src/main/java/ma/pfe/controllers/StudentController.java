package ma.pfe.controllers;

import ma.pfe.dtos.StudentDTO;
import ma.pfe.dtos.StudentIdDTO;
import ma.pfe.services.IStudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Students")
public class StudentController {
    private static final Logger LOGGER = LoggerFactory.getLogger(StudentController.class);

    private IStudentService studentService;

    public StudentController(@Qualifier("service1") IStudentService service){
        this.studentService = service;
    }

    @PostMapping
    public long save(@RequestBody StudentDTO stDTO) {
        LOGGER.debug("Start --> save in StudentController");
        LOGGER.debug(stDTO.toString());
        return studentService.save(stDTO);
    }

    @PutMapping
    public long update(@RequestBody StudentDTO stDTO) {
        LOGGER.debug("Start --> update in StudentController");
        return studentService.update(stDTO);
    }

    @DeleteMapping("/{id}/{code}")
    public boolean deleteById(@PathVariable("id") long id,@PathVariable("code") String code) {
        LOGGER.debug("Start --> method select by id = {} and code = {} in StudentController",id,code);
        StudentIdDTO idStudent =new StudentIdDTO(id,code);
        return studentService.deleteById(idStudent);
    }

    @GetMapping
    public List<StudentDTO> selectAll() {
        LOGGER.debug("Start --> selectAll in StudentController");
        return studentService.selectAll();
    }

    @GetMapping("/{id}/{code}")
    public StudentDTO selectById(@PathVariable("id") long id,@PathVariable("code") String code) {
        LOGGER.debug("Start --> method select by id {} , code {} in StudentController",id,code);
        StudentIdDTO idStudent = new StudentIdDTO(id,code);
        return studentService.selectById(idStudent);
    }
}
