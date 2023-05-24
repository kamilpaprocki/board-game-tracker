package com.api.model.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
public class BoardGamePlayerDTO {

    @JsonProperty("id")
    private String id;
    @JsonProperty("nickname")
    @NotNull(message = "Player nickname cannot be null")
    @NotEmpty(message = "Player nickname cannot be null")
    private String nickname;
    @JsonProperty("boardGamesPlayed")
    private Set<BoardGameDTO> boardGamesPlayed;

}
