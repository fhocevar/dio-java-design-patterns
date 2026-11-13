package br.com.fhocevar.designpatterns;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;
public record PedidoRequest(@NotBlank String cliente,@NotNull @DecimalMin("0.01") BigDecimal valor,@NotNull @Positive Integer quantidade,@NotBlank String tipoFrete) {}
