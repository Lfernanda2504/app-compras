import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el limite de la tarjeta: ");
        double limite = teclado.nextDouble();
        TarjetaDeCredito tarjeta = new TarjetaDeCredito(limite);

        int salir = 1;
        while (salir != 0){
            System.out.println("Ingresa la descripción de la compra: ");
            String descripcion = teclado.next();

            System.out.println("Ingresa el valor de la compra:");
            double valor = Double.valueOf(teclado.next());

            Compra compra = new Compra(valor, descripcion);
            boolean compraRealizada = tarjeta.lanzarCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada!");
                System.out.println("Ingrese 0 para salir o 1 para continuar");
                salir = teclado.nextInt();

            }else {
                    System.out.println("Saldo insuficiente!");
                    salir = 0;
                }
            }
            System.out.println("***********************");
            System.out.println("COMPRAS REALIZADAS:\n");
            Collections.sort(tarjeta.getListaDeCompras());
            for (Compra compra : tarjeta.getListaDeCompras()) {
                System.out.println(compra.getDescripcion() + " - " +compra.getValor());
            }
            System.out.println("\n***********************");
            System.out.println("\nSaldo de la tarjeta: " +tarjeta.getSaldo());
        }


    }