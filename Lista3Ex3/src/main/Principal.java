package main;

import sp.fateczl.lucas.listaInt.*;

public class Principal {
    public static void main(String[] args) throws Exception {
        int[] vetor = {25, 42, 23, 74, 80, 77, 13, 41, 59, 35, 68, 53, 75, 84, 44, 94, 39, 71, 88};
        Lista L = new Lista();
        int tamLista = L.size();
               
        for (int i = 0; i < vetor.length; i++) {
            if (L.isEmpty()) {
                L.add(0, vetor[i] * 2);
            } else if (tamLista < 3) {
                L.add(L.size(), vetor[i] / 2);
            } else if (L.size() > 10) {
                L.add(5, vetor[i] * 3);
            } else {
                L.add(1, vetor[i]);
            }
            tamLista = L.size(); 
        }


        while (!L.isEmpty()) {
            if (L.size() > 10) {
                L.remove(2);
                System.out.println("Removido");
            } else if (L.size() > 5) {
                L.remove(L.size() - 1);
                System.out.println("Removido");
            } else if (L.size() > 3) {
                L.remove(0);
                System.out.println("Removido");
            } else {
                L.remove(0);
                System.out.println("Removido");
            }
        }
    }
}
