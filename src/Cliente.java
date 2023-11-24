public class Cliente {
    /**
     * Atributos de la clase Cliente
     */
    private String nombre; // Nombre del cliente
    private boolean vip; // Boleano para los clientes vip

    /**
     * Constructor para inicializar un objeto Cliente con un nombre y true o false para VIP
     * @param nombre nombre del cliente
     * @param vip true si es vip o false si no lo es
     */
    public Cliente(String nombre, boolean vip) {
        this.nombre = nombre;
        this.vip = vip;
    }

    /**
     * Constructor de copia que crea un nuevo objeto Cliente copiando los valores de otro cliente
     * @param c El cliente que va a ser copiado
     */
    public Cliente(Cliente c) {
        this.nombre = c.nombre;
        this.vip = c.vip;
    }

    /**
     * Getter, obtiene el nombre del cliente
     * @return el nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter, establece el nombre del cliente
     * @param nombre nuevo nombre del cliente
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Comprueba si el cliente es VIP
     * @return true si lo es, false si no
     */
    public boolean isVip() {
        return vip;
    }

    /**
     * Establece el estado VIP del cliente
     * @param vip true si el cliente es VIP, false si no lo es
     */
    public void setVip(boolean vip) {
        this.vip = vip;
    }

    /**
     * Devuelve la representacion en cadena del objeto Cliente
     * @return cadena que representa al cliente, con "(vip)" si el cliente es VIP
     */
    @Override
    public String toString() {

        String cadena = nombre;
        if (vip) {
            cadena += " (vip)";
        }
        return cadena;

    }

}