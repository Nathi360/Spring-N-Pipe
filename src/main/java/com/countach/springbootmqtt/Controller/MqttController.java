package com.countach.springbootmqtt.Controller;

import com.countach.springbootmqtt.Entity.Publication;
import com.countach.springbootmqtt.Entity.Subscription;
import com.countach.springbootmqtt.Entity.User;
import com.countach.springbootmqtt.Service.MqttService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/mqtt")
public class MqttController {

    @Autowired
    private MqttService service;

    public MqttController() {

        service = new MqttService();
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public void getContent(/*@RequestBody User user*/){

        //service.getContent(user);
        System.out.println("Hello from SpringBoot");
    }

    /**
     * Retrieve all subscriptions made
     * @return
     */
    @RequestMapping(path = "/subscriptions", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Collection<Subscription> getAllSubscriptions(){

        return null;
    }

    /**
     * Retrieve all subscribed to publications
     * @return
     */
    @RequestMapping(path = "/publications", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Collection<Publication> getAllPublications(){

        return null;
    }

    /**
     * Retrieve all published messages by a specific topic
     * @param topicName
     * @return
     */
    @RequestMapping(path = "/topic/{topicName}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Collection<Publication> getPublicationsByTopicName(@PathVariable("topicName") String topicName){

        return null;
    }

    /**
     * Subscribe to a topic
     * @param subscription
     * @return
     */
    @RequestMapping(path = "/subscribe/", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(value = HttpStatus.OK)
    public String subscribe(@RequestBody Subscription subscription){

        return "";
    }

    /**
     * Unsubscribe from a topic
     * @param subscription
     * @return
     */
    @RequestMapping(path = "/unsubscribe/", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(value = HttpStatus.OK)
    public String unsubscribe(@RequestBody Subscription subscription){

        return "";
    }

    /**
     * Publish to the Broker
     * @param publication
     * @return
     */
    @RequestMapping(path = "/publish", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(value = HttpStatus.OK)
    public String publish(@RequestBody Publication publication){

        return "";
    }

    /**
     * Disconnect the logged-in user from the Broker-server
     * @param user
     * @return
     */
    @RequestMapping(path = "/detach", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(value = HttpStatus.OK)
    public String detach(@RequestBody User user){

        return "";
    }
}
