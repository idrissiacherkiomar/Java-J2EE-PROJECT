package ma.pfe.services;

import ma.pfe.dtos.GroupDTO;
import ma.pfe.entities.GroupEntity;
import ma.pfe.mappers.StudentMapper;
import ma.pfe.repositories.IGroupRepository;
import org.mapstruct.factory.Mappers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service(value="groupService")
public class GroupeService implements IGroupService{

    private static final Logger LOGGER = LoggerFactory.getLogger(GroupeService.class);
    private IGroupRepository groupRepository;
    private StudentMapper mapper = Mappers.getMapper(StudentMapper.class);

    public GroupeService(@Qualifier("GroupRepository") IGroupRepository groupRepository){
        this.groupRepository = groupRepository;
    }

    @Override
    public long save(GroupDTO grp) {
        LOGGER.debug("Start --> save in GroupService");
        GroupDTO group = mapper.convertGroupEntityToGroupDTO(groupRepository.save(mapper.convertGroupDTOToGroupEntity(grp)));
        return group.getId();
    }

    @Override
    public long update(GroupDTO grp) {
        LOGGER.debug("Start --> update in GroupService");
        GroupDTO group = mapper.convertGroupEntityToGroupDTO(groupRepository.save(mapper.convertGroupDTOToGroupEntity(grp)));
        return group.getId();
    }

    @Override
    public boolean deleteById(Long id) {
        groupRepository.deleteById(id);
        return true;
    }

    @Override
    public List<GroupDTO> selectAll() {
        List<GroupDTO> lstGrp = mapper.convertGroupEntitysToGroupDTOs(groupRepository.findAll());
        return lstGrp;
    }

    @Override
    public GroupDTO selectById(Long id) {
        Optional result = groupRepository.findById(id);
        return mapper.convertGroupEntityToGroupDTO((GroupEntity) result.orElse(null));
    }
}
