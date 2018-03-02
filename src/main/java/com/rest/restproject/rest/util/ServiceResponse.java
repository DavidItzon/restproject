package com.rest.restproject.rest.util;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ServiceResponse {

    private Object dominio;
    private String mensaje;

    public  ServiceResponse(Object dominio,String mensaje){
        this.dominio = dominio;
        this.mensaje = mensaje;
    }
    public  ServiceResponse(String mensaje){
        this.mensaje = mensaje;
    }

}
