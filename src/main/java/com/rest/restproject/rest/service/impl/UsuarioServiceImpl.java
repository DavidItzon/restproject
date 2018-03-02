package com.rest.restproject.rest.service.impl;

import com.rest.restproject.rest.converter.UsuarioConverter;
import com.rest.restproject.rest.domain.Usuario;
import com.rest.restproject.rest.dto.UsuarioDTO;
import com.rest.restproject.rest.repository.UsuarioRepository;
import com.rest.restproject.rest.service.UsuarioService;
import com.rest.restproject.rest.util.ServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private UsuarioConverter usuarioConverter;

    @Override
    public ServiceResponse obtenerUsuario(Long id){
        Optional<Usuario> usuarioOptional = this.usuarioRepository.findById(id);
        if(usuarioOptional.isPresent()){
            Usuario usuario = usuarioOptional.get();
            return  new ServiceResponse(this.usuarioConverter.convertToDto(usuario),"Se encontro usuario");

        }else{
            return  new ServiceResponse("No se encontro usuario");
        }
    }

    @Override
    public ServiceResponse obtenerUsuarios() {

        Iterable<Usuario> usuarioIterable = this.usuarioRepository.findAll();
        List<UsuarioDTO> usuarioDTOList = new ArrayList<>();
        for(Usuario usuario : usuarioIterable){
            usuarioDTOList.add(this.usuarioConverter.convertToDto(usuario));
        }
        if(usuarioDTOList.isEmpty()){
            return new ServiceResponse("Esta vacio");
        }
        return new ServiceResponse(usuarioDTOList , "Lista correcta");

    }

    @Override
    public ServiceResponse guardarUsuario(UsuarioDTO usuarioDTO) {
        return null;
    }
}
