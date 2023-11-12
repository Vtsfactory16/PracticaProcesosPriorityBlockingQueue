
import java.util.concurrent.PriorityBlockingQueue;

public class Main {

    public static void main(String[] args) {
        // Crear una peluquería
        Peluqueria peluqueria = new Peluqueria();

        // Añadir solicitudes de servicio
        peluqueria.atenderSolicitud(new SolicitudServicio("Juan", "Corte de pelo", 10));
        peluqueria.atenderSolicitud(new SolicitudServicio("María", "Tinte", 15));
        peluqueria.atenderSolicitud(new SolicitudServicio("Pedro", "Peinado", 5));

        // Ver el estado de las solicitudes
        System.out.println("Solicitudes en espera:");
        for (SolicitudServicio solicitud : peluqueria.obtenerSolicitudes()) {
            System.out.println(solicitud);
        }

        // Atender las solicitudes
        while (!peluqueria.estaVacia()) {
            SolicitudServicio solicitud = peluqueria.atenderSolicitud();
            System.out.println("Atendiendo solicitud: " + solicitud);
        }
    }
}