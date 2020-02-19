package com.al.statesave.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LightState {
    public LightState(boolean  s,Date d){
        state=s;
        time=d;
    }

    @Id
    @GeneratedValue
    private Integer id;

    private boolean state;

    private Date time;
}
