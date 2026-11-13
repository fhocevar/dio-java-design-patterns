package br.com.fhocevar.designpatterns;
import java.math.BigDecimal;
import org.springframework.stereotype.Component;
@Component public class FreteExpresso implements FreteStrategy { public BigDecimal calcular(BigDecimal valor){return new BigDecimal("29.90");} public String tipo(){return "EXPRESSO";} }
