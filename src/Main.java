import java.util.concurrent.PriorityBlockingQueue;

public class Main {

    public static void main(String[] args) {
        //Crea una cola de prioridad para almacenar clientes
        PriorityBlockingQueue<Cliente> cola = new PriorityBlockingQueue<>(2, new OrdenarClientes());

        //Iniciar el generador de clientes que agrega clientes a la cola
        GeneradorClientes generadorClientes = new GeneradorClientes(cola);
        generadorClientes.start();

        //Crea tres peluqueros
        Peluquero P1 = new Peluquero("Paqui");
        Peluquero P2 = new Peluquero("Julian");
        Peluquero P3 = new Peluquero("Ridu");

        //Imprime el mensaje
        System.out.println("EMPIEZA LA JORNADA LABORAL EN LA PELUQUERIA DE PAQUI\n" +
                "----------------------------------------------------\n");

        while (true) {
            //Verifica si el peluquero está ocupado y hay cliente en espera
            if (!P1.isAlive() && !cola.isEmpty()) {
                P1 = new Peluquero("Paqui");
                P1.setCliente(cola.poll());
                P1.start();
            }
            if (!P2.isAlive() && !cola.isEmpty()) {
                P2 = new Peluquero("Julian");
                P2.setCliente(cola.poll());
                P2.start();
            }
            if (!P3.isAlive() && !cola.isEmpty()) {
                P3 = new Peluquero("Ridu");
                P3.setCliente(cola.poll());
                P3.start();
            }
        }
    }
}
