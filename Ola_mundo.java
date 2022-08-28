
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ola_mundo;
import javax.swing.JOptionPane;
/**
 *
 * @author luisf
 */
public class Ola_mundo {
    private double diam,sen,simp;
    private double circun,resp,resp2,resp3,resp4,resp5,resp6,resp7,resp8,resp9,resp10,resp11,resp12,resp13,resp14;
    private double area;
    private double op,r,hip,expo,abs,abs2,valor,valor2,valor3,valor4,valor5,b,c;
    int a=87;
    int a2=3/4;

    
    public Ola_mundo() {
        
        System.out.println("a raiz de 64.." + Math.sqrt(64));//calculo da raiz de 64
        System.out.println("\\nraiz com exp e log e realint: ,rea1int(exp(1/2*1og(64))) " + Math.pow(2 + Math.log(1)/Math.log(2),Math.sqrt(64)));
        System.out.println("raiz com exp e log sem realint: h',exp(1/2*log(64)) " +Math.pow(1,2)* Math.log(64));
        
  
        sen = 0.707; 
        resp = ((sen * Math.PI / 180)+0.00013); //OBSERVAR
        
        expo=2;
        resp2 = (  Math.pow(expo,(+Math.log(8))+1.3 ));
        
        resp3 = (  Math.pow(expo,(+Math.log(8)) ));
        
        resp4 = (8 * 3.3);
        
        op=( Math.log(8));
        simp= Math.pow(op, expo);
        resp5 = (Math.cbrt(simp));
     
        abs=-8;//numero absoluto
        resp6 = (Math.abs(abs));
        
          abs2=8;//numero absoluto
        resp14 = (Math.abs(abs2));
        
        valor=5.5; //esse e o numero real
        resp7 = (Math.round(valor)); //esse serve para converter para inteiro
       
        valor2=6.5; //esse e o numero real
        resp8 = (Math.round(valor2)); //esse serve para converter para inteiro
        
        valor3=6.5 + 0.0001; //esse e o numero real + 0,0001
        resp9 = (Math.round(valor3)); //esse serve para converter para inteiro
        
        valor4=5.45;//esse e o numero real
        resp10 = (Math.round(valor4));
        
        valor5=5.51;//esse e o numero real
        resp11 = (Math.round(valor5));
        
        b=(int)a; 
        resp12=b;
        
        c=(int)a2; 
        resp13=c;
        
       System.out.print( "\nformatar(sen(45*pi/180)+0.0001,3); : " + resp);
       System.out.print( "\npotencia com exp e log e formatar: \",formatar(exp(3*log(8))+0.001,3)" + resp2);
       System.out.print( "\nnpotencia com exp e log sem formatar: ,exp(3*1og(8)) ;: " + resp3);
       System.out.print( "\npotencia com operador ** e formatar: uu,formatar(8**3,3) " + resp4);
       System.out.print( "\nraiz cubica: \",exp(1/3*log(8))  " + resp5);
       System.out.print( "\nabsoluto: \",abs(-8);" + resp6);
       System.out.print( "\nabsoluto: \",abs(8): " + resp14);
       
       System.out.print( "\nconvertendo para inteiro 5.5: \",realint(5.5) " + resp7);
       System.out.print( "\nconvertendo para inteiro 6.5: \",realint(6.5);" + resp8);
       
       System.out.print( "\nconvertendo para inteiro 6.5 + 0.0001: \",realint(6.5+0.0001)" + resp9);
       System.out.print( "\nconvertendo para inteiro 5.45: \",realint(5.45) " + resp10);
       System.out.print( "\nconvertendo para inteiro 5.51: \",realint(5.51);" + resp11);
       System.out.print( "\nnconvertendo para real 87: \",intreal(87)" + resp12);
       System.out.print( "\nconvertendo para int 3/4: \",realint(3/4) " + resp13);
        System.exit(0);
        
    }
    
    public static void main(String[] args) {
        new Ola_mundo();
    }
    
}