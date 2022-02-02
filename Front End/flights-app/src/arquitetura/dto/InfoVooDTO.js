

class InfoVooDTO {

    constructor(destinoChegada, destinoPartida, dataPartida, dataChegada, adultos, criancas, preco, itenerarios) {
        this.destinoChegada = destinoChegada;
        this.destinoPartida = destinoPartida;
        this.dataPartida = dataPartida;
        this.dataChegada = dataChegada;
        this.adultos = adultos;
        this.criancas = criancas;
        this.preco = preco;
        this.itenerarios = itenerarios;
    }
    
}

export default InfoVooDTO;