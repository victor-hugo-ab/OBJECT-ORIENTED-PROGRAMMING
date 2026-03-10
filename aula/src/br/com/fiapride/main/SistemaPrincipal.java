package br.com.fiapride.main;

import br.com.fiapride.model.Relogio;

public class SistemaPrincipal {
    private static String simNao(boolean v) { return v ? "SIM" : "NÃO"; }

    public static void main(String[] args) {
        System.out.println("--- Teste FiapRide | Objeto: Relógio ---\n");

        // Use o construtor e/ou setters (não acesse atributos privados)
        Relogio meuRelogio = new Relogio();
        meuRelogio.setResistenteAgua(true);
        meuRelogio.setAnalogico(true);
        meuRelogio.alterarEstado("novo");
        meuRelogio.alterarResistenteAgua(10); // mantém resistente

        Relogio relogioDoProfessor = new Relogio(false, false, "usado");
        relogioDoProfessor.alterarResistenteAgua(30); // perde resistência

        System.out.println();
        System.out.println("Meu relógio é resistente à água: " + simNao(meuRelogio.isResistenteAgua()));
        System.out.println("Meu relógio é analógico: " + simNao(meuRelogio.isAnalogico()));
        System.out.println("Estado do meu relógio: " + meuRelogio.getEstado());

        System.out.println();
        System.out.println("Relógio do professor é resistente à água: " + simNao(relogioDoProfessor.isResistenteAgua()));
        System.out.println("Relógio do professor é analógico: " + simNao(relogioDoProfessor.isAnalogico()));
        System.out.println("Estado do relógio do professor: " + relogioDoProfessor.getEstado());
    }
}
``