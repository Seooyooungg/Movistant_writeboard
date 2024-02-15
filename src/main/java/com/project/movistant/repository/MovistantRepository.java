package com.project.movistant.repository;

import com.project.movistant.entity.MovistantBoard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovistantRepository extends JpaRepository<MovistantBoard,Integer> {

}
