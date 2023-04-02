package ma.pfe.services;

import ma.pfe.dtos.StudentDTO;
import ma.pfe.dtos.StudentIdDTO;

import java.util.List;

public interface IStudentService {
    long save(StudentDTO stDTO);
    long update(StudentDTO stDTO);
    boolean deleteById(StudentIdDTO idStudent);
    List<StudentDTO> selectAll();
    StudentDTO selectById(StudentIdDTO idDto);
}
