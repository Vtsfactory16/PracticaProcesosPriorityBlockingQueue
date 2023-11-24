import java.util.concurrent.PriorityBlockingQueue;

/**
 * La clase GeneradorClientes es un hilo que genera clientes de manera continua y los agrega a una cola de prioridad
 * Cada cliente tiene un nombre unico y una probabilidad del 40% de ser VIP
 */
public class GeneradorClientes extends Thread {
    /**
     * Atributos de la clase GeneradorClientes
     */
    private static int numero = 0; // numero asignado a un nuevo cliente
    private PriorityBlockingQueue<Cliente> cola; // cola de prioridad para almacenar los clientes

    /**
     * Constructor que recibe la cola de prioridad donde se agregarán los clientes generados
     * @param cola cola de prioridad donde almacena los clientes
     */
    public GeneradorClientes(PriorityBlockingQueue<Cliente> cola){
        this.cola = cola;
    }

    /**
     * Genera clientes de manera continua y los agrega a la cola de prioridad
     * Despues de agregar el cliente a la cola , el hilo espera durante 1500 milisegundos
     */
    @Override
    public void run() {
        while (true) {
            numero++;
            boolean esVip = Math.random() < 0.4; // 40% de probabilidad de ser VIP
            Cliente c = new Cliente("Cliente" + numero, esVip);
            cola.add(c);
            System.out.println(c + " HA ENTRADO a la peluqueria\n");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}