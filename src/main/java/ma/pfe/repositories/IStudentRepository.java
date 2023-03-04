package ma.pfe.repositories;

import ma.pfe.entities.StudentEntity;

import java.util.List;


public interface IStudentRepository {
    long save(StudentEntity e);
    boolean update(StudentEntity e);
    boolean deleteById(long id);
    List<StudentEntity> selectAll();
}
