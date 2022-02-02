

class SegmentoDTO {
    constructor (destinoPartida, destinoChegada, dataPartida, dataChegada, duracao, companhia) {
        this.destinoPartida = destinoPartida;
        this.destinoChegada = destinoChegada;
        this.dataPartida = dataPartida;
        this.dataChegada = dataChegada;
        this.duracao = duracao;
        this.companhia = companhia;
    }
}

export default SegmentoDTO;