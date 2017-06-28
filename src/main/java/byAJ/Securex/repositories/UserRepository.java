package byAJ.Securex.repositories;

import byAJ.Securex.models.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by student on 6/28/17.
 */
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
