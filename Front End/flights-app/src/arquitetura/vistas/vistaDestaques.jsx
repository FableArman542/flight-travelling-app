import '../../css/style.css';
import React, { useEffect, useState } from 'react';


const VistaDestaques = (obterDestaques) => {

    const [destaques, setDestaques] = useState([]);

    // Atualizar Destaques
    useEffect(
        () => {
            let d = obterDestaques.obterDestaques();
            setDestaques(d);
            console.log(d);
        },[]
    );

    let localidades = [];
    for (let i = 0; i < destaques.length; ++i) {
        localidades.push(
                    <div className="blank-white-board destaque" key={destaques[i].localidade}>
                        <p>{destaques[i].localidade}</p>
                    </div>);
    }
    
    /* Mostrar */
    return (
        <div>
            {localidades}
        </div>
    );
}
export default VistaDestaques; 