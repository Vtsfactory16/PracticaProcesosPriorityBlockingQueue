/**
 * Esta clase representa a tres peluquero que deben pelar a clientes
 * Cada peluquero tiene un nombre, un cliente al que esta atendiendo y el tiempo que tarda en hacerlo
 */
public class Peluquero extends Thread {
    /**
     * Atributos de la clase Peluquero
     */
    private String nombre;
    private Cliente cliente;

    private long tiempoPelado;

    /**
     * Constructor que inicializa  un peluquero
     * @param nombre    nombre del peluquero
     * @param cliente   nombre del cliente al que atiende el peluquero
     * @param tiempoPelado  tiempo que tarda el peluquero en peluquiar al cliente
     */
    public Peluquero(String nombre, Cliente cliente, long tiempoPelado) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.tiempoPelado = tiempoPelado;
    }

    /**
     * Constructor que inicializa un peluquero con un nombre
     * El cliente se establece como nulo y el tiempo de pelado se elige aleatoriamente entre 5 y 10 seg
     * @param nombre    nombre del peluquero
     */
    public Peluquero(String nombre) {
        this.nombre = nombre;
        this.cliente = null;

        this.tiempoPelado = (long) (Math.random() * 5 + 5); // tiempo de 5 a 10 segundos
    }

    /**
     * Obtiene el nombre del peluquero
     * @return  nombre del peluquero
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el cliente al que estça atendiendo
     * @return el cliente al que esta atendiendo el peluquero
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Obtiene el tiempo que tarda el peluquero en realizar el pelado
     * @return tiempo que tarda el peluquero en realizar el pelado , en segundos
     */
    public long getTiempoPelado() {
        return tiempoPelado;
    }

    /**
     * Establece el nombre del peluquero
     * @param nombre    nuevo nombre del peluquero
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece el cliente al que está atendiendo el peluquero
     * @param cliente   el nuevo cliente al que atiende el peluqero
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * tiempo que tarda el peluquero en realizar el pelado
     * @param tiempoPelado  nuevo tiempo que tarda el peluquero en pelar, en segundos
     */
    public void setTiempoPelado(long tiempoPelado) {
        this.tiempoPelado = tiempoPelado;
    }

    /**
     * Representa el proceso de pelado del peluquero
     * Muestra mensaje en la consola indicando el inicio y el fin del pelado
     */
    @Override
    public void run() {
        if (this.cliente == null) {
            System.out.println("El peluquero " + this.nombre + " no tiene clientes en espera.\n");
            return;
        }

        System.out.println("El peluquero " + this.nombre + " COMIENZA A PELAR al cliente "
                + this.cliente + "\n");

        esperarXsegundos();

        System.out.println("El peluquero " + this.nombre + " HA TERMINADO DE PELUQUIAR  al cliente "
                + this.cliente + " en "
                + this.tiempoPelado + " segundos\n");
    }

    /**
     * Metodo privado que simula la espera del peluquero durante el tiempo de pelado
     * Captura la excepcion InterruptedException
     */
    private void esperarXsegundos() {
        try {
            Thread.sleep(this.tiempoPelado * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}