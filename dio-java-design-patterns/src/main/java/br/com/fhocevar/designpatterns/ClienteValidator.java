package br.com.fhocevar.designpatterns;
import org.springframework.stereotype.Component;
@Component public class ClienteValidator implements PedidoValidator {public void validar(PedidoRequest p){if(p.cliente()==null||p.cliente().isBlank())throw new IllegalArgumentException("Cliente obrigatório");}}
