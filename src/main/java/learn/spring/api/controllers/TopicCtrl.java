package learn.spring.api.controllers;

import learn.spring.api.models.Topic;
import learn.spring.api.servises.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * @author Ivan Korol on 4/24/2018
 */
@RestController
public class TopicCtrl {
    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicService.getTopics();
    }
}
