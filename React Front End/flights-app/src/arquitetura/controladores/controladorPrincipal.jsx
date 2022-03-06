import '../../css/style.css';
import '../../css/header_style.css';
import 'bootstrap/dist/css/bootstrap.css';
import ProcuraVoos from '../../components/search';
import ControladorSistema from './controladorSistema';
import ControladorVoos from './controladorVoos';
import React, { useState } from 'react';

const ControladorPrincipal = () => {

    const [listaDesejos, setListaDesejos] = useState('destaques');

    // Auxiliares
    const [infoVoo, setInfoVoo] = useState(null);
    const [comutar, setComutar] = useState(true);
    
    let controladorSistema = <ControladorSistema controladorPrincipal={listaDesejos}/>;
    let controladorVoos = <ControladorVoos controladorPrincipal={infoVoo} />;

    function procurarVoo(informacaoVoo) {
        setInfoVoo(informacaoVoo);
        setComutar(false);
    }

    function listarDesejos() {
        setListaDesejos('desejos');
        voltar();
    }

    function voltar() {
        setComutar(true);
    }

    function listarDestaques() {
        window.location.reload();
    }

    function listarInfoCompanhias() {
        setListaDesejos('companhias');
    }
    
    return (
        <div>
            <div className="topnav">
                <a className="topnava" onClick={listarDestaques}>Home</a>
                <a className="topnava" onClick={listarDesejos}>Lista De Desejos</a>
                <a className="topnava" onClick={listarInfoCompanhias}>Informações</a>
            </div>
            <div id="booking" className="section">

            <div className="section-center">
                <div className="container">
                    <div className="row">
                        {/* <button className="submit-btn" onClick={listarDesejos}>Lista Desejos</button> */}
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
        </div>
        
    );

}

export default ControladorPrincipal;