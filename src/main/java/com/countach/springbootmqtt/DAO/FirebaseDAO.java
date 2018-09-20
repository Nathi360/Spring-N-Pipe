package com.countach.springbootmqtt.DAO;

import com.countach.springbootmqtt.Entity.Publication;
import com.countach.springbootmqtt.Entity.Subscription;
import com.countach.springbootmqtt.Entity.User;

import java.util.Collection;

public class FirebaseDAO implements MqttDAO {


    /******************** Subscriptions *********************/
    @Override
    public Collection<Subscription> getAllSubscriptions(String user) {
        return null;
    }

    @Override
    public Subscription getSubscriptionByTopic(String user, String to) {
        return null;
    }

    @Override
    public void addSubscription(Subscription subscription) {

    }

    @Override
    public void deleteSubscription(Subscription subscription) {

    }


    /******************** Publications *********************/
    @Override
    public Collection<Publication> getAllPublicationsUser(String user) {
        return null;
    }

    @Override
    public Collection<Publication> getAllPublicationsTopic(String topic) {
        return null;
    }

    @Override
    public Publication getPublicationByID(String ID) {
        return null;
    }

    @Override
    public void addPublication(Publication publication) {

    }


    /******************** Client/User *********************/
    @Override
    public User getUser(String user) {
        return null;
    }

    @Override
    public void addUser(User user) {

    }

    @Override
    public void deleteUser(String username) {

    }
}
