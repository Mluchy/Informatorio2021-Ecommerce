package com.informatorio.springrest.repository;

import com.informatorio.springrest.entity.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

    public Usuario findOneById(@Param("id") Long id);

}
