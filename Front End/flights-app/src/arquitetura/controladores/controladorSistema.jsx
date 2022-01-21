import VistaDestaques from "../vistas/vistaDestaques";
import VistaListaDesejos from "../vistas/vistaListaDesejos";
import React, { useState, useEffect, useRef } from 'react';
import DestinoDTO from '../dto/DestinoDTO';

const ControladorSistema = (controladorPrincipal) => {

    let vistaDestaques = <VistaDestaques obterDestaques={obterDestinosDestaque} />;
    let vistaListaDesejos = <VistaListaDesejos obterListaDeDesejos={obterListaDeDesejos}/>;

    // On mount
    useEffect(
        () => {
            obterDestinosDestaque();
        },
        []
    );

    // useEffect(() => {
    //     console.log("CENAS");
    //     console.log(controladorPrincipal)
    // }, [controladorPrincipal.controladorPrincipal]);

    function obterDestinosDestaque () {
        console.log("Obtendo destinos de destaques...");
        return [new DestinoDTO("Portugal", "Lisboa"), new DestinoDTO("Espanha", "Madrid")];
    }

    function obterListaDeDesejos ( utilizador ) {
        console.log("Obtendo lista de desejos...");
    }

    return (
        <div>
            { controladorPrincipal.controladorPrincipal == false && vistaDestaques }
            { controladorPrincipal.controladorPrincipal == true && vistaListaDesejos }
        </div>
    );

}

export default ControladorSistema;