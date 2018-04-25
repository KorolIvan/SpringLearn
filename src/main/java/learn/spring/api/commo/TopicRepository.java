package learn.spring.api.commo;

import learn.spring.api.models.Topic;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Ivan Korol on 4/25/2018
 */
public interface TopicRepository extends CrudRepository<Topic, String> {

}
