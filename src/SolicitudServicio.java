
public class SolicitudServicio implements Comparable<SolicitudServicio> {
    private String nombreCliente;
    private String tipoServicio;
    private int horaLlegada;

    public SolicitudServicio(String nombreCliente, String tipoServicio, int horaLlegada) {
        this.nombreCliente = nombreCliente;
        this.tipoServicio = tipoServicio;
        this.horaLlegada = horaLlegada;
    }


    public int compareTo(SolicitudServicio o) {
        // Ordenar las solicitudes por prioridad
        if (this.tipoServicio.equals(o.tipoServicio)) {
            return this.horaLlegada - o.horaLlegada;
        } else {
            return this.tipoServicio.compareTo(o.tipoServicio);
        }
    }

    @Override
    public String toString() {
        return "SolicitudServicio{" +
                "nombreCliente='" + nombreCliente + '\'' +
                ", tipoServicio='" + tipoServicio + '\'' +
                ", horaLlegada=" + horaLlegada +
                '}';
    }
}
