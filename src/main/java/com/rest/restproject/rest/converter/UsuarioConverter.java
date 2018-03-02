package com.rest.restproject.rest.converter;

import com.rest.restproject.rest.domain.Usuario;
import com.rest.restproject.rest.dto.UsuarioDTO;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UsuarioConverter {

    public UsuarioDTO convertToDto(Usuario usuario) {

        UsuarioDTO usuarioDTO = new UsuarioDTO();
        usuarioDTO.setId(Optional.of(usuario.getId()));
        usuarioDTO.setUsuarioNickName(Optional.of(usuario.getUsuarioNickName()));
        return usuarioDTO;

    }

    public Usuario convertToDomain(UsuarioDTO usuarioDTO){
        Usuario usuario = new Usuario();
        usuarioDTO.getId().ifPresent( v -> usuario.setId(v));
        usuarioDTO.getUsuarioNickName().ifPresent( v -> usuario.getUsuarioNickName());
        return usuario;
    }

}
