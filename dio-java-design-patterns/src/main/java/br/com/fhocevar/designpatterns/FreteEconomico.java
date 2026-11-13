package br.com.fhocevar.designpatterns;
import java.math.BigDecimal;
import org.springframework.stereotype.Component;
@Component public class FreteEconomico implements FreteStrategy { public BigDecimal calcular(BigDecimal valor){return new BigDecimal("12.00");} public String tipo(){return "ECONOMICO";} }
