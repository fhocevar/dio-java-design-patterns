package br.com.fhocevar.designpatterns;
import org.springframework.stereotype.Component;
import java.math.BigDecimal;
@Component public class ValorValidator implements PedidoValidator {public void validar(PedidoRequest p){if(p.valor()==null||p.valor().compareTo(BigDecimal.ZERO)<=0)throw new IllegalArgumentException("Valor deve ser positivo");}}
