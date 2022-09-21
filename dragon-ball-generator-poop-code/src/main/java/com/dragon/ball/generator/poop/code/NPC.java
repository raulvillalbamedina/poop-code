package com.dragon.ball.generator.poop.code;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NPC{
    // Es el nombre
    @JsonProperty("name")
    private String nmbr;
    // Es el tipo
    @JsonProperty("type")
    private String t;
    // Es el level
    @JsonProperty("level")
    private String nv;
    // El sexo
    @JsonProperty("gender")
    private String sx;
    // El color, no sabemos si de piel o cabello
    @JsonProperty("skin")
    private String clr;
}
