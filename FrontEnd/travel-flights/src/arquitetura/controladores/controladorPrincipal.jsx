import '../../css/style.css';
import 'bootstrap/dist/css/bootstrap.css';
import SearchFlights from '../../components/search';
import ControladorSistema from './controladorSistema';
import ControladorVoos from './controladorVoos';


const ControladorPrincipal = () => {

    const controloadorSistema = <ControladorSistema />;
    const controladorVoos = <ControladorVoos />;

    function procurarVoo() {
        console.log("Procurando Voo...")
    }

    return (
        <div id="booking" className="section">
            <div className="section-center">
                <div className="container">
                <div className="row">
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
                    <SearchFlights procurarVoo={procurarVoo}/>
                    </div>
                    <div className="col-md-8 col-md-pull-7">
                        <div className="blank-board">
                            <ControladorSistema />
                        </div>
                    </div>
                </div>
                </div>
            </div>
        </div>
    );

}

export default ControladorPrincipal;