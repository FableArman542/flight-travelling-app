package com.es.esproj.fachada.controladores.controladoresImpl;

import com.es.esproj.dominio.entidades.InfoCompanhia;
import com.es.esproj.dominio.entidades.ListaDesejos;
import com.es.esproj.dominio.servicos.servicosImpls.ServicoUtilizador;
import com.es.esproj.fachada.controladores.IControladorSistema;
import com.es.esproj.dominio.entidades.Destino;
import com.es.esproj.dominio.servicos.servicosImpls.ServicoSistema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/sistema")
public class ControladorSistema implements IControladorSistema {

    @Autowired
    private ServicoSistema servicoSistema;

    @Autowired
    private ServicoUtilizador servicoUtilizador;

    @Override
    @RequestMapping(value = "/destaques", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<Destino>> obterDestinosDestaque() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(servicoSistema.obterDestinosDestaque());
    }

    @Override
    @RequestMapping(value = "/listadesejos", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<ListaDesejos>> obterListaDesejos(@RequestParam(name = "utilizador") String utilizador) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(servicoUtilizador.obterListaDeDesejos(utilizador));
    }

    @Override
    @RequestMapping(value = "/infocompanhias", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<InfoCompanhia>> obterInfoCompanhias() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(servicoSistema.obterInfoCompanhias());
    }


}
