import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;


public class Pruebas {

    public static void main(String[] args) {

        int Cont1 = 0, Cont2 = 0;

        Cliente cliente1 = new Cliente("Cliente 1", true);
        Cliente cliente2 = new Cliente("Cliente 2", false);
        Cliente cliente3 = new Cliente("Cliente 3", false);
        Cliente cliente4 = new Cliente("Cliente 4", false);
        Cliente cliente5 = new Cliente("Cliente 5", false);
        Cliente cliente6 = new Cliente("Cliente 6", true);
        Cliente cliente7 = new Cliente("Cliente 7", false);
        Cliente cliente8 = new Cliente("Cliente 8", false);
        Cliente cliente9 = new Cliente("Cliente 9", false);
        Cliente cliente10 = new Cliente("Cliente 10", true);
        Cliente cliente11 = new Cliente("Cliente 11", true);
        Cliente cliente12 = new Cliente("Cliente 12", false);
        Cliente cliente13 = new Cliente("Cliente 13", false);
        Cliente cliente14 = new Cliente("Cliente 14", false);
        Cliente cliente15 = new Cliente("Cliente 15", false);
        Cliente cliente16 = new Cliente("Cliente 16", true);
        Cliente cliente17 = new Cliente("Cliente 17", false);
        Cliente cliente18 = new Cliente("Cliente 18", false);
        Cliente cliente19 = new Cliente("Cliente 19", false);
        Cliente cliente20 = new Cliente("Cliente 20", true);

        PriorityBlockingQueue<Cliente> cola = new PriorityBlockingQueue(10, new OrdenarClientes());
        
        cola.add(cliente1);
        cola.add(cliente2);
        cola.add(cliente3);
        cola.add(cliente4);
        cola.add(cliente5);
        cola.add(cliente6);
        cola.add(cliente7);
        cola.add(cliente8);
        cola.add(cliente9);
        cola.add(cliente10);

        for (Cliente c : cola) {
            System.out.println(cola.poll());
        }
        System.out.println(cola.peek());

    }
}
