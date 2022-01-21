import React, { useState, useEffect } from "react";


const ControladorVoos = (controladorPrincipal) => {

    useEffect(
        () => {
            obterVoos(null);
        },[]
    );

    // infoVoo = infoVooDTO
    function obterVoos (infoVoo) {
        console.log("Obtendo voos...");
        return // Voos
    }

    return (
        <div>
            <p>Controlador Voos</p>
        </div>
    );

}


export default ControladorVoos;