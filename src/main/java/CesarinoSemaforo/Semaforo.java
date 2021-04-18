/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CesarinoSemaforo;

/**
 *
 * @author Francesco
 */
public class Semaforo {
    
    int valore;
    
    public Semaforo(int v){
        
        valore = v;
    }
    
    synchronized public void P(){
        while (valore == 0){
            try{wait();}
            catch(InterruptedException e){}
        }
        valore--;
    }
    
    synchronized public void V(){
        valore++;
        notify();
    }
}
