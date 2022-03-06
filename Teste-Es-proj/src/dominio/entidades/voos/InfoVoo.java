package dominio.entidades.voos;
import dominio.entidades.Destino;
import lombok.*;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class InfoVoo {

    private Destino destinoChegada;
    private Destino destinoPartida;
    private Date dataPartida;
    private Date dataChegada;

    private int adultos;
    private int criancas;

    private float preco;
    private List<Itenerario> itenerarios;

}
