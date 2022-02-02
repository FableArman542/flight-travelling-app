import React, { useEffect } from "react";


const VistaVoos = (controlador) => {
    
    useEffect(
        () => {
            console.log(controlador.controlador);
        }
    );
    
    let voos = [];
    for (let i = 0; i < controlador.controlador.length; ++i) {
        voos.push(
                    <div className="blank-white-board destaque" key={i}>
                        <p>{controlador.controlador[i].preco}</p>
                    </div>);
    }


    return (
        <div>
            { voos }
        </div>
    );

}

export default VistaVoos;