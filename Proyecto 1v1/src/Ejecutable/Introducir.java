package Ejecutable;

import java.util.Scanner;

import Imprimir.Imprimir;

import java.util.InputMismatchException;

/**
 * Clase donde ubico los métodos para el control de errores en la introducción de variables.
 * 
 */

public class Introducir {

  /**
   * MÃ©todo que recoje un char por teclado y lo devuelve
   * 
   * @return char
   */
  public static char getChar() {
    
    Scanner scan = new Scanner(System.in);
    
    char value = scan.next().charAt(0);
    
    return value;
  }

  /**
   * MÃ©todo que devuelve un entero con el previo control de errores, el texto que recibe el mÃ©todo lo imprime 
   * por pantalla antes de recoger la variable por teclado.
   * 
   * @param text
   * @return int
   */
  public static int getInt(String text) {
    
    boolean validNum = true;
    Scanner scan = new Scanner(System.in);
    int num = 0;

    do {   
      try {
        Imprimir.p(text);
        num = scan.nextInt();

        if (num < 0) {
          validNum = true;
          Imprimir.P("Debe ingresar obligatoriamente un numero valido.");       
        }else{
          validNum = false;
        }

        
      }  catch (InputMismatchException ex) {
        
        scan.nextLine();
        validNum = true;
        Imprimir.P("Debe ingresar obligatoriamente un numero valido.");
        

      } catch (Exception e) {
        
        scan.nextLine();
        validNum = true;
        Imprimir.P("Debe ingresar obligatoriamente un numero valido.");

      }
    } while(validNum);
    
    return num;
  }

  /**
   * MÃ©todo que devuelve un float con el previo control de errores, el texto que recibe el mÃ©todo lo imprime 
   * por pantalla antes de recoger la variable por teclado.
   * 
   * @param text
   * @return float
   */
  public static float getFloat(String text) {
    boolean validNum = true;
    Scanner scan = new Scanner(System.in);
    float num = -1;

    do {   
      try {
        Imprimir.p(text);
        num = scan.nextFloat();

        if (num < 0) {
          validNum = true;
          Imprimir.P("Debe ingresar obligatoriamente un numero valido.");       
        }else{
          validNum = false;
        }

        
      }  catch (InputMismatchException ex) {
        
        scan.nextLine();
        validNum = true;
        Imprimir.P("Debe ingresar obligatoriamente un numero valido.");
        

      } catch (Exception e) {
        
        scan.nextLine();
        validNum = true;
        Imprimir.P("Debe ingresar obligatoriamente un numero valido.");

      }
    } while(validNum);
    
    return num;
  }
  
  /**
   * Método que devuelve un double con el previo control de errores, el texto que recibe el método lo imprime 
   * por pantalla antes de recoger la variable por teclado.
   * 
   * @param text
   * @return double
   */
  public static double getDouble(String text) {
    
    boolean validNum = true;
    Scanner scan = new Scanner(System.in);
    double num = 0;

    do {   
      try {
        Imprimir.p(text);
        num = scan.nextDouble();

        if (num < 0) {
          validNum = true;
          Imprimir.P("Debe ingresar obligatoriamente un numero valido.");       
        }else{
          validNum = false;
        }

        
      }  catch (InputMismatchException ex) {
        
        scan.nextLine();
        validNum = true;
        Imprimir.P("Debe ingresar obligatoriamente un numero valido.");
        

      } catch (Exception e) {
        
        scan.nextLine();
        validNum = true;
        Imprimir.P("Debe ingresar obligatoriamente un numero valido.");

      }
    } while(validNum);
    
    return num;
  }
  
  /**
   * MÃ©todo que devuelve un String, el texto que recibe el mÃ©todo lo imprime 
   * por pantalla antes de recoger la variable por teclado.
   * 
   * @param text
   * @return String
   */
  public static String getString(String text){
    Scanner scan = new Scanner(System.in);
    String value;

    Imprimir.p(text);
    value = scan.nextLine();

    return value;
  }

 
}
