package dominio.entidades.chaves;
import lombok.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class DestinoPK implements Serializable {

    private String pais; // Pais
    private String localidade; // Codigo IATA

}
