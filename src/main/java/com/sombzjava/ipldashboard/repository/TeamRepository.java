package com.sombzjava.ipldashboard.repository;

import com.sombzjava.ipldashboard.model.Team;

import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team, Long> {

    Team findByTeamName(String teamName);
    
}
