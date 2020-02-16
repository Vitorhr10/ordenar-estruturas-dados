/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordena;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Vitor
 */
public class Ordena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    BufferedReader in = new BufferedReader ( new InputStreamReader (System.in));
    
    try{
      int contador = 0;
      String []vetor = new String[6];
      OrdenaVetor e = new OrdenaVetor(vetor);
      
      // Insere as letras no vetor de 6 caracteres
      while(contador != 6 ){
        System.out.println("Insira uma letra: ");
        vetor[contador] = in.readLine();
        contador++;
      }
      
      // Métodos ordena e mostrar
      e.ordenar();
      e.mostrar();
      
    }catch(Exception e){
    
    }
    }
    
}
