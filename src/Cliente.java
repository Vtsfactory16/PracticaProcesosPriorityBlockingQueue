public class Cliente implements Comparable<Cliente>{

    private String nombre;
    private boolean vip;
    
    // Constructor, getter y setter
    public Cliente(String nombre, boolean vip) {
        this.nombre = nombre;
        this.vip = vip;
    }

    public Cliente(Cliente c) {
        this.nombre = c.nombre;
        this.vip = c.vip;
    }

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", vip=" + vip + '}';
    }

    @Override
    public int compareTo(Cliente o) {
        if(this.vip && o.isVip() || !this.vip && !o.isVip()){
            return 0;
        } else if(this.vip && !o.isVip()){
            return 1;
        } else if(!this.vip && o.isVip()){
            return -1;
        }
        return 0;
    }

    

}
