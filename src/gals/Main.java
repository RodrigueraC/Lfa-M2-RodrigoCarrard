package gals;

import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Uso: java -cp bin gals.Main programa.txt
 */
public class Main
{
    public static void main(String[] args) throws Exception
    {
        String fonte = args.length > 0
                ? new String(Files.readAllBytes(Paths.get(args[0])), StandardCharsets.UTF_8)
                : new String(System.in.readAllBytes(), StandardCharsets.UTF_8);

        Lexico lexico = new Lexico(new StringReader(fonte));
        Sintatico sintatico = new Sintatico();
        Semantico semantico = new Semantico();

        try
        {
            sintatico.parse(lexico, semantico);
        }
        catch (LexicalError e)
        {
            erro("léxico", e, fonte);
        }
        catch (SyntaticError e)
        {
            erro("sintático", e, fonte);
        }
        catch (SemanticError e)
        {
            erro("semântico", e, fonte);
        }
    }

    private static void erro(String tipo, AnalysisError e, String fonte)
    {
        int pos = e.getPosition();
        String onde = "";
        if (pos >= 0)
        {
            int linha = 1, coluna = 1;
            for (int i = 0; i < pos && i < fonte.length(); i++)
            {
                if (fonte.charAt(i) == '\n') { linha++; coluna = 1; }
                else coluna++;
            }
            onde = " (linha " + linha + ", coluna " + coluna + ")";
        }
        
        String msg = e instanceof SyntaticError ? "token inesperado " + trechoEm(fonte, pos) : e.getMessage();
        System.out.println("Erro " + tipo + onde + ": " + msg);
        System.exit(1);
    }

    private static String trechoEm(String fonte, int pos)
    {
        if (pos < 0 || fonte.substring(Math.min(pos, fonte.length())).isBlank())
            return "(fim do programa)";
        int fim = pos + 1;
        if (Character.isLetterOrDigit(fonte.charAt(pos)))
            while (fim < fonte.length() && (Character.isLetterOrDigit(fonte.charAt(fim)) || fonte.charAt(fim) == '_'))
                fim++;
        return "'" + fonte.substring(pos, fim) + "'";
    }
}
