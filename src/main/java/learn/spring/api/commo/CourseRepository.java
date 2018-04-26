package learn.spring.api.commo;

import learn.spring.api.models.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Ivan Korol on 4/26/2018
 */
public interface CourseRepository extends CrudRepository<Course, String> {

    public List<Course> findByTopicId(String topicId);
}
