package ma.pfe.mappers;
import ma.pfe.dtos.CoursDTO;
import ma.pfe.dtos.GroupDTO;
import ma.pfe.dtos.StudentDTO;
import ma.pfe.dtos.StudentIdDTO;
import ma.pfe.entities.CoursEntity;
import ma.pfe.entities.GroupEntity;
import ma.pfe.entities.StudentEntity;
import ma.pfe.entities.StudentId;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {

    //Student Class
    public StudentEntity convetDTOtoENTITY(StudentDTO dto);
    public StudentDTO convetENTITYtoDTO(StudentEntity entity);
    public List<StudentEntity> convetDTOStoENTITYS(List<StudentDTO> dtos);
    public  List<StudentDTO> convetENTITYStoDTOS(List<StudentEntity> entitys);


    //StudentId Class
    public StudentId studentIdDTOToStudentId(StudentIdDTO studentIdDTO);
    public StudentIdDTO studentIdToStudentIdDTO(StudentId studentId);


    //Cours Class
    public CoursEntity coursDTOToCoursEntity(CoursDTO coursDTO);
    public List<CoursEntity> coursDTOListToCoursEntityList(List<CoursDTO> list);
    public CoursDTO coursEntityToCoursDTO(CoursEntity coursEntity);
    public List<CoursDTO> coursEntityListToCoursDTOList(List<CoursEntity> list);


    //Groups
    public GroupEntity convertGroupDTOToGroupEntity(GroupDTO grp);
    public List<GroupEntity> convertGroupDTOsToGroupEntitys(List<GroupDTO> grp);
    public GroupDTO convertGroupEntityToGroupDTO(GroupEntity grp);
    public List<GroupDTO> convertGroupEntitysToGroupDTOs(List<GroupEntity> grp);
}
