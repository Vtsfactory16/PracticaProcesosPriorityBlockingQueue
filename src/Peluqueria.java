import java.util.concurrent.PriorityBlockingQueue;
import java.util.ArrayList;
import java.util.List;
public class Peluqueria {

    private PriorityBlockingQueue<SolicitudServicio> colaSolicitudes = new PriorityBlockingQueue<>();

    public void atenderSolicitud(SolicitudServicio solicitud) {
        // Comprobar si la cola está llena
        if (colaSolicitudes.offer(solicitud)) {
            // La solicitud se ha añadido correctamente
        } else {
            // La cola está llena
            throw new RuntimeException("La cola está llena");
        }
    }
    public List<SolicitudServicio> obtenerSolicitudes() {
        // Crear una lista para almacenar las solicitudes
        List<SolicitudServicio> solicitudes = new ArrayList<>();

        // Recorrer la cola y añadir cada solicitud a la lista
        for (SolicitudServicio solicitud : colaSolicitudes) {
            solicitudes.add(solicitud);
        }

        // Devolver la lista
        return solicitudes;
    }
    public SolicitudServicio atenderSolicitud() {
        // Obtener la solicitud con la mayor prioridad
        SolicitudServicio solicitud = colaSolicitudes.poll();

        // Devolver la solicitud
        return solicitud;
    }
    public boolean estaVacia() {
        // Comprobar si la cola está vacía
        return colaSolicitudes.isEmpty();
    }
}
