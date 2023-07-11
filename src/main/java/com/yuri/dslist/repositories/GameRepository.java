package com.yuri.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuri.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
