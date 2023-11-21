package Peluqueria;
public class GeneradorClientes {

    private static int numero = 0;
    public static void main(String[] args) {

        do {
            Cliente cliente = generarCliente();
            System.out.println("Cliente Generado: " + cliente);


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } while (true);

    }

    public static Cliente generarCliente() {
        numero++;
        boolean esVip = Math.random() < 0.4; // 40% de probabilidad de ser VIP
        return new Cliente("Cliente" + numero, esVip);
    }
}