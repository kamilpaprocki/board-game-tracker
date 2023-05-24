package com.api.model.dao;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@Entity
@Table(name ="board_game")
public class BoardGame {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "boardgame_id")
    private String id;

    @Column(name = "boardgame_name")
    private String boardGameName;

    @Column(name = "publishing_house")
    private String publishingHouse;

    @Column(name = "publication_year")
    private Integer publicationYear;

}
