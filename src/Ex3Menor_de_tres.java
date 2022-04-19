import java.util.Locale;
import java.util.Scanner;

public class Ex3Menor_de_tres
{

    public static void main(
        String[] args )
    {
        Locale.setDefault( Locale.US );
        final Scanner sc = new Scanner( System.in );

        int primeiroValor, segundoValor, terceiroValor, menor;

        System.out.print( "Primeiro valor: " );
        primeiroValor = sc.nextInt();

        System.out.print( "Segundo valor: " );
        segundoValor = sc.nextInt();

        System.out.print( "Terceiro valor: " );
        terceiroValor = sc.nextInt();

        if( primeiroValor < segundoValor && primeiroValor < terceiroValor ) {
            menor = primeiroValor;

        } else if( segundoValor < terceiroValor ) {

            menor = segundoValor;
        } else {
            menor = terceiroValor;
        }

        sc.close();

    }

}
