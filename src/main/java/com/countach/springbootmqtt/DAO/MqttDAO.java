package com.countach.springbootmqtt.DAO;

import com.countach.springbootmqtt.Entity.Publication;
import com.countach.springbootmqtt.Entity.Subscription;
import com.countach.springbootmqtt.Entity.User;

import java.util.Collection;

public interface MqttDAO {

    /******************** Subscriptions *********************/
    Collection<Subscription> getAllSubscriptions(String user);
    Subscription getSubscriptionByTopic(String user, String to);
    void addSubscription(Subscription subscription);
    void deleteSubscription(Subscription subscription);

    /******************** Publications *********************/
    Collection<Publication> getAllPublicationsUser(String user);
    Collection<Publication> getAllPublicationsTopic(String topic);
    Publication getPublicationByID(String ID);
    void addPublication(Publication publication);

    /******************** Client/User *********************/
    User getUser(String user);
    void addUser(User user);
    void deleteUser(String username);
}
