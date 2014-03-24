/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Charlie
 */
public class clsFichero {
    
    private String rutaPrincipal = System.getProperty("user.dir")+"\\contactos.txt";
    
    public ArrayList<clsPersona> leerFichero()
    {
        ArrayList<clsPersona> personas = new ArrayList<clsPersona>();
        try{
            FileReader fr = new FileReader(rutaPrincipal);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while((linea=br.readLine())!=null){
                String[] resultado = separarPorComas(linea);
                clsPersona p = asignarValoresAClasePersona(resultado);
                personas.add(p);
            }
            return personas;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return personas;
   }
    
    public void escribirFichero(ArrayList<clsPersona> personas){
        try{
            FileWriter fichero = new FileWriter(rutaPrincipal);
            PrintWriter pw = new PrintWriter(fichero);
            for(clsPersona p : personas){
                pw.println(p.getCodigo()+","+p.getNombre()+","+p.getTelefonoFijo()+","+p.getCelular()+","+p.getEmail()+","+p.getSexo()+","+p.getTipoPersona()+","+p.getEstado()+","+p.getDia()+","+p.getMes()+","+p.getAnio());
            }
            fichero.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    private String[] separarPorComas(String linea){
        String[] resultado = linea.split(",");
        return resultado;
    }
    
    private clsPersona asignarValoresAClasePersona(String[] valores){
        clsPersona p = new clsPersona();
        p.setCodigo(Integer.parseInt(valores[0]));
        p.setNombre(valores[1]);
        p.setTelefonoFijo(valores[2]);
        p.setCelular(valores[3]);
        p.setEmail(valores[4]);
        p.setSexo(valores[5].charAt(0));
        p.setTipoPersona(valores[6]);
        p.setEstado(valores[7].charAt(0));
        p.setDia(valores[8]);
        p.setMes(valores[9]);
        p.setAnio(valores[10]);
        return p;
    }
    
    
}
