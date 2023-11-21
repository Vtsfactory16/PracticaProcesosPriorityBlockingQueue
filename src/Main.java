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


        PriorityBlockingQueue<Cliente> cola = new PriorityBlockingQueue<>(20, new OrdenarClientes());
        for (int i = 0; i < 20; i++) {
            cola.add(GeneradorClientes.generarCliente());
        }
        System.out.println(cola);

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
                P2 = new Peluquero("Julian");
                P2.setCliente(cola.poll());
                P2.setInitialTime(initialTime);
                P2.start();
                Cont2++;
            }
            if (!P3.isAlive()) {
                System.out.println("Llega un cliente a " + P3.getNombre());
                P3 = new Peluquero("Ridu");
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