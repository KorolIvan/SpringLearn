package learn.spring.api.servises;

import learn.spring.api.models.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Ivan Korol on 4/24/2018
 */
@Service
public class TopicService {
    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("1", "Spring", "Spring description"),
            new Topic("2", "java", "java description"),
            new Topic("3", "java-script", "java-script description"),
            new Topic("4", "Spring-boot", "Spring-boot description")
    ));

    public List<Topic> getTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        return topics.stream().filter(topic -> topic.getId().equalsIgnoreCase(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }
}
