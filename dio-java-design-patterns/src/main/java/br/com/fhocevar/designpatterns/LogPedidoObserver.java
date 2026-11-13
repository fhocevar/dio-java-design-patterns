package br.com.fhocevar.designpatterns;
import org.slf4j.Logger;import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
@Component public class LogPedidoObserver implements PedidoObserver {private static final Logger LOG=LoggerFactory.getLogger(LogPedidoObserver.class);public void aoCriar(PedidoResponse p){LOG.info("Pedido criado: {} status {}",p.id(),p.status());}}
