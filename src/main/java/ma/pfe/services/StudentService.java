package ma.pfe.services;

import ma.pfe.dtos.StudentDTO;
import ma.pfe.mappers.StudentMapper;
import ma.pfe.repositories.IStudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value="service1")
public class StudentService implements  IStudentService{
    private static final Logger LOGGER = LoggerFactory.getLogger(StudentService.class);

    private IStudentRepository repository;
    private StudentMapper mapper;

    public StudentService(@Qualifier("repository2") IStudentRepository repository,@Qualifier("mapper1") StudentMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public long save(StudentDTO e) {
        LOGGER.debug("Start --> save ");
        return repository.save(mapper.convetDTOtoENTITY(e));
    }

    @Override
    public boolean update(StudentDTO e) {
        LOGGER.debug("Start --> update ");
        return repository.update(mapper.convetDTOtoENTITY(e));
    }

    @Override
    public boolean deleteById(long id) {
        LOGGER.debug("Start --> deleteById ");
        return repository.deleteById(id);
    }

    @Override
    public List<StudentDTO> selectAll() {
        LOGGER.debug("Start --> selectAll StudentService1");
        return mapper.convetENTITYStoDTOS(repository.selectAll());
    }
}
