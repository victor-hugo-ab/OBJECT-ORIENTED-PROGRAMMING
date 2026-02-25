
package br.com.fiapride.main;

import br.com.fiapride.model.Relogio;

public class SistemaPrincipal {
    public static void main(String[] args) {

        // Instância 1
        Relogio meuRelogio = new Relogio();
        meuRelogio.resistenteAgua = true;   
        meuRelogio.analogico = true;

        // Instância 2
        Relogio relogioDoProfessor = new Relogio();
        relogioDoProfessor.resistenteAgua = true;
        relogioDoProfessor.analogico = false; 

        System.out.println("Meu relógio é resistente à água: " + (meuRelogio.resistenteAgua ? "SIM" : "NÃO"));
        System.out.println("Meu relógio é analógico: " + (meuRelogio.analogico ? "SIM" : "NÃO"));
        System.out.println("O relógio do professor é resistente à água: " + (relogioDoProfessor.resistenteAgua ? "SIM" : "NÃO"));
        System.out.println("O relógio do professor é analógico: " + (relogioDoProfessor.analogico ? "SIM" : "NÃO"));
    }
}
