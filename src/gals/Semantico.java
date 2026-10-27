package gals;

import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/*
 * #1  guarda o nome da variável que vai receber a atribuição
 * #2  desempilha o resultado da expressão e atribui à variável
 * #3  desempilha o resultado da expressão e mostra na tela (Show)
 * #4  soma            #5  subtração       #6  multiplicação
 * #7  divisão         #8  exponenciação   #9  empilha número binário
 * #10 empilha o valor de uma variável     #11 log na base 2
 */
public class Semantico implements Constants
{
    private final Map<String, BigInteger> variaveis = new HashMap<>();
    private final Deque<BigInteger> pilha = new ArrayDeque<>();
    private String variavelAtual;

    public void executeAction(int action, Token token) throws SemanticError
    {
        int pos = token != null ? token.getPosition() : -1;
        BigInteger a, b;

        switch (action)
        {
            case 1:
                variavelAtual = token.getLexeme();
                break;

            case 2:
                variaveis.put(variavelAtual, pilha.pop());
                break;

            case 3:
                System.out.println(pilha.pop().toString(2));
                break;

            case 4:
                b = pilha.pop(); a = pilha.pop();
                pilha.push(a.add(b));
                break;

            case 5:
                b = pilha.pop(); a = pilha.pop();
                if (a.compareTo(b) < 0)
                    throw new SemanticError("Subtração resulta em valor negativo ("
                            + a.toString(2) + " - " + b.toString(2) + ")", pos);
                pilha.push(a.subtract(b));
                break;

            case 6:
                b = pilha.pop(); a = pilha.pop();
                pilha.push(a.multiply(b));
                break;

            case 7:
                b = pilha.pop(); a = pilha.pop();
                if (b.signum() == 0)
                    throw new SemanticError("Divisão por zero", pos);
                pilha.push(a.divide(b));
                break;

            case 8:
                b = pilha.pop(); a = pilha.pop();
                // limita o tamanho do resultado para não travar o interpretador
                if (a.bitLength() > 1 && (b.bitLength() > 31 || (long) a.bitLength() * b.longValue() > 1_000_000))
                    throw new SemanticError("Resultado da exponenciação grande demais", pos);
                pilha.push(a.bitLength() <= 1 ? (b.signum() == 0 ? BigInteger.ONE : a) : a.pow(b.intValue()));
                break;

            case 9:
                pilha.push(new BigInteger(token.getLexeme(), 2));
                break;

            case 10:
                a = variaveis.get(token.getLexeme());
                if (a == null)
                    throw new SemanticError("Variável '" + token.getLexeme() + "' não definida", pos);
                pilha.push(a);
                break;

            case 11:
                a = pilha.pop();
                if (a.signum() == 0)
                    throw new SemanticError("Log de zero não é definido", pos);
                pilha.push(BigInteger.valueOf(a.bitLength() - 1));
                break;
        }
    }
}
