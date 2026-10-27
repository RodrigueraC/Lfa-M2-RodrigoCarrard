# LFA M2 — Interpretador de números binários com GALS

Trabalho M2 da disciplina de Linguagens Formais e Autômatos (UNIVALI).
Gramática e interpretador feitos com o [GALS](https://lia-univali.github.io/Web-GALS/) para uma linguagem que faz contas com **números binários inteiros sem sinal**.

```
A = 10;
B = 11;
B = 111 + A * B;
Show ( B );        // mostra 1101 (7 + 2 * 3 = 13)
```

## A linguagem

| Recurso | Sintaxe | Exemplo |
|---|---|---|
| Atribuição | `variavel = expressao;` | `A = 101;` |
| Exibição | `Show ( expressao );` | `Show(A);` |
| Soma / subtração | `+` `-` | `A + 1` |
| Multiplicação / divisão (inteira) | `*` `/` | `111 / 10` → `11` |
| Exponenciação | `^` (associa à direita) | `10 ^ 11` → `1000` |
| Log na base 2 (inteiro, para baixo) | `log ( expressao )` | `log(1000)` → `11` |

- Números: só `0` e `1`. Variáveis: começam com letra (`A`, `Valor_1`).
- `Show` e `log` são palavras reservadas, e o GALS diferencia maiúsculas de minúsculas.
- Precedência, da menor para a maior: `+ -` → `* /` → `^` → número, variável, `( )` e `log( )`.

### Erros semânticos

Como a linguagem não tem sinal, estes casos param a execução com erro:

- subtração com resultado negativo (`10 - 11`);
- divisão por zero;
- `log(0)`;
- variável usada antes de receber valor.

## Estrutura

```
trabalho_m2.gals                      gramática do trabalho (tokens, gramática e ações semânticas)
src/gals/Semantico.java               o interpretador (ações #1 a #11)
src/gals/Main.java                    lê um programa .txt e executa
src/gals/*.java                       demais classes, geradas pelo GALS
testes/                               programas de teste (corretos e com erro)
aula_introdutoria_acoes_semanticas.gals   exemplo usado em aula
gals.jar                              GALS desktop (versão antiga)
```

### Ações semânticas

O `Semantico` avalia as expressões com uma pilha e guarda as variáveis num mapa.

| Ação | O que faz |
|---|---|
| `#1` | guarda o nome da variável que vai receber a atribuição |
| `#2` | desempilha o resultado e atribui à variável |
| `#3` | desempilha o resultado e mostra em binário (`Show`) |
| `#4` a `#8` | soma, subtração, multiplicação, divisão e exponenciação |
| `#9` | empilha um número binário |
| `#10` | empilha o valor de uma variável |
| `#11` | log na base 2 |

## Como rodar

Precisa do Java (JDK 17 ou mais novo). Dentro da pasta do projeto:

```powershell
javac -nowarn -encoding UTF-8 -d bin src\gals\*.java
java -cp bin gals.Main testes\01_exemplo_pdf.txt
```

Para rodar todos os testes:

```powershell
Get-ChildItem testes\*.txt | ForEach-Object { "=== $($_.Name)"; java -cp bin gals.Main $_.FullName }
```

## Mudando a gramática

1. Abra o `trabalho_m2.gals` no [Web-GALS](https://lia-univali.github.io/Web-GALS/) (ou no `gals.jar`).
2. Teste com **Simular Léxico** e **Simular Sintático**. O Web-GALS não executa a parte semântica.
3. Gere o código em Java (pacote `gals`, parser SLR) e copie os arquivos para `src/gals`,
   **menos o `Semantico.java`**: o gerado vem vazio e apagaria o interpretador.
