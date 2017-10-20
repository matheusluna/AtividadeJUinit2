/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.List;

/**
 *
 * @author mathe
 */
public class CPF {
    
    public static boolean verificaCPF(String cpf){
        String[] div1 = cpf.split("-");
        div1[0] = div1[0].replace(".", "/");
        String[] div2 = div1[0].split("/");
        String digitos = "";
        for(int i = 0; i < div2.length; i++){
            String[] div3 = div2[i].split("");
            for(int j = 0; j < div3.length; j++){
                digitos += div3[j];
            }
        }
        String[] digSep = digitos.split("");
        int[] digInt = new int[digSep.length];
        for(int i = 0; i < digSep.length; i++){
            digInt[i] = Integer.parseInt(digSep[i]);
        }
        
        int digitoVer1 = digito1(digInt);
        int digitoVer2 = digito2(digInt, digitoVer1);
        int digitoVerificador = digitoVer1*10 + digitoVer2;
        if(digitoVerificador == Integer.parseInt(div1[1])){
            return true;
        }else{
            return false;
        }
    }
    
    
    private static int digito1(int[] digitos){
        int[] ver = {10, 9, 8, 7, 6, 5, 4, 3, 2};
        int soma = 0;
        for(int i = 0; i < digitos.length; i++){
            soma += ver[i]*digitos[i];
        }
        int resto = soma%11;
        if(resto < 2){
            return 0;
        }else{
            return Math.abs(resto - 11);
        }
    }
    
    private static int digito2(int[] digitos, int digVer1){
        int[] ver = {11, 10, 9, 8, 7, 6, 5, 4, 3};
        int soma = 0;
        for(int i = 0; i < digitos.length ; i++){
            soma += ver[i]*digitos[i];
        }
        soma += 2 * digVer1;
        int resto = soma%11;
        if(resto < 2){
            return 0;
        }else{
            return Math.abs(resto - 11);
        }
    }
}
