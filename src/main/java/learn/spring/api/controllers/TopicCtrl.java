package learn.spring.api.controllers;

import learn.spring.api.models.Topic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

/**
 * @author Ivan Korol on 4/24/2018
 */
@RestController
public class TopicCtrl {
    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return Arrays.asList(
                new Topic("1", "Spring", "Spring description"),
                new Topic("2", "java", "java description"),
                new Topic("3", "java-script", "java-script description"),
                new Topic("4", "Spring-boot", "Spring-boot description")
        );
    }
}
