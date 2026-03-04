# Microdesafio – Objeto `Relogio`

## Visão geral
O objeto **Relogio** representa um relógio do mundo real, com informações de **resistência à água**, tipo (**analógico** ou não) e **estado** (ex.: `novo`, `usado`).  
O objetivo foi aplicar **POO**, criando métodos que **alteram o estado** com **validações (regras de negócio)** para evitar inconsistências.

## Classe principal
`br.com.fiapride.model.Relogio`

### Atributos
- `resistenteAgua: boolean` – indica se o relógio é resistente à água.
- `analogico: boolean` – indica se o relógio é analógico.
- `estado: String` – estado do relógio (ex.: `novo`, `usado`, `desconhecido`).

### Construtores
- `Relogio()` – define valores padrão (`resistenteAgua=false`, `analogico=true`, `estado="desconhecido"`).
- `Relogio(boolean resistenteAgua, boolean analogico, String estadoInicial)` – permite configurar tudo na criação.

### Métodos criados (com regras de negócio)
- `alterarEstado(String novoEstado): void`  
  - **Validação**: não aceita `null` ou string em branco.  
  - Normaliza para minúsculas.  
  - Ajusta `estado` e imprime mensagem amigável.

- `alterarResistenteAgua(double profundidade): void`  
  - **Regra**: até `20` → `resistenteAgua = true`; acima de `20` → `resistenteAgua = false`.  
  - Emite mensagem indicando o resultado.

### Como executar
1. Abra o projeto no Eclipse/IDE.
2. Rode a classe `br.com.fiapride.main.SistemaPrincipal`.
3. Observe no console as mensagens dos métodos e o resumo final.

### Testes (válidos e inválidos)
No `SistemaPrincipal`, foram feitos testes com:
- `alterarEstado("novo")`, `alterarEstado("usado")` (válidos)
- `alterarEstado(null)`, `alterarEstado("   ")` (inválidos)
- `alterarResistenteAgua(10)` (mantém resistente), `alterarResistenteAgua(30)` (perde resistência)

## UML (resumo)
- Métodos adicionados: `alterarEstado(String)`, `alterarResistenteAgua(double)`.  
- Ambos **alteram atributos** e possuem **validação**.
