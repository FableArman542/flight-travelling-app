import '../../css/style.css';
import 'bootstrap/dist/css/bootstrap.css';
import ProcuraVoos from '../../components/search';
import ControladorSistema from './controladorSistema';
import ControladorVoos from './controladorVoos';
import React, { useState } from 'react';


const ControladorPrincipal = () => {

    const [controladorSistema, setControladorSistema] = useState(<ControladorSistema />);
    const [controladorVoos, setControladorVoos] = useState(<ControladorVoos />);

    function procurarVoo() {
        console.log("Procurando Voo...")
    }

    return (
        <div id="booking" className="section">
            <div className="section-center">
                <div className="container">
                <div className="row">
                    {/* TODO - Falta header */}
                    {/* <div className="col-md-7 col-md-push-5">
                    <div className="booking-cta">
                        <h1>Make your reservation</h1>
                        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Animi facere, soluta magnam consectetur molestias itaque
                        ad sint fugit architecto incidunt iste culpa perspiciatis possimus voluptates aliquid consequuntur cumque quasi.
                        Perspiciatis.
                        </p>
                    </div>
                    </div> */}
                    <div className="col-md-4 col-md-pull-7">
                    <ProcuraVoos procurarVoo={procurarVoo}/>
                    </div>
                    <div className="col-md-8 col-md-pull-7">
                        <div className="blank-board">
                            { controladorSistema }
                        </div>
                    </div>
                </div>
                </div>
            </div>
        </div>
    );

}

export default ControladorPrincipal;