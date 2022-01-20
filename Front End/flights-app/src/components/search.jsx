import '../css/style.css';
import 'bootstrap/dist/css/bootstrap.css';


const ProcuraVoos = (procurarVoo) => {

    return (
        <div className="booking-form">
                <div className="form-group">
                    <span className="form-label">From</span>
                    <input className="form-control" type="text" placeholder="City" />
                  </div>
                  <div className="form-group">
                    <span className="form-label">To</span>
                    <input className="form-control" type="text" placeholder="Enter a destination" />
                  </div>
                  <div className="row">
                    <div className="col-sm-6">
                      <div className="form-group">
                        <span className="form-label">Check In</span>
                        <input className="form-control" type="date" required />
                      </div>
                    </div>
                    <div className="col-sm-6">
                      <div className="form-group">
                        <span className="form-label">Check out</span>
                        <input className="form-control" type="date" required />
                      </div>
                    </div>
                  </div>
                  <div className="row">
                    <div className="col-sm-6">
                      <div className="form-group">
                        <span className="form-label">Adults</span>
                        <select className="form-control">
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
                        <select className="form-control">
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
                    <button className="submit-btn" onClick={() => procurarVoo.procurarVoo()}>Check availability</button>
                    
                  </div>
                  
              </div>
    );
}

export default ProcuraVoos;