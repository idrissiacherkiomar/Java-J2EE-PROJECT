package ma.pfe.repositories;

import ma.pfe.entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import java.util.List;


@Repository(value="repository1")
public interface IStudentRepository extends JpaRepository<StudentEntity,Long> {
    /*long save(StudentEntity e);
    boolean update(StudentEntity e);
    boolean deleteById(long id);
    List<StudentEntity> selectAll();*/
}
