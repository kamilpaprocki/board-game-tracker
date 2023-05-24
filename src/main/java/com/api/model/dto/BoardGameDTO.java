package com.api.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Builder
@ToString
@EqualsAndHashCode
@Getter
@AllArgsConstructor
public class BoardGameDTO {

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    @NotNull(message = "Board game name cannot be null")
    @NotEmpty(message = "Board game name cannot be null")
    private String name;

    @JsonProperty("publishingHouse")
    @NotNull(message = "Board game publishingHouse cannot be null")
    @NotEmpty(message = "Board game publishingHouse cannot be null")
    private String publishingHouse;

    @JsonProperty("year")
    @NotNull(message = "Board game year cannot be null")
    @NotEmpty(message = "Board game year cannot be null")
    private Integer year;
}
