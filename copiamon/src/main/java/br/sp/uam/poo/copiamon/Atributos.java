
package br.sp.uam.poo.copiamon;



public class Atributos extends Golpes {
    
    
    private String nome;
    private String elemento;
    private int vida;
    private int defesa;
    private int velocidade;

    public Atributos(String umNome, String umTipo, int umPoder, String nome, String umElemento, int umaVida, int umaDefesa, int umaVelocidade) {
        super(umNome, umTipo, umPoder);
        this.nome = umNome;
        this.elemento = umElemento;
        this.vida = umaVida ;
        this.defesa = umaDefesa;
        this.velocidade = umaVelocidade;
    }

  
    

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public void setElemento(String novoElemento) {
        this.elemento = novoElemento;
    }

    public void setVida(int novaVida) {
        this.vida = novaVida;
    }

    public void setDefesa(int novaDefesa) {
        this.defesa = novaDefesa;
    }

    public void setVelocidade(int novaVelocidade) {
        this.velocidade = novaVelocidade;
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

    
    
     
    
    

