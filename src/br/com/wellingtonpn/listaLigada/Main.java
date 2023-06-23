package br.com.wellingtonpn.listaLigada;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ListaLigada listaLigada = new ListaLigada();
        listaLigada.toAdd("RATT");
        listaLigada.toAdd("WhiteSnake");
        listaLigada.toAdd("Cinderella");
        listaLigada.toAdd("W.A.S.P");
        System.out.println("Size of the list: " + listaLigada.getSize());
        System.out.println("First of the list: " + listaLigada.getFirst().getValue());
        System.out.println("Last of the list: " + listaLigada.getLast().getValue());

        for (int i = 0 ; i < listaLigada.getSize() ; i++)
        {
            System.out.println("Get node of the list: " + listaLigada.get(i).getValue());
        }
        System.out.println("Remove method call: ");
        listaLigada.remove("w.a.s.p");

        for (int i = 0 ; i < listaLigada.getSize() ; i++)
        {
            System.out.println("Get node of the list: " + listaLigada.get(i).getValue());
        }
//        Scanner scanner = new Scanner(System.in);
//        String node = scanner.next();
//        if(listaLigada.getSize() != 0)
//        {
//            (node);
//        }

    }
}
