package ma.pfe.services;

import ma.pfe.dtos.GroupDTO;

import java.util.List;

public interface IGroupService {

    long save(GroupDTO grp);
    long update(GroupDTO grp);
    boolean deleteById(Long id);
    List<GroupDTO> selectAll();
    GroupDTO selectById (Long id);
}
