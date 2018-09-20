package com.countach.springbootmqtt.MQTT;

import com.countach.springbootmqtt.Entity.User;
import org.eclipse.paho.client.mqttv3.*;
import org.springframework.stereotype.Repository;

@Repository
public class Client implements MqttCallback {

    private MqttClient client;
    private MqttConnectOptions options;

    public Client() {

        System.out.println("Hello from MqttClient");
    }

    public Client(String serverURI, User user) throws MqttException, InterruptedException {

        client = new MqttClient(serverURI, user.getUsername());
        client.setCallback(this);

        options = new MqttConnectOptions();
        options.setCleanSession(true);
        options.setMqttVersion(MqttConnectOptions.MQTT_VERSION_3_1);

        client.connect(options);

        if(client.isConnected()){
            System.out.println(client.getClientId() + " connected to Broker!");
        }
    }

    public void subscribe(String topic, int qos) throws MqttException, InterruptedException{

        this.client.subscribe(topic, qos);
        Thread.sleep(2200);
//        System.out.println(clientID + " subscribed to " + topic.toUpperCase() + " @ QoS = " + qos);
    }


    public void unsubscribe(String topic) throws MqttException{

        this.client.unsubscribe(topic);
//        System.out.println(clientID + " unsubscribed to " + topic.toUpperCase());
    }


    public void publish(String topic, byte[] payload, int qos, Boolean restrained) throws MqttException, InterruptedException{

        this.client.publish(topic, payload, qos, restrained);
//        System.out.println(clientID + " publishing: '" + message.toString() + "' to " + topic.toUpperCase());
        Thread.sleep(4000);

    }

    public void disconnect() throws MqttException{

        client.disconnect();
//        System.out.println(clientID + " detached from Broker!");
    }

    /****************************** CALL-BACKS *********************************/

    @Override
    public void connectionLost(Throwable throwable) {

    }

    @Override
    public void messageArrived(String s, MqttMessage mqttMessage) throws InterruptedException{

        Thread.sleep(3000);
//        System.out.println(clientID + " received message: '" + mqttMessage.toString() + "' : TOPIC = " + s.toUpperCase());
    }


    @Override
    public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {

        try{
            System.out.println("Delivery Report: '" + iMqttDeliveryToken.getMessage().toString() /*+ "' [Sender : " + clientID + "]"*/);
        }
        catch (MqttException exp){

            System.out.println(exp.getMessage());
        }
    }
}
