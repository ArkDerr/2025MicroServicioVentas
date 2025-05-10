package cl.duoc.MiMicroServicio.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VentaUsuarioDTO {
    private Long idventa;
    private String rutusuario;
    private LocalDate fechaventa;
    private String nombre;
    private String mail;
}
