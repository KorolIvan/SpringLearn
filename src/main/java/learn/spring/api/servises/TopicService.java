package learn.spring.api.servises;

import learn.spring.api.commo.TopicRepository;
import learn.spring.api.models.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Ivan Korol on 4/24/2018
 */
@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getTopics() {
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Optional<Topic> getTopic(String id) {
        return topicRepository.findById(id);
    }

    public void addTopic(Topic topic) {
       topicRepository.save(topic);
    }

    public void updateTopic(Topic topic, String id) {
       topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
       topicRepository.deleteById(id);
    }
}
