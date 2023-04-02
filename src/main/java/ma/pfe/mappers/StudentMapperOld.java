/*package ma.pfe.mappers;

import ma.pfe.dtos.StudentDTO;
import ma.pfe.entities.StudentEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component(value="mapper1")
public class StudentMapper {
    private static final Logger LOGGER = LoggerFactory.getLogger(StudentMapper.class);
    public StudentEntity convetDTOtoENTITY(StudentDTO dto){
        StudentEntity entity = new StudentEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        return entity;
    }
    public StudentDTO convetENTITYtoDTO(StudentEntity entity){
        StudentDTO dto = new StudentDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }

    public List<StudentEntity> convetDTOStoENTITYS(List<StudentDTO> dtos){
        return dtos.stream().map(dto->convetDTOtoENTITY(dto)).collect(Collectors.toList());
    }
    public  List<StudentDTO> convetENTITYStoDTOS(List<StudentEntity> entitys){
        LOGGER.debug("Start --> convetENTITYStoDTOS StudentMapper1");
        return entitys.stream().map(entity->convetENTITYtoDTO(entity)).collect(Collectors.toList());
    }


}
*/