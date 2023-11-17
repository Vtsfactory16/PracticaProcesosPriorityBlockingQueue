package Peluqueria;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;

/**
 *
 * @author carlos
 */
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
