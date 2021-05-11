
package br.sp.uam.poo.copiamon;


public class Golpes {
    private String nome;
    private String tipo;
    private int poder;
    
    
    public Golpes(String nome, String tipo, int poder){
        setNome (nome);
        setTipo(tipo);
        setPoder(poder);

    }

    
    
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public void setTipo(String novoTipo) {
        this.tipo = novoTipo;
    }

    public void setPoder(int novoPoder) {
        this.poder = novoPoder;
    }

    
    
    
    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public int getPoder() {
        return poder;
    }
    
}


