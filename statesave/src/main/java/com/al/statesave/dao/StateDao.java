package com.al.statesave.dao;

import com.al.statesave.model.LightState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateDao extends JpaRepository<LightState, Integer> {

}

