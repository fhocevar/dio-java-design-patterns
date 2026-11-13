package br.com.fhocevar.designpatterns;
import org.springframework.stereotype.Component;
import java.util.List;
@Component public class ValidationChain {private final List<PedidoValidator> validadores;public ValidationChain(List<PedidoValidator> validadores){this.validadores=validadores;} public void validar(PedidoRequest p){for(PedidoValidator v:validadores)v.validar(p);} }
