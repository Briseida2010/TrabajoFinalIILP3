/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author azteca
 */
public class clsPersona {

    public clsPersona(){
    
    }
    
    private int codigo;
    private String nombre;
    private String telefonoFijo;
    private String celular; 
    private String email; 
    private char sexo;
    private String tipoPersona;
    private char estado;
    private String dia;
    private String mes;
    private String anio;
   
  
    public void getFechaNacimiento(String dia, String mes, String anio) {
        
       // JOptionPane.showMessageDialog(null,"La fecha es " + dia+"/"+mes+"/"+anio);
    }

    public clsPersona(int codigo,String nombre, String telefonoFijo,
            String celular, String email,char sexo,String tipoPersona,
            char estado,String dia, String mes,String anio){
        this.codigo=codigo;
        this.nombre=nombre;
        this.telefonoFijo=telefonoFijo;
        this.celular=celular;
        this.email=email;
        this.sexo=sexo;
        this.tipoPersona=tipoPersona;
        this.estado=estado;
        this.dia=dia;
        this.mes=mes;
        this.anio=anio;
    
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
 

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }
    public String getDia(){
    return dia;
    }
    public void setDia(String dia) {
        this.dia = dia;
    }
    
    public String getMes(){
    return mes;
    }
    public void setMes(String mes){
    this.mes=mes;
    }
    public String getAnio(){
    return anio;
    }
    public void setAnio(String anio){
    this.anio=anio;
    }
    
    
}
