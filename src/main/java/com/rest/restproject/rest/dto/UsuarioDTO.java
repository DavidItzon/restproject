package com.rest.restproject.rest.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Optional;

@Getter
@Setter
public class UsuarioDTO implements Serializable{

    private Optional<Long> id;
    private Optional<String> usuarioNickName;
}
