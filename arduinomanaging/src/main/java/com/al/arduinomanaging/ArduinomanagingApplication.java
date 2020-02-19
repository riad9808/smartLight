package com.al.arduinomanaging;

import arduino.Arduino;
import io.github.emanuelepaiano.serialduino.arduino.ArduinoSerialMonitor;
import io.github.emanuelepaiano.serialduino.drivers.ComLinkDevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.JmsException;
import org.springframework.jms.annotation.EnableJms;

import javax.jms.JMSException;

@SpringBootApplication
public class ArduinomanagingApplication implements CommandLineRunner {

    public static void main(String[] args) {

        SpringApplication.run(ArduinomanagingApplication.class, args);



    }
    @Autowired
    private Service service;

    @Override
    public void run(String... args) throws Exception {
        service.run();
    }
}
