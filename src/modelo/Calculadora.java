/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author João Vitor C. Rubert
 * @since 15/05/2017
 * @version 1.0
 */
public class Calculadora {
    
    //atributos da class
    
    private double num1;
    private double num2;
   
   //metado construtores

    public Calculadora() {
    }

    public Calculadora( double num1, double num2) {
        
        this.num1 = num1;
        this.num2 = num2;
    }


    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    //fazendo calculos metados     
    /**
     * 
     * @return  soma num1 com num2 
     */
    public double calcularSoma(){
        return num1 + num2;
    }
    /**
     * 
     * @return subtrai num1 com num 2 
     */
    public double calcularSubtracao(){
        return num1 - num2;
    }
    /**
     * 
     * @return mutiplcia num1 com num2  
     */
    public double calcularMultiplicacao(){
        return num1 * num2; 
    }
    /**
     * 
     * @return dividi num1 com num2 
     */
    public double calcularDivisao(){
        return num1 / num2;
    }
    @Override
    public String toString() {
        return  "\nNum1: "+num1
                +"\nNum2: "+num2
                +"\nO resultado da soma é: "+calcularSoma()
                +"\nO resultado da subtracão é: "+calcularSubtracao()
                +"\nO resultado da multiplicacão é: "+calcularMultiplicacao()
                +"\nO resultado da divisão é: "+calcularDivisao();
    }// fecha toString 
}//fecha clas