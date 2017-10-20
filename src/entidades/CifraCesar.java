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
public class CifraCesar {
    public static String criptografa(String msg, int num){
        String[] alfabeto = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
            "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String crip = "";
        for(int i = 0; i < msg.length(); i++){
            if(msg.substring(i, i+1).equals(" ")){
                crip += " ";
            }else{
                for(int j = 0; j < alfabeto.length; j++){
                    if(msg.substring(i, i+1).toUpperCase().equals(alfabeto[j])){
                        int cont = 0;
                        if(j+num >= alfabeto.length){
                            cont = (j+num)-alfabeto.length;
                        }else{
                            cont = j+num;
                        }
                        crip += alfabeto[cont];
                    }
                }
            }
        }
        return crip;
    }
    
    public static String descriptografa(String msg, int num){
        String[] alfabeto = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
            "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String crip = "";
        for(int i = 0; i < msg.length(); i++){
            if(msg.substring(i, i+1).equals(" ")){
                crip += " ";
            }else{
                for(int j = 0; j < alfabeto.length; j++){
                    if(msg.substring(i, i+1).toUpperCase().equals(alfabeto[j])){
                        int cont = 0;
                        if(j-num < 0){
                            cont = (j-num)+alfabeto.length;
                        }else{
                            cont = j-num;
                        }
                        crip += alfabeto[cont];
                    }
                }
            }
        }
        return crip;
    }
}
