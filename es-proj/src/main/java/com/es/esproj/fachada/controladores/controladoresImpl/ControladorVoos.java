package com.es.esproj.fachada.controladores.controladoresImpl;


import com.es.esproj.dominio.entidades.voos.InfoVoo;
import com.es.esproj.dominio.servicos.servicosImpls.ServicoVoos;
import com.es.esproj.fachada.controladores.IControladorVoos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/voos")
public class ControladorVoos implements IControladorVoos {

    @Autowired
    private ServicoVoos servicoVoos;

    @Override
    @RequestMapping(value = "/obter-voos", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    public ResponseEntity<List<InfoVoo>> obterVoos(@RequestBody InfoVoo infoVoo) {
        List<InfoVoo> voos = servicoVoos.obterVoos(infoVoo);
        if (voos == null) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
        return ResponseEntity.status(HttpStatus.OK)
                .body(voos);
    }
}
