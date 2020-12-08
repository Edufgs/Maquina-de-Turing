package com.maquina.maquinaturing;

import static java.lang.System.exit;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Eduardo Gonçalves da Silva
 */
public class MaquinaTuring {   
    
    public static void main(String[] args) {
        System.out.println("Digita a cadeia: ");
        Scanner scann = new Scanner(System.in);
        String cadeia = scann.nextLine();
        cadeia+=' ';
        char fita[] = cadeia.toCharArray();
        int posicao = 0;
        q0(fita,posicao);
    }
    
    public static void q0(char[] vetor, int posicao){
        switch(vetor[posicao]) {
            case '0':
                vetor[posicao] = 'x';
                posicao++;
                q1(vetor,posicao);
                break;
                
            case 'y':
                posicao++;
                q3(vetor,posicao);  
                break;
                
            default:
                System.out.println("Erro: Palavra não aceita!!!");
                exit(0);
        }
    }
    
    public static void q1(char[] vetor, int posicao){
        switch(vetor[posicao]) {
            case '0':
                posicao++;
                q1(vetor,posicao);
                break;
            case '1':
                vetor[posicao] = 'y';
                posicao--;
                q2(vetor,posicao);
                break;
                
            case 'y':
                posicao++;
                q1(vetor,posicao);
                break;
                
            default:
                System.out.println("Erro: Palavra não aceita!!!");
                exit(0);
        }
    }
    
    public static void q2(char[] vetor, int posicao){
        switch(vetor[posicao]) {
            case '0':
                posicao--;
                q2(vetor,posicao);
                break;
                
            case 'x':
                posicao++;
                q0(vetor,posicao);
                break;
                
            case 'y':
                posicao--;
                q2(vetor,posicao);
                break;
                
            default:
                System.out.println("Erro: Palavra não aceita!!!");
                exit(0);
        }
    }
    
    public static void q3(char[] vetor, int posicao){
        switch(vetor[posicao]) {
            case 'y':
                posicao++;
                q3(vetor, posicao);
                break;
            case ' ':
                posicao++;
                q4(vetor,posicao);
                break;
                
            default:
                System.out.println("Erro: Palavra não aceita!!!");
                exit(0);
        }
    }
    
    public static void q4(char[] vetor, int posicao){
        System.out.println("Palavra aceita");
        System.out.println("Fita" + Arrays.toString(vetor));
        
    }
}    
