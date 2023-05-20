package ma.pfe.controllers;


import ma.pfe.dtos.GroupDTO;
import ma.pfe.services.IGroupService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Groups")
public class GroupController {

    private static final Logger LOGGER = LoggerFactory.getLogger(GroupController.class);
    private IGroupService groupService;
    public GroupController(@Qualifier("groupService") IGroupService groupService){
        this.groupService = groupService;
    }


    @PostMapping
    public long save(@RequestBody GroupDTO grpDTO){
        LOGGER.debug("Start --> save in GroupController");
        return groupService.save(grpDTO);
    }

    @PutMapping
    public long update(@RequestBody GroupDTO grpDTO){
        LOGGER.debug("Start --> update in GroupController");
        return groupService.update(grpDTO);
    }

    @DeleteMapping("/{id}")
    public boolean deleteById(@PathVariable("id") long id){
        LOGGER.debug("Start --> update in deleteByIdController");
        return groupService.deleteById(id);
    }

    @GetMapping
    public List<GroupDTO> selectAll(){
        LOGGER.debug("Start --> update in selectAllController");
        return groupService.selectAll();
    }

    @GetMapping("/{id}")
    public GroupDTO selectById(@PathVariable("id") long id){
        LOGGER.debug("Start --> update in selectByIdController");
        return groupService.selectById(id);
    }

}
