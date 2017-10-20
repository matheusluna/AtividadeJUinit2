/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author mathe
 */
public class Chassi {
    public static String verificaChassi(String chassi){
        if(chassi == null || chassi.length() < 10){
            return null;
        }
        if(chassi.substring(9, 10).toUpperCase().equals("A")){
            return "2010";
        }else if(chassi.substring(9, 10).toUpperCase().equals("B")){
            return "2011";
        }else if(chassi.substring(9, 10).toUpperCase().equals("C")){
            return "2012";
        }else{
            return null;
        }
    }
}
