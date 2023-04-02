package ma.pfe.repositories;

import ma.pfe.entities.StudentEntity;
import ma.pfe.entities.StudentId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;


import javax.swing.*;

//import java.util.List;


@Repository(value="repository1")
public interface IStudentRepository extends JpaRepository<StudentEntity, StudentId> {

    CrudRepository r1=null;
    PagingAndSortingRepository r2=null;
    /*long save(StudentEntity e);
    boolean update(StudentEntity e);
    boolean deleteById(long id);
    List<StudentEntity> selectAll();*/
}
