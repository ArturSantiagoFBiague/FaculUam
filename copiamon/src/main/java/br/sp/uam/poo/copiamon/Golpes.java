
package br.sp.uam.poo.copiamon;


public class Golpes {
    private String nome;
    private String tipo;
    private int poder;
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPoder(int poder) {
        this.poder = poder;
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
    
    
    public Golpes(String nome, String tipo, int poder){
        setNome(nome);
        setTipo(tipo);
        setPoder(poder);

    }
    
}


