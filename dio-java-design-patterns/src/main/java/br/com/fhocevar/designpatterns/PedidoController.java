package br.com.fhocevar.designpatterns;
import jakarta.validation.Valid;import java.net.URI;import java.util.List;
import org.springframework.http.ResponseEntity;import org.springframework.web.bind.annotation.*;
@RestController @RequestMapping("/api/pedidos") public class PedidoController {private final PedidoService service;public PedidoController(PedidoService service){this.service=service;}
@PostMapping public ResponseEntity<PedidoResponse> criar(@Valid @RequestBody PedidoRequest req){PedidoResponse p=service.criar(req);return ResponseEntity.created(URI.create("/api/pedidos/"+p.id())).body(p);}
@GetMapping public List<PedidoResponse> listar(){return service.listar();}
@GetMapping("/{id}") public ResponseEntity<PedidoResponse> buscar(@PathVariable String id){return service.buscar(id).map(ResponseEntity::ok).orElseGet(()->ResponseEntity.notFound().build());} }
