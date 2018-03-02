package com.rest.restproject.rest.repository;

import com.rest.restproject.rest.domain.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository  extends CrudRepository<Usuario , Long> {


}
