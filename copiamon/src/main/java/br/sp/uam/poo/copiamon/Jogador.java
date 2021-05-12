package br.sp.uam.poo.copiamon;


import java.util.Scanner;


public class Jogador {
    
    int [] vidaMonstrosJogador1 = new int[6];
    int [] qtdMonstrosJogador1 = new int[3]; 
        
    Atributos Isqueirinho = new Atributos("Baforada-Quente", "Plasma", 3, "Isqueirinho", "Fogo", 10, 10, 15, 3); 
    Atributos Geloso = new Atributos("Ataque-neutro", "Neutro", 2, "Geloso", "Gelo", 16, 8, 20, 1);
    Atributos Taser = new Atributos("1000V", "Choque", 3, "Taser", "Eletrico", 8, 5, 11, 1); 
    Atributos Bufoso = new Atributos("Bufa", "Gasoso", 3, "Bufoso", "Gas", 13, 6, 7, 2);
    Atributos Areioso = new Atributos("Tempestade de Areia", "Grao", 2, "Areioso", "Areia", 8, 8, 13, 2);
    Atributos Ervinha = new Atributos("Cipo Milenar", "Plantoso", 1, "Ervinha", "Planta", 12, 6, 12, 3);
    int num;
    
    public Jogador(){
         

        //Scanner sc = new Scanner(System.in);
        // num = sc.nextInt();
        for(int i = 0;i < 3; i++ ){
            
            
            
    	
            System.out.println("Batalha pokemon \n ---------------- \n 1- Isqueirinho \n tipo: Fogo \n Poder: 10 \n Defesa: 15 \n 2- Geloso \n  tipo: Gelo \n Poder: 8 \n Defesa: 20 \n 3 - Taser \n tipo: Eletrico \n Poder: 5 \n Defesa: 11 \n 4 - Bufoso \n tipo: Gasoso \n Poder: 6 \n Defesa: 7 \n 5 - Areioso \n tipo: Areia \n Poder: 8 \n Defesa: 13 \n 6 -  Ervinha \n tipo: Planta \n Poder: 6 \n Defesa: 12 \n ---------------- \n Selecione o numero do pokemon que deseja: ");
            
            
            
            
            System.out.println("Digite o numero");
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
     
     
            switch(num) {
                case 1:
        	 
                    System.out.println("\n ------------ O monstro selecionado foi ------------ " + Isqueirinho.getNome());
                    vidaMonstrosJogador1[i] = Isqueirinho.getVida();
                    qtdMonstrosJogador1[i] = 1; 
                
                    break;
            case 2:
                    vidaMonstrosJogador1[i] = Geloso.getVida();
                    qtdMonstrosJogador1[i] = 2;
                    System.out.println(" \n ------------ O monstro selecionado foi ------------ " + Geloso.getNome());
                    
                    break;
            case 3:
                    vidaMonstrosJogador1[i] = Taser.getVida();
                    qtdMonstrosJogador1[i] = 3;
                    System.out.println("\n ------------ O monstro selecionado foi ------------ " + Taser.getNome());        	
                    
                    break;
            case 4:
                    vidaMonstrosJogador1[i] = Bufoso.getVida();
                    qtdMonstrosJogador1[i] = 4;
                    System.out.println("\n ------------ O monstro selecionado foi ------------ " + Bufoso.getNome());
                    
                    break;
            case 5:
                    vidaMonstrosJogador1[i] = Areioso.getVida();
                    qtdMonstrosJogador1[i] = 5;  
                    System.out.println("\n ------------ O monstro selecionado foi ------------ " + Areioso.getNome());
                    
                    break;
            case 6:
                    vidaMonstrosJogador1[i] = Ervinha.getVida();
                    qtdMonstrosJogador1[i] = 6; 
                    System.out.println("\n ------------ O monstro selecionado foi ------------ " + Ervinha.getNome());
                    
                    break;
            }
        }
    }
    
    
    public int getVidaMonstro1(){
        return vidaMonstrosJogador1[1];
    }
    
    
}
