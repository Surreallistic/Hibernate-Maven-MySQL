package custom.api.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Lukasz S. on 05.04.2017.
 */
@RestController
public class TopicController {

    @Autowired
    TopicService repository;

    @RequestMapping(value = "/topic", method = RequestMethod.GET, params = "all")
    public List<Topic> getAllTopics(){
        return repository.getAllTopics();
    }

    @RequestMapping(value = "/topic", method = RequestMethod.GET, params = "id")
    public Topic getTopicsById(@RequestParam long id){
        return repository.getTopicsById(id);
    }

    @RequestMapping(value = "/topic", method = RequestMethod.POST, params = "new")
    public void addTopic(@RequestBody Topic e) {
        repository.addTopic(e);
    }

    @RequestMapping(value = "/topic", method = RequestMethod.PUT, params = "edit")
    public void updateTopicById(@RequestBody Topic topic) {
        repository.updateTopicById(topic);
    }

    @RequestMapping(value = "/topic", method = RequestMethod.DELETE, params = "id")
    public void deleteTopicById(@RequestParam("id") long id){
        repository.deleteTopicById(id);
    }

}