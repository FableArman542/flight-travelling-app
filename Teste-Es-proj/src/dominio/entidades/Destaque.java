package dominio.entidades;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Destaque {

    private Integer prioridade;

    private String pais;

    private String localidade;

}
