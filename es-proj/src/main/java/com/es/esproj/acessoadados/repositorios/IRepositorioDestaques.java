package com.es.esproj.acessoadados.repositorios;

import com.es.esproj.dominio.entidades.Destaque;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRepositorioDestaques extends CrudRepository<Destaque, Integer> {

    @Query(value = "SELECT * FROM destaques", nativeQuery = true)
    public List<Destaque> obterDestinosDestaque();

}
