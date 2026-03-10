package br.com.fiapride.model;

public class Relogio {

    private boolean resistenteAgua;
    private boolean analogico;
    private String estado; // "novo", "usado", etc.

    // Construtor padrão
    public Relogio() {
        this.resistenteAgua = false;
        this.analogico = true;
        this.estado = "desconhecido";
    }

    // Construtor com parâmetros 
    public Relogio(boolean resistenteAgua, boolean analogico, String estadoInicial) {
        
        this.setResistenteAgua(resistenteAgua);
        this.setAnalogico(analogico);
        this.setEstado(estadoInicial == null || estadoInicial.isBlank()
                ? "desconhecido"
                : estadoInicial);
    }

    
    public void alterarEstado(String novoEstado) {
        if (novoEstado == null || novoEstado.isBlank()) {
            System.out.println("Estado inválido.");
            return;
        }

        String e = normalizar(novoEstado);

        if (e.equals("novo")) {
            this.estado = "novo";
            System.out.println("O relógio é novo.");
            return;
        }

        if (e.equals("usado")) {
            this.estado = "usado";
            System.out.println("O relógio é usado.");
            return;
        }

        this.estado = e;
        System.out.println("Estado atualizado para: " + this.estado);
    }

    /**
     * Regra: até 20m mantém resistente; acima de 20m perde resistência.
     */
    public void alterarResistenteAgua(double profundidade) {
        if (profundidade <= 20) {
            this.resistenteAgua = true;
            System.out.println("O relógio continua resistente à água!");
        } else {
            this.resistenteAgua = false;
            System.out.println("O relógio não é mais resistente à água!");
        }
    }

    //Getters/Setters

    public boolean isResistenteAgua() { 
        return resistenteAgua; 
    }

   
    public void setResistenteAgua(boolean resistenteAgua) { 
        this.resistenteAgua = resistenteAgua; 
    }

    public boolean isAnalogico() { 
        return analogico; 
    }

    public void setAnalogico(boolean analogico) { 
        this.analogico = analogico; 
    }

    public String getEstado() { 
        return estado; 
    }

    public void setEstado(String estado) {
        if (estado != null && !estado.isBlank()) {
            this.estado = normalizar(estado);
        }
    }

    
    private String normalizar(String s) {
        return s.trim().toLowerCase();
    }
}