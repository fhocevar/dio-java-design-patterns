# DIO — Design Patterns com Java 21 e Spring Boot

Projeto autoral para o desafio **Explorando Padrões de Projetos na Prática com Java** da DIO.

## Padrões demonstrados

- **Strategy**: `FreteStrategy`, `FreteEconomico` e `FreteExpresso`.
- **Factory**: `FreteFactory` seleciona uma estratégia pelo tipo solicitado.
- **Chain of Responsibility (simplificado)**: `ValidationChain` executa validadores em sequência. É uma cadeia linear, sem repasse explícito entre handlers.
- **Observer**: `PedidoObserver` recebe eventos de criação de pedidos.
- **Singleton (escopo Spring)**: `AppConfig` é um bean singleton por padrão no contêiner Spring; não é um singleton implementado manualmente.

## Pré-requisitos

Java 21, Maven 3.9+ e VS Code ou outra IDE. Funciona em Windows 11 e Linux. **Não exige banco de dados nem Docker**: os pedidos são armazenados em memória e se perdem quando a aplicação reinicia.

## Executar

No PowerShell (Windows) ou terminal (Linux), na raiz do projeto:

```bash
mvn test
mvn spring-boot:run
```

Swagger: http://localhost:8080/swagger-ui.html

## Endpoints

| Método | Rota | Descrição |
| --- | --- | --- |
| POST | `/api/pedidos` | Cria pedido |
| GET | `/api/pedidos` | Lista pedidos |
| GET | `/api/pedidos/{id}` | Busca pedido por ID |

Exemplo JSON para POST `/api/pedidos`:

```json
{"cliente":"Maria","valor":150.00,"quantidade":2,"tipoFrete":"ECONOMICO"}
```

O campo `valor` representa o valor total dos itens, antes do frete. `quantidade` é validada, mas não altera esse valor.

## GitHub

```bash
git init
git branch -M main
git add .
git commit -m "feat: implementa design patterns em API de pedidos"
git remote add origin https://github.com/fhocevar/dio-java-design-patterns.git
git push -u origin main
```

Crie primeiro o repositório vazio no GitHub. Se o remoto já existir, use `git remote set-url origin URL`.

## Referências

- https://github.com/digitalinnovationone/lab-padroes-projeto-java
- https://github.com/digitalinnovationone/lab-padroes-projeto-spring

**Observação:** exemplo educacional; não possui persistência, autenticação ou processamento real de pagamentos.
