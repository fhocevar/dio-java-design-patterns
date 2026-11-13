package br.com.fhocevar.designpatterns;
import java.math.BigDecimal;import java.util.*;import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Service;
@Service public class PedidoService {private final FreteFactory factory;private final ValidationChain chain;private final List<PedidoObserver> observers;private final Map<String,PedidoResponse> pedidos=new ConcurrentHashMap<>();
public PedidoService(FreteFactory factory,ValidationChain chain,List<PedidoObserver> observers){this.factory=factory;this.chain=chain;this.observers=observers;}
public PedidoResponse criar(PedidoRequest req){chain.validar(req);BigDecimal frete=factory.criar(req.tipoFrete()).calcular(req.valor());PedidoResponse p=new PedidoResponse(UUID.randomUUID().toString(),req.cliente(),req.valor(),frete,req.valor().add(frete),"CRIADO");pedidos.put(p.id(),p);observers.forEach(o->o.aoCriar(p));return p;}
public List<PedidoResponse> listar(){return List.copyOf(pedidos.values());} public Optional<PedidoResponse> buscar(String id){return Optional.ofNullable(pedidos.get(id));} }
