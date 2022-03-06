package dominio.entidades.voos;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Segmento {

    private String destinoPartida;
    private String destinoChegada;
    private Date dataPartida;
    private Date dataChegada;
    private int duracao;
    private String companhia;

}
