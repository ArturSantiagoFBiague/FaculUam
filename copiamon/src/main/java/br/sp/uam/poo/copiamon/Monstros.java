
package br.sp.uam.poo.copiamon;



public class Monstros {
    
    private Golpes golpe1;
    private Golpes golpe2;
    private String nome;
    private String elemento;
    private int vida;
    private int defesa;
    private int velocidade;

    public Monstros(Golpes golpe2, String nome, String elemento, int vida, int defesa, int velocidade) {
        this.golpe2 = golpe2;
        this.nome = nome;
        this.elemento = elemento;
        this.vida = vida;
        this.defesa = defesa;
        this.velocidade = velocidade;
    }
    
    
    
    

    
    
    
    public void setGolpe1(Golpes golpe1) {
        this.golpe1 = new Golpes("Auto Ataque", "Padrao", 3);
    }
    
    public void setGolpe2(Golpes golpe2) {
        this.golpe1 = golpe2;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    
    
    
    
    
    
    public Golpes getGolpe1() {
        return golpe1;
    }
    
    public Golpes getGolpe2() {
        return golpe2;
    }

    public String getNome() {
        return nome;
    }

    public String getElemento() {
        return elemento;
    }

    public int getVida() {
        return vida;
    }

    public int getDefesa() {
        return defesa;
    }

    public int getVelocidade() {
        return velocidade;
    }
    
     
    
    
}
