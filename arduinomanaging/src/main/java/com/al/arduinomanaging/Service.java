package com.al.arduinomanaging;
import arduino.Arduino;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
@Component
@EnableKafka
public class Service{
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;
    public void run() {
        Arduino a=new Arduino("COM3",9600);
        a.openConnection();
        String x="";
        while (true){

            String	s=a.serialRead().trim();
            System.out.println(s.trim());
            if(s==null||s.equals("")) {
                if(x.equals("2"))
                    s="2";
                s="";
            }

            if(s.trim().equals("2")) {
                //
                x="2";
                a.serialWrite('2');
            }else {
                if(s.trim().equals("0")||s.trim().equals("1")){

                    x="3";
                    a.serialWrite('3');
                }
            }
            this.kafkaTemplate.send("request",s);
        }
    }
    }
