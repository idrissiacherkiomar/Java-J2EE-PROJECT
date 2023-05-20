package ma.pfe.repositories;
import ma.pfe.entities.GroupEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

@Repository(value="GroupRepository")
public interface IGroupRepository extends JpaRepository<GroupEntity, Long>{
    CrudRepository r1=null;
    PagingAndSortingRepository r2=null;
}
