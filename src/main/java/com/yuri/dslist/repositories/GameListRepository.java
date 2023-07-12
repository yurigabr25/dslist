package com.yuri.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuri.dslist.entities.Game;
import com.yuri.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
