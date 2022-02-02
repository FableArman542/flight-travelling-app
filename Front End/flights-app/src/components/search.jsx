import '../css/style.css';
import 'bootstrap/dist/css/bootstrap.css';
import '../arquitetura/dto/InfoVooDTO';
import DestinoDTO from '../arquitetura/dto/DestinoDTO';
import DestinoPKDTO from '../arquitetura/dto/chaves/DestinoPKDTO';
import InfoVooDTO from '../arquitetura/dto/InfoVooDTO';
import { Autocomplete, TextField } from '@mui/material';
import { useState } from 'react';

const ProcuraVoos = (procurarVoo) => {

  const [from, setFrom] = useState([]);
  const [to, setTo] = useState([]);

  function criarInfoVoo() {
    // let destinoChegada = document.getElementById('chegada').value;
    let destinoChegada = to;
    // let destinoPartida = document.getElementById('partida').value;
    let destinoPartida = from;
    let dataPartida = document.getElementById('dataPartida').value;
    let dataChegada = document.getElementById('dataChegada').value;

    let adultos = document.getElementById('adultos').options[document.getElementById('adultos').selectedIndex].text;
    let criancas = document.getElementById('criancas').options[document.getElementById('criancas').selectedIndex].text;

    let infoVoo = new InfoVooDTO(new DestinoDTO(new DestinoPKDTO(destinoChegada.split(" - ")[1], destinoChegada.split(" - ")[0])),
                                new DestinoDTO(new DestinoPKDTO(destinoPartida.split(" - ")[1], destinoPartida.split(" - ")[0])), 
                                dataPartida, dataChegada, adultos, criancas);
    
    procurarVoo.procurarVoo(infoVoo);

  }

  const options = ['LIS - Lisboa', 'BCN - Espanha'];

    return (
        <div className="booking-form">
                  <div className="form-group">
                    <span className="form-label">From</span>
                    {/* <input id="partida" className="form-control" type="text" placeholder="City" /> */}
                    <Autocomplete
                      disablePortal
                      options={options}
                      onChange={(event, value) => setFrom(value)}
                      
                      renderInput={(params) => <TextField {...params} label="Cidade" />}
                    />
                  </div>
                  
                  <div className="form-group">
                    <span className="form-label">To</span>
                    {/* <input id="chegada" className="form-control" type="text" placeholder="Enter a destination" /> */}
                    <Autocomplete
                      disablePortal
                      options={options}
                      onChange={(event, value) => setTo(value)}
                      
                      renderInput={(params) => <TextField {...params} label="Destino" />}
                    />
                  </div>
                  <div className="row">
                    <div className="col-sm-6">
                      <div className="form-group">
                        <span className="form-label">Check In</span>
                        <input id="dataPartida" className="form-control" type="date" required />
                      </div>
                    </div>
                    <div className="col-sm-6">
                      <div className="form-group">
                        <span className="form-label">Check out</span>
                        <input id="dataChegada" className="form-control" type="date" required />
                      </div>
                    </div>
                  </div>
                  <div className="row">
                    <div className="col-sm-6">
                      <div className="form-group">
                        <span className="form-label">Adults</span>
                        <select id="adultos" className="form-control">
                          <option>1</option>
                          <option>2</option>
                          <option>3</option>
                        </select>
                        <span className="select-arrow"></span>
                      </div>
                    </div>
                    <div className="col-sm-6">
                      <div className="form-group">
                        <span className="form-label">Children</span>
                        <select id="criancas" className="form-control">
                          <option>0</option>
                          <option>1</option>
                          <option>2</option>
                        </select>
                        <span className="select-arrow"></span>
                      </div>
                    </div>
                  </div>
                  <div className="form-btn">
                    <div className="form-check">
                        <input type="checkbox" className="form-check-input" id="check2" name="option2" value="something" />
                        <label className="form-check-label" htmlFor="check2">Look for hotels on Booking.com</label>
                    </div>
                    <button className="submit-btn" onClick={() => criarInfoVoo()}>Check availability</button>
                  </div>
                  
              </div>
    );
}

export default ProcuraVoos;