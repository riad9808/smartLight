package com.al.statesave.Service;


import com.al.statesave.dao.StateDao;
import com.al.statesave.model.LightState;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;


import java.io.IOException;
import java.util.Date;

@Component
public class stateManaging {
    @Autowired
    StateDao stateDao;

    @KafkaListener(topics = "request", groupId = "riad")
    public void listener( String s) throws IOException {


        stateDao.save(new LightState(s.equals("2"),new Date()));

        System.out.println(s);
    }
    }
