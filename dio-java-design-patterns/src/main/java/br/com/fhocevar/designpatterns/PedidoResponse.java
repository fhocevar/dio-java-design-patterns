package br.com.fhocevar.designpatterns;
import java.math.BigDecimal;
public record PedidoResponse(String id,String cliente,BigDecimal valor,BigDecimal frete,BigDecimal total,String status) {}
