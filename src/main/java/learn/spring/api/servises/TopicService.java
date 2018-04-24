package learn.spring.api.servises;

import learn.spring.api.models.Topic;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @author Ivan Korol on 4/24/2018
 */
@Service
public class TopicService {
    private List<Topic> topics = Arrays.asList(
            new Topic("1", "Spring", "Spring description"),
            new Topic("2", "java", "java description"),
            new Topic("3", "java-script", "java-script description"),
            new Topic("4", "Spring-boot", "Spring-boot description")
    );

    public List<Topic> getTopics() {
        return topics;
    }
}
