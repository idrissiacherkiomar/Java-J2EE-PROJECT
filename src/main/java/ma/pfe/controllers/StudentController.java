package ma.pfe.controllers;

import ma.pfe.dtos.StudentDTO;
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

    private IStudentService service;

    public StudentController(@Qualifier("service1") IStudentService service){
        this.service = service;
    }

    @PostMapping
    public long save(@RequestBody StudentDTO e) {
        LOGGER.debug("Start --> save ");
        return service.save(e);
    }

    @PutMapping
    public long update(@RequestBody StudentDTO e) {
        LOGGER.debug("Start --> update ");
        return service.update(e);
    }

    @DeleteMapping("/{ids}")
    public boolean deleteById(@PathVariable("ids") long id) {
        LOGGER.debug("Start --> deleteById ");
        return service.deleteById(id);
    }

    @GetMapping
    public List<StudentDTO> selectAll() {
        LOGGER.debug("Start --> selectAll StudentController1");
        return service.selectAll();
    }

}
