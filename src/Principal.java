import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el limite de la tarjeta: ");
        double limite = teclado.nextDouble();
        TarjetaDeCredito tarjeta = new TarjetaDeCredito(limite);



    }
}
