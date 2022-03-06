import '../../css/style.css';
import destino_imagem from '../../resources/destino_imagem.jpg';
import React, { useEffect, useState } from 'react';


const VistaDestaques = (obterDestaques) => {

    const [destaques, setDestaques] = useState([]);

    // Atualizar Destaques
    useEffect(
        () => {
            let d;
            
            (async() => {
                d = await obterDestaques.obterDestaques();
                setDestaques(d);
            })();
        },[]
    );

    let localidades = [];
    for (let i = 0; i < destaques.length; ++i) {
        localidades.push(
                    <div className="blank-white-board destaque" key={destaques[i].destinoPK.localidade}>
                        <img className="photo" src={destino_imagem} />
                        <p style={{textAlign: 'center'}}>{destaques[i].destinoPK.localidade}</p>
                    </div>);
    }
    
    /* Mostrar */
    return (
        <div>
            <h2 style={{color: 'white'}}>Destaques</h2>
            {localidades}
        </div>
    );
}
export default VistaDestaques; 