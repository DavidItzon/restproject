package com.rest.restproject.rest.controller;


import com.rest.restproject.rest.service.UsuarioService;
import com.rest.restproject.rest.util.ServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("restExample")
public class RestExampleController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("{id}")
    public ServiceResponse getUsuario(@PathVariable("id") Long id){
        return  this.usuarioService.obtenerUsuario(id);
    }

    @GetMapping("list")
    public ServiceResponse getListUsuarios(){
        return this.usuarioService.obtenerUsuarios();
    }

}
