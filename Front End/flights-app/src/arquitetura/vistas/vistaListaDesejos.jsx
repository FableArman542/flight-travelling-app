import React, { useState, useEffect } from "react";


const VistaListaDesejos = (controlador) => {

    const [listaDesejos, setListaDesejos] = useState(null);

    const [localidades, setLocalidades] = useState([])

    useEffect(() => {
            (async() => {
                let d = await controlador.obterListaDeDesejos("");
                // setListaDesejos(d);
                
                console.log(d);
                let locs = [];
                if (d != null) {
                    for (let i = 0; i < d.length; ++i) {
                        locs.push(
                                        <div className="blank-white-board destaque" key={i}>
                                            <p>{d[i].listaDesejosPKDTO.localidade}</p>
                                        </div>);
                    }
                        setLocalidades(locs)
                }
            })();
            
    }, []);

    /* Mostrar */
    return (
        <div>
            { localidades }
        </div>
    );

}

export default VistaListaDesejos;