package com.countach.springbootmqtt.Service;

import com.countach.springbootmqtt.Entity.Publication;
import com.countach.springbootmqtt.Entity.Subscription;
import com.countach.springbootmqtt.Entity.User;
import com.countach.springbootmqtt.MQTT.Client;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;


@Service
public class MqttService {

    private final String BROKER_URL = "tcp://0.0.0.0:1884";

    @Autowired
    private Client client;

    public MqttService() {

        client = new Client();
    }

    public void getContent(User user){

        try{

            client = new Client(BROKER_URL, user);

        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        catch (MqttException e){
            System.out.println(e.getMessage());
        }
    }

    public Collection<Publication> getAllPublications(){

        return null;
    }

    public Collection<Subscription> getAllSubscriptions(){

        return null;
    }

    public Collection<Publication> getPublicationsByTopicName(){

        return null;
    }

    public String subscribe(Subscription subscription){

        return "";
    }

    public String unsubscribe(Subscription subscription){

        return "";
    }

    public String publish(Publication publication){

        return "";
    }

    public String detach(User user){

        return "";
    }
}
