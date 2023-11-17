/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.concurrent.PriorityBlockingQueue;


public class Main {

    /*
    private PriorityBlockingQueue cola;
    private Peluquero P1;
    private Peluquero P2;
    private Peluquero P3;
    private long initialTime;
    private int Cont1=0,cont2=0;
     */
    public static void main(String[] args) {

        int Cont1 = 0, Cont2 = 0, Cont3 = 0;

        Cliente cliente1 = new Cliente("Cliente 1", false);
        Cliente cliente2 = new Cliente("Cliente 2", false);
        Cliente cliente3 = new Cliente("Cliente 3", false);
        Cliente cliente4 = new Cliente("Cliente 4", false);
        Cliente cliente5 = new Cliente("Cliente 5", false);
        Cliente cliente6 = new Cliente("Cliente 6", false);
        Cliente cliente7 = new Cliente("Cliente 7", false);
        Cliente cliente8 = new Cliente("Cliente 8", false);
        Cliente cliente9 = new Cliente("Cliente 9", false);
        Cliente cliente10 = new Cliente("Cliente 10", false);
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

        PriorityBlockingQueue<Cliente> cola = new PriorityBlockingQueue();
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

        long initialTime = System.currentTimeMillis();

        Peluquero P1 = new Peluquero("Paqui");
        Peluquero P2 = new Peluquero("Julian");
        Peluquero P3 = new Peluquero("Ridu");

        while (!cola.isEmpty()) {
            if (!P1.isAlive()) {
                System.out.println("Llega un cliente a " + P1.getNombre());
                P1 = new Peluquero("Paqui");
                P1.setCliente(cola.poll());
                P1.setInitialTime(initialTime);
                P1.start();
                Cont1++;
            }
            if (!P2.isAlive()) {
                System.out.println("Llega un cliente a " + P2.getNombre());
                P1 = new Peluquero("Julian");
                P2.setCliente(cola.poll());
                P2.setInitialTime(initialTime);
                P2.start();
                Cont2++;
            }
            if (!P3.isAlive()) {
                System.out.println("Llega un cliente a " + P3.getNombre());
                P1 = new Peluquero("Ridu");
                P3.setCliente(cola.poll());
                P3.setInitialTime(initialTime);
                P3.start();
                Cont3++;
            }
        }

        System.out.println(P1.getNombre() + " ha pelado a " + Cont1 + " clientes\n"
                + P2.getNombre() + " ha pelado a " + Cont2 + " clientes\n"
                + P3.getNombre() + " ha pelado a " + Cont3 + " clientes\n");
    }
}
