package com.api.model.dao;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Map;

@Data
@NoArgsConstructor
@Entity
@Table(name ="board_game_player")
public class BoardGamePlayer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "player_id")
    private String id;
    @Column(name = "player_nickname", unique = true)
    private String nickname;
    @ElementCollection
    @CollectionTable(name="boardgame_winnings", joinColumns = {@JoinColumn(name = "boardgame_id", referencedColumnName = "boardgame_id")})
    @MapKeyColumn(name="boardgame_name")
    @Column(name="player_winnings")
    private Map<BoardGame, Integer> boardGameWinnings;
}
