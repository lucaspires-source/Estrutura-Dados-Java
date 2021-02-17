package edfila;

import java.util.LinkedList;
import java.util.Queue;

public class TestaFila {
    public static void main(String[] args) {
       Fila fila = new Fila();
       System.out.println(fila);
       fila.adiciona("Zelda");
       fila.adiciona("Mario");
       fila.adiciona("Kirby");
       System.out.println(fila);
       fila.remove();
       System.out.println(fila); 

       Queue<String> FilaDoJava = new LinkedList<String>();
       FilaDoJava.add("Luffy");
       FilaDoJava.add("Zorro");
       FilaDoJava.add("Sanji");
       System.out.println(FilaDoJava);
       System.out.println(FilaDoJava.poll());
     }
}
