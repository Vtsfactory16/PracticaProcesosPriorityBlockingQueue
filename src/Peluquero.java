public class Peluquero extends Thread{

    private String nombre;
    private Cliente cliente;
    private long initialTime;

    // Constructor, getter & setter
    public Peluquero(String nombre, Cliente cliente, long initialTime) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.initialTime = initialTime;
    }

    public Peluquero(String nombre) {
        this.nombre = nombre;
        this.cliente = null;
        this.initialTime = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public long getInitialTime() {
        return initialTime;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setInitialTime(long initialTime) {
        this.initialTime = initialTime;
    }


    @Override
    public void run() {
        if (this.cliente == null) {
            System.out.println("El peluquero " + this.nombre + " no tiene clientes en espera.");
            return;
        }

        System.out.println("El peluquero " + this.nombre + " comienza a pelar al cliente "
                + this.cliente.getNombre() + " EN EL TIEMPO: "
                + (System.currentTimeMillis() - this.initialTime) / 1000
                + "seg");

        System.out.println("El peluquero " + this.nombre + " HA TERMINADO DE PELUQUIAR  al cliente"
                + this.cliente.getNombre() + " EN EL TIEMPO: "
                + (System.currentTimeMillis() - this.initialTime) / 1000
                + "seg");
    }

    private void esperarXsegundos(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}