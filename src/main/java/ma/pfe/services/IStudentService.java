package ma.pfe.services;

import ma.pfe.dtos.StudentDTO;

import java.util.List;

public interface IStudentService {
    long save(StudentDTO e);
    long update(StudentDTO e);
    boolean deleteById(long id);
    List<StudentDTO> selectAll();
}
