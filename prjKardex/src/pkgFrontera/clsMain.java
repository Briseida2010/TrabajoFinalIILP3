package pkgFrontera;
import java.io.*;
import pkgNegocios.*;
import pkgEntidad.*;
/**
 * @author GatunoMaestro
 */
public class clsMain 
{
    
    public static void main(String[] args) 
    {
        clsKardex objkardex=new clsKardex();
        clsArticulo objarti=new clsArticulo();
        clsEnKardex tmpenkar=new clsEnKardex();
        int opc=0;
        int spc=0;
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        while(opc!=4)
        {
            try
            {
                System.out.println("Menu del Kardex:"
                        + "\n1. Kardex"
                        + "\n2. Articulos"
                        + "\n3. Visualizar todo"
                        + "\n4. Salir");
                opc=Integer.parseInt(in.readLine());
                switch(opc)
                {
                    case 1:
                        objkardex.leerArchivoOrigen();
                        objkardex.crearArreglos();
                        while(spc!=6)
                        {
                            try
                            {
                                System.out.println("SubMenu Kardex"
                                        + "\n1. Agregar Kardex"
                                        + "\n2. Modificar Kardex"
                                        + "\n3. Buscar Kardex por fecha"
                                        + "\n4. Buscar Kardex por producto(id)"
                                        + "\n5. Eliminar Kardex"
                                        + "\n6. Atras");
                                spc=Integer.parseInt(in.readLine());
                                switch(spc)
                                {
                                    case 1: 
                                        tmpenkar=new clsEnKardex();
                                        try
                                        {
                                            Fecha f=new Fecha();
                                            System.out.println("Ingrese el codigo");
                                            tmpenkar.setIntidkard(Integer.parseInt(in.readLine()));
                                            System.out.println("Ingrese el ID del producto");
                                            tmpenkar.setIntidpord(Integer.parseInt(in.readLine()));
                                            System.out.println("Ingrese el dia");
                                            f.setdia(Integer.parseInt(in.readLine()));
                                            System.out.println("Ingrese el mes");
                                            f.setmes(Integer.parseInt(in.readLine()));
                                            System.out.println("Ingrese el año");
                                            f.setaño(Integer.parseInt(in.readLine()));
                                            System.out.println("Ingrese la hora de salida");
                                            f.sethor(Integer.parseInt(in.readLine()));
                                            System.out.println("Ingrese el minuto de salida");
                                            f.setmin(Integer.parseInt(in.readLine()));
                                            tmpenkar.setFecha(f);
                                            System.out.println("Ingrese el saldo anterior");
                                            tmpenkar.setSaldoantentrada(Integer.parseInt(in.readLine()));
                                            System.out.println("Ingrese la cantidad a sacar");
                                            tmpenkar.setSaldoantsalida(tmpenkar.getSaldoantentrada()-Integer.parseInt(in.readLine()));
                                            if(tmpenkar.getSaldoantsalida()<0)
                                                System.out.println("No se pudo realizar la transaccion");
                                            else
                                                objkardex.añadirKardex(tmpenkar);
                                        }
                                        catch(Exception ex)
                                        {
                                            System.err.println("Ingrese los datos correctamente la sgte. vez!");
                                            ex.printStackTrace();
                                            System.err.println(ex.getMessage());
                                        }
                                        break;
                                    case 2: 
                                        tmpenkar=new clsEnKardex();
                                        try
                                        {
                                            Fecha f=new Fecha();
                                            System.out.println("Ingrese el codigo");
                                            tmpenkar.setIntidkard(Integer.parseInt(in.readLine()));
                                            System.out.println("Ingrese el ID del producto");
                                            tmpenkar.setIntidpord(Integer.parseInt(in.readLine()));
                                            System.out.println("Ingrese el dia");
                                            f.setdia(Integer.parseInt(in.readLine()));
                                            System.out.println("Ingrese el mes");
                                            f.setmes(Integer.parseInt(in.readLine()));
                                            System.out.println("Ingrese el año");
                                            f.setaño(Integer.parseInt(in.readLine()));
                                            System.out.println("Ingrese la hora de salida");
                                            f.sethor(Integer.parseInt(in.readLine()));
                                            System.out.println("Ingrese el minuto de salida");
                                            f.setmin(Integer.parseInt(in.readLine()));
                                            tmpenkar.setFecha(f);
                                            System.out.println("Ingrese el saldo anterior");
                                            tmpenkar.setSaldoantentrada(Integer.parseInt(in.readLine()));
                                            System.out.println("Ingrese la cantidad a sacar");
                                            tmpenkar.setSaldoantsalida(tmpenkar.getSaldoantentrada()-Integer.parseInt(in.readLine()));
                                            if(tmpenkar.getSaldoantsalida()<0)
                                                System.out.println("No se pudo realizar la transaccion");
                                            else
                                                if(objkardex.modificarKardex(tmpenkar))
                                                    System.out.println("Con exito");
                                                else
                                                    System.err.println("Error");
                                        }
                                        catch(Exception ex)
                                        {
                                            System.err.println("Ingrese los datos correctamente la sgte. vez!");
                                        }
                                    break;
                                    case 3: 
                                        try
                                        {
                                            clsEnKardex ss;
                                            Fecha f=new Fecha();
                                            System.out.println("Ingrese la fecha del kardex");
                                            System.out.println("Ingrese el dia");
                                            f.setdia(Integer.parseInt(in.readLine()));
                                            System.out.println("Ingrese el mes");
                                            f.setmes(Integer.parseInt(in.readLine()));
                                            System.out.println("Ingrese el año");
                                            f.setaño(Integer.parseInt(in.readLine()));
                                            if(!objkardex.buscaKardexfec(f.getFechaCorta()).equals(null))
                                            {
                                                ss=objkardex.buscaKardexfec(f.getFechaCorta());
                                                System.out.println("Kardex num: "+ss.getIntidkard()+""
                                                        + "\nProducto(id): "+ss.getIntidpord()+""
                                                        + "\nFecha y hora: "+ss.getFecha()+""
                                                        + "\nEntrada: "+ss.getSaldoantentrada()+""
                                                        + "\nSalida: "+ss.getSaldoantsalida());
                                            }
                                            else
                                            {
                                                System.out.println("no encontrado");
                                            }
                                        }catch(Exception ex){}
                                        break;
                                        case 4: 
                                            try
                                            {
                                                clsEnKardex ss;
                                                int rr;
                                                System.out.println("Ingrese el id del producto a buscar");
                                                rr=Integer.parseInt(in.readLine());
                                                if(!objkardex.buscaIdProd(rr).equals(null))
                                                {
                                                    ss=objkardex.buscaIdProd(rr);
                                                    System.out.println("Kardex num: "+ss.getIntidkard()+""
                                                            + "\nProducto(id): "+ss.getIntidpord()+""
                                                            + "\nFecha y hora: "+ss.getFecha()+""
                                                            + "\nEntrada: "+ss.getSaldoantentrada()+""
                                                            + "\nSalida: "+ss.getSaldoantsalida());
                                                }
                                                else
                                                {
                                                    System.out.println("no encontrado");
                                                }
                                            }catch(Exception ex){ }
                                            break;
                                        case 5:
                                            try
                                            {
                                                int rr;
                                                System.out.println("Ingrese el id del producto a buscar");
                                                rr=Integer.parseInt(in.readLine());
                                                if(!objkardex.buscaIdProd(rr).equals(null))
                                                    objkardex.eliminarKardex(rr);
                                                else
                                                    System.out.println("no encontrado");
                                            }catch(Exception ex){}
                                        break;
                                }
                            }
                            catch(Exception e)
                            {
                                System.err.println("Ingrese correctamente el dato, debe ser un número.");
                            }
                        }
                        spc=0;
                        break;
                    case 2: 
                        objarti.leerArchivoOrigen();
                        objarti.crearArreglos();
                        while(spc!=6)
                        {
                            try
                            {
                                System.out.println("Submenu Productos"
                                        + "\n1. Agregar productos"
                                        + "\n2. Listar productos"
                                        + "\n3. Buscar productos"
                                        + "\n4. Modificar producto"
                                        + "\n5. Eliminar producto"
                                        + "\n6. Atras");
                                spc=Integer.parseInt(in.readLine());
                                switch(spc)
                                {
                                    case 1: 
                                        try
                                        {
                                            clsEnArticulo art=new clsEnArticulo();
                                            System.out.println("Ingrese el codigo del producto");
                                            art.setIdprod(Integer.parseInt(in.readLine()));
                                            System.out.println("Ingrese el nombre del producto");
                                            art.setNomprod(in.readLine());
                                            System.out.println("Ingrese el costo del producto");
                                            art.setPrecio(Float.parseFloat(in.readLine()));
                                            System.out.println("Ingrese el stock actual");
                                            art.setStock(Integer.parseInt(in.readLine()));
                                            objarti.agregarArticulo(art);
                                        }catch(Exception ex)
                                        {
                                            System.err.println("Ingrese los datos correctamente la sgte. vez!");
                                            ex.printStackTrace();
                                            System.err.println(ex.getMessage());
                                        }
                                    break;
                                    case 2: 
                                        try
                                        {
                                            clsEnArticulo[] art=objarti.listarArticulo();
                                            for(int i=0;i<art.length-1;i++)
                                            {
                                                System.out.println("Nombre de articulo: "+art[i].getNomprod()
                                                +"\nCodigo: "+art[i].getIdprod()
                                                +"\nStock: "+art[i].getStock()
                                                +"\nCosto: "+art[i].getPrecio());
                                            }
                                        }
                                    catch(Exception ex){}
                                    break;
                                    case 3: 
                                        try
                                        {
                                            System.out.println("Ingrese el nombre del producto a buscar");
                                            clsEnArticulo art=objarti.buscarArticulo(in.readLine());
                                            if(art!=null)
                                            {
                                                System.out.println("Nombre de articulo: "+art.getNomprod()
                                                +"\nCodigo: "+art.getIdprod()
                                                +"\nStock: "+art.getStock()
                                                +"\nCosto: "+art.getPrecio());
                                            }
                                        }catch(Exception ex){
                                        System.err.println("Not found...");}
                                    break;
                                    case 4: 
                                        try
                                        {
                                            clsEnArticulo art=new clsEnArticulo();
                                            System.out.println("Ingrese el codigo del producto");
                                            art.setIdprod(Integer.parseInt(in.readLine()));
                                            System.out.println("Ingrese el nombre del producto");
                                            art.setNomprod(in.readLine());
                                            System.out.println("Ingrese el costo del producto");
                                            art.setPrecio(Float.parseFloat(in.readLine()));
                                            System.out.println("Ingrese el stock actual");
                                            art.setStock(Integer.parseInt(in.readLine()));
                                            objarti.modificarArticulo(art);
                                        }catch(Exception ex)
                                        {
                                            ex.printStackTrace();
                                            System.err.println(ex.getMessage());
                                        }
                                    break;
                                    case 5: 
                                        try
                                        {
                                            System.out.println("Ingrese el nombre del producto a eliminar");
                                            objarti.eliminarArticulo(in.readLine());
                                        }catch(Exception ex){
                                        System.err.println("Not found...");}
                                    break;
                                }
                            }
                            catch(Exception e){}
                        }
                        spc=0;
                        break;
                    case 3: 
                        objarti.leerArchivoOrigen();
                        objarti.crearArreglos();
                        objkardex.leerArchivoOrigen();
                        objkardex.crearArreglos();
                        try
                        {
                            clsEnArticulo[] art=objarti.listarArticulo();
                            clsEnKardex[] kar=objkardex.listarKardex();
                            for(int i=0;i<art.length;i++)
                            {
                                System.out.println("Nombre de articulo: "+art[i].getNomprod()
                                +"\nCodigo: "+art[i].getIdprod()
                                +"\nStock: "+art[i].getStock()
                                +"\nCosto: "+art[i].getPrecio());
                            }
                            for(int i=0;i<art.length;i++)
                            {
                                System.out.println("Kardex ID: "+kar[i].getIntidkard()
                                +"\nProducto: "+kar[i].getIntidpord()
                                +"\nFecha: "+kar[i].getFecha()
                                +"\nSaldo anterior(entrada): "+kar[i].getSaldoantentrada()
                                +"\nSaldo anterior(salida): "+kar[i].getSaldoantsalida());
                            }
                        }
                        catch(Exception ex){System.err.println("Not found...");}
                        break;
                }
            }
            catch(Exception ex)
            {
                System.err.println("Ingrese correctamente el dato, debe ser un número.");
            }
        }
        
    }

}
