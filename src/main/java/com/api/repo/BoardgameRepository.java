package com.api.repo;

import com.api.model.dao.BoardGame;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface BoardgameRepository extends Repository<BoardGame, Long> {

    List<BoardGame> findAll();
    BoardGame save(BoardGame boardGame);
    int deleteBoardGameById(String id);
    BoardGame findBoardGameById(String id);
}
