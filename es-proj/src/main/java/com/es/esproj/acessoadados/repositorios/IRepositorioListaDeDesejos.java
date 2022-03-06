package com.es.esproj.acessoadados.repositorios;

import com.es.esproj.dominio.entidades.ListaDesejos;
import com.es.esproj.dominio.entidades.chaves.ListaDesejosPK;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRepositorioListaDeDesejos extends CrudRepository<ListaDesejos, ListaDesejosPK> {

    @Query(value = "SELECT * FROM listadesejos A WHERE A.nomeutilizador = ?1 ", nativeQuery = true)
    public List<ListaDesejos> obterListaDeDesejos(String nomeUtilizador);

}
