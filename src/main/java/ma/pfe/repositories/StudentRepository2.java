/*package ma.pfe.repositories;

import ma.pfe.entities.StudentEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository(value="repository2")
public class StudentRepository2 implements IStudentRepository {
    private static final Logger LOGGER = LoggerFactory.getLogger(StudentRepository2.class);
    @Override
    public long save(StudentEntity e) {
        LOGGER.debug("Start --> save ");
        return 115;
    }

    @Override
    public boolean update(StudentEntity e) {
        LOGGER.debug("Start --> update ");
        return true;
    }

    @Override
    public boolean deleteById(long id) {
        LOGGER.debug("Start --> deleteById ");
        return true;
    }

    @Override
    public List<StudentEntity> selectAll() {
        LOGGER.debug("Start --> selectAll StudentRepository2");
        return new ArrayList<>();
    }
}
*/