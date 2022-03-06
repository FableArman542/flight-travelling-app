package dominio.entidades.chaves;
import lombok.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ListaDesejosPK implements Serializable {

    private String nomeutilizador;
    private String pais;
    private String localidade;

}
