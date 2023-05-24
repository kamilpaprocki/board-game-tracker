package com.api.repo;

import com.api.model.dao.BoardGamePlayer;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface BoardGamePlayerRepository extends Repository<BoardGamePlayer, Long> {

    BoardGamePlayer save(BoardGamePlayer boardGamePlayer);
    BoardGamePlayer getBoardGamePlayerById(String id);
    BoardGamePlayer getBoardGamePlayerByNickname(String nickname);
    List<BoardGamePlayer> findAll();
    int deleteBoardGamePlayersById(String id);

}
