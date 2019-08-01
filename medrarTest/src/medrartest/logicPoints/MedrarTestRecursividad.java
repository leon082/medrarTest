/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medrartest.logicPoints;

/**
 *
 * @author luis.leon
 */
public class MedrarTestRecursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int V[] = {1,2,3,4};
        
        System.out.println(" Digits added 123456 " + addDigits(123456));
        System.out.println("Factorial 10 -> "+factorial(10));        
        System.out.println("Bigger between {1,2,3,4} " + biggerNumber(V, 0, V.length-1));
    }


//Sumar los dígitos de un número de 6 caracteres dado de forma aleatoria
    static int addDigits(int num) {
        if (num == 0) {
            return 0;
        } else {
            return addDigits(num / 10) + num % 10;
        }

    }
//Encontrar el factorial de un número entre 1 y 10 dado de manera aleatoria
    static int factorial(int num) {
        if (num <= 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
    
    //Encontrar el número mayor en un arreglo de 12 posiciones llenado de manera aleatoria
    static int biggerNumber(int [] array, int bigger, int index){
        if(index == 0){
            return bigger;
        }else{
            bigger = array[index] > bigger ? array[index]: bigger;
            return biggerNumber(array, bigger,index-1);
        }
    }

}


