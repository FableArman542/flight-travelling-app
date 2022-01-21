import '../../css/style.css';
import 'bootstrap/dist/css/bootstrap.css';
import ProcuraVoos from '../../components/search';
import ControladorSistema from './controladorSistema';
import ControladorVoos from './controladorVoos';
import React, { useState, useRef } from 'react';


const ControladorPrincipal = () => {

    const [listaDesejos, setListaDesejos] = useState(false);
    
    let controladorSistema = <ControladorSistema controladorPrincipal={listaDesejos}/>;
    let controladorVoos = <ControladorVoos />;

    // Auxiliares
    const [comutar, setComutar] = useState(true);

    function procurarVoo(infoVoo) {
        setComutar(!comutar);
    }

    function listarDesejos() {
        setListaDesejos(true);
        voltar();
    }

    function voltar() {
        setComutar(true);
    }
    
    return (
        <div id="booking" className="section">
            <div className="section-center">
                <div className="container">
                    <div className="row">
                        <button className="submit-btn" onClick={listarDesejos}>Lista Desejos</button>
                        <div className="col-md-4 col-md-pull-7">
                        <ProcuraVoos procurarVoo={procurarVoo}/>
                        </div>
                        <div className="col-md-8 col-md-pull-7">
                            <div className="blank-board">
                                { comutar && controladorSistema }
                                { !comutar && controladorVoos }
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    );

}

export default ControladorPrincipal;