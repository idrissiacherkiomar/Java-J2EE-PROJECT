package ma.pfe.services;

import ma.pfe.dtos.StudentDTO;
import ma.pfe.dtos.StudentIdDTO;
import ma.pfe.entities.StudentEntity;
import ma.pfe.mappers.StudentMapper;
import ma.pfe.repositories.IStudentRepository;
import org.mapstruct.factory.Mappers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service(value="service1")
public class StudentService implements  IStudentService{
    private static final Logger LOGGER = LoggerFactory.getLogger(StudentService.class);

    private IStudentRepository repository;
    private StudentMapper mapper = Mappers.getMapper(StudentMapper.class);

    public StudentService(@Qualifier("repository1") IStudentRepository repository) { //,@Qualifier("mapper1") StudentMapper mapper
        this.repository = repository;
        //this.mapper = mapper;
    }

    @Override
    public long save(StudentDTO stDTO) {
        LOGGER.debug("Start --> save in StudentService");
        StudentDTO res = mapper.convetENTITYtoDTO(repository.save(mapper.convetDTOtoENTITY(stDTO)));
        return res.getStudentId().getId();
    }

    @Override
    public long update(StudentDTO stDTO) {
        LOGGER.debug("Start --> update in StudentService");
        StudentDTO res = mapper.convetENTITYtoDTO(repository.save(mapper.convetDTOtoENTITY(stDTO)));
        return res.getStudentId().getId();
    }

    @Override
    public boolean deleteById(StudentIdDTO idStudentDto) {
        LOGGER.debug("Start --> deleteById in StudentService");
        repository.deleteById(mapper.studentIdDTOToStudentId(idStudentDto));
        return true;
    }

    @Override
    public List<StudentDTO> selectAll() {
        LOGGER.debug("Start --> selectAll in StudentService");
        return mapper.convetENTITYStoDTOS(repository.findAll());
    }

    @Override
    public StudentDTO selectById(StudentIdDTO idStudentDto) {
        Optional result = repository.findById(mapper.studentIdDTOToStudentId(idStudentDto));
        return mapper.convetENTITYtoDTO((StudentEntity) result.orElse(null));
    }
}
