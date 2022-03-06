package com.es.esproj.acessoadados.repositorios;

import com.es.esproj.dominio.entidades.InfoCompanhia;
import com.es.esproj.dominio.entidades.chaves.InfoCompanhiaPK;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRepositorioCompanhias extends CrudRepository<InfoCompanhia, InfoCompanhiaPK> {

    @Query(value = "SELECT * FROM infocompanhias", nativeQuery = true)
    public List<InfoCompanhia> obterInfoCompanhias();

}
