package br.com.fiapride.main;

import br.com.fiapride.model.Relogio;

public class SistemaPrincipal {
    private static String simNao(boolean v) { return v ? "SIM" : "NÃO"; }

    public static void main(String[] args) {
        Relogio meuRelogio = new Relogio();
        meuRelogio.resistenteAgua = true;
        meuRelogio.analogico = true;
        meuRelogio.alterarEstado("novo");
        meuRelogio.alterarResistenteAgua(10);

        Relogio relogioDoProfessor = new Relogio();
        relogioDoProfessor.resistenteAgua = true;
        relogioDoProfessor.analogico = false;
        relogioDoProfessor.alterarEstado("usado");
        relogioDoProfessor.alterarResistenteAgua(30);

        System.out.println();
        System.out.println("Meu relógio é resistente à água: " + simNao(meuRelogio.resistenteAgua));
        System.out.println("Meu relógio é analógico: " + simNao(meuRelogio.analogico));
        System.out.println("O relógio do professor é resistente à água: " + simNao(relogioDoProfessor.resistenteAgua));
        System.out.println("O relógio do professor é analógico: " + simNao(relogioDoProfessor.analogico));
    }
}