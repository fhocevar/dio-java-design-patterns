package br.com.fhocevar.designpatterns;
import org.junit.jupiter.api.Test;import java.math.BigDecimal;import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
class FreteFactoryTest { @Test void selecionaECalculaFrete(){FreteFactory factory=new FreteFactory(List.of(new FreteEconomico(),new FreteExpresso()));assertEquals(new BigDecimal("12.00"),factory.criar("economico").calcular(BigDecimal.TEN));assertThrows(IllegalArgumentException.class,()->factory.criar("desconhecido"));}}
