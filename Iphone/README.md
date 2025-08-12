### Modelagem e Diagramação de um Componente iPhone

#### Funcionalidades a Modelar

1. **Reprodutor Musical**
   - Métodos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`
2. **Aparelho Telefônico**
   - Métodos: `ligar(String numero)`, `atender()`, `iniciarCorreioVoz()`
3. **Navegador na Internet**
   - Métodos: `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`

### Objetivo

1. Criar um diagrama UML que represente as funcionalidades descritas acima.
2. Implementar as classes e interfaces correspondentes em Java (Opcional).

### Diagrama UML (Mermaid)

```mermaid
classDiagram
direction TB
    class ReprodutorMusical {
	    +tocar() void
	    +pausar() void
	    +selecionarMusica(String musica) void
    }

    class AparelhoTelefonico {
	    +ligar(String numero) void
	    +atender() void
	    +iniciarCorreioVoz() void
    }

    class NavegadorInternet {
	    +exibirPagina(String url) void
	    +adicionarNovaAba() void
	    +atualizarPagina() void
    }

    class iPhone {
	    -musicaAtual: String
	    -chamadaAtiva: boolean
	    -paginaAtual: String
	    -numeroAbas: int
	    +tocar() void
	    +pausar() void
	    +selecionarMusica(String musica) void
	    +ligar(String numero) void
	    +atender() void
	    +iniciarCorreioVoz() void
	    +exibirPagina(String url) void
	    +adicionarNovaAba() void
	    +atualizarPagina() void
    }

	<<interface>> ReprodutorMusical
	<<interface>> AparelhoTelefonico
	<<interface>> NavegadorInternet

    iPhone -- NavegadorInternet
    iPhone -- AparelhoTelefonico
    iPhone -- ReprodutorMusical
```
