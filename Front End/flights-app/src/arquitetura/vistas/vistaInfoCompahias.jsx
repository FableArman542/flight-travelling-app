import React, { useState, useEffect } from "react";


const VistaInfoCompanhias = (controlador) => {

    const [localidades, setLocalidades] = useState([])

    useEffect(() => {
            (async() => {
                let d = await controlador.obterInfoCompanhias();

                

                let locs = [];
                if (d != null) {
                    for (let i = 0; i < d.length; ++i) {
                        locs.push(
                                        <div className="blank-white-board destaque" key={i}>
                                            <p>{d[i].infoCompanhiaPK.companhia}</p>
                                            <p>{d[i].infoCompanhiaPK.informacao}</p>
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

export default VistaInfoCompanhias;