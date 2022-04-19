import java.util.Locale;
import java.util.Scanner;

// Problema "baskara"
// Fazer um programa para ler os tr�s coeficientes de uma equa��o do segundo
// grau. Usando a f�rmula
// de Baskara, calcular e mostrar os valores das ra�zes x1 e x2 da equa��o com
// quatro casas decimais,
// conforme exemplo. Se a equa��o n�o possuir ra�zes reais, mostrar uma
// mensagem.

public class Ex2Baskara
{

    public static void main(
        String[] args )
    {

        Locale.setDefault( Locale.US );
        final Scanner sc = new Scanner( System.in );

        double a, b, c, delta, x1, x2;

        System.out.print( "Coeficiente a: " );
        a = sc.nextDouble();

        System.out.print( "Coeficiente b: " );
        b = sc.nextDouble();

        System.out.print( "Coeficiente c: " );
        c = sc.nextDouble();

        delta = ( b * b ) - ( 4 * a * c );

        if( delta < 0 ) {
            System.out.println( "Esta equacao nao possui raizes reais" );
        } else {
            x1 = ( ( - b ) + Math.sqrt( delta ) ) / ( 2 * a );
            x2 = ( ( - b ) - Math.sqrt( delta ) ) / ( 2 * a );

            System.out.printf( "X1 = %.4f%n", x1 );
            System.out.printf( "X2 = %.4f%n", x2 );
        }

        sc.close();
    }
}