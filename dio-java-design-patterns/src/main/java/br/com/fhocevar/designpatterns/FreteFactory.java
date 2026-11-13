package br.com.fhocevar.designpatterns;
import java.util.*;
import org.springframework.stereotype.Component;
@Component public class FreteFactory {private final Map<String,FreteStrategy> estrategias=new HashMap<>(); public FreteFactory(List<FreteStrategy> estrategias){estrategias.forEach(e->this.estrategias.put(e.tipo(),e));} public FreteStrategy criar(String tipo){FreteStrategy e=estrategias.get(tipo.toUpperCase(Locale.ROOT));if(e==null)throw new IllegalArgumentException("Frete inválido: use ECONOMICO ou EXPRESSO");return e;} }
