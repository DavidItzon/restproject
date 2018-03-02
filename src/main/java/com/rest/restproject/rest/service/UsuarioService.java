package com.rest.restproject.rest.service;

import com.rest.restproject.rest.dto.UsuarioDTO;
import com.rest.restproject.rest.util.ServiceResponse;

import java.util.List;

public interface UsuarioService {

    ServiceResponse obtenerUsuario(Long id);

    ServiceResponse obtenerUsuarios();

    ServiceResponse guardarUsuario(UsuarioDTO usuarioDTO);

}
