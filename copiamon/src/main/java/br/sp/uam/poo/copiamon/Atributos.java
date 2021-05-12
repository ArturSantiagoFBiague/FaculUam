
package br.sp.uam.poo.copiamon;



public class Atributos extends Golpes {
    
    
    private String nome;
    private String elemento;
    private int vida;
    private int poder;
    private int defesa;
    private int velocidade;

    public Atributos(String nomeGolpe, String tipoGolpe, int poderGolpe, String nomePokemon, String elementoPokemon, int vidaPokemon, int poderPokemon, int defesaPokemon, int velocidadePokemon) {
        super(nomeGolpe, tipoGolpe, poderGolpe);
        this.nome = nomePokemon;
        this.elemento = elementoPokemon;
        this.vida = vidaPokemon;
        this.poder = poderPokemon;
        this.defesa = defesaPokemon;
        this.velocidade = velocidadePokemon;
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
    
    public void setPoder(int novoPoder) {
        this.poder = novoPoder;
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
    
    public int getPoder() {
        return poder;
    }

    public int getDefesa() {
        return defesa;
    }

    public int getVelocidade() {
        return velocidade;
    }

    
    
}

    
    
     
    
    

