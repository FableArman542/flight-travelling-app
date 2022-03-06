package dominio.entidades.chaves;
import lombok.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class InfoCompanhiaPK implements Serializable {

    private String companhia;
    private String informacao;

}
