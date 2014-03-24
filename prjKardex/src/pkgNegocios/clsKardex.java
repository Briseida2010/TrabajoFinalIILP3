package pkgNegocios;
import java.io.*;
import pkgEntidad.*;
import java.util.*;
/**
 * @author GatunoMaestro
 */
public class clsKardex 
{
    String dataInput="";
    clsEnKardex[] arreglo;
    List<clsEnKardex> lista=new ArrayList<clsEnKardex>();
    public void leerArchivoOrigen()
    {
        try
        {
            FileInputStream file=new FileInputStream("kardex.txt");
            int c;
            while((c=file.read())!=-1)
            {
                dataInput=dataInput+String.valueOf((char)c);
            }
            file.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Se creara un nuevo registro debido a que el anterior no existe o esta ilegible.");
            crearArchivoOrigen();
        }
        catch(IOException e)
        {
            System.out.println("El archivo es ilegible, se procedera a crear uno nuevo.");
            crearArchivoOrigen();
        }
    }
    public void crearArchivoOrigen()
    {
        try
        {
            PrintWriter file=new PrintWriter("kardex.txt");
            file.println("__kardex_~");
            file.close();
        }
        catch(IOException e)
        {
            System.out.println("No se pudo crear el archivo de articulos, saliendo");
            System.exit(0);
        }
    }
//    public void guardarArchivoOrigen()
//    {
//        byte c[];
//        try
//        {
//            FileOutputStream file=new FileOutputStream("kardex.txt");
//            String n="~";
//            c=n.getBytes();
//            file.write(c);
//            for(int i=0;i<arreglo.length;i++)
//            {
//                String cadena="idka:"+arreglo[i].getIntidkard()+"*idpr:"+arreglo[i].getIntidpord()+"*fech:"+arreglo[i].getFecha()+"*saen:"+arreglo[i].getSaldoantentrada()+"*sasa:"+arreglo[i].getSaldoantsalida()+"*~";
//                c=cadena.getBytes();
//                file.write(c);
//            }
//            file.close();
//        }
//        catch(FileNotFoundException e)
//        {
//            System.out.println("Se creara un nuevo registro debido a que el anterior no existe o esta ilegible.");
//            crearArchivoOrigen();
//        }
//        catch(IOException e)
//        {
//            System.out.println("No se pudo crear el archivo de articulos, saliendo");
//            System.exit(0);
//        }
//    }
    public void guardarArchivoOrigen()
    {
        byte c[];
        try
        {
            clsEnKardex[] arreglo1;
            arreglo1=lista.toArray(arreglo);
            FileOutputStream file=new FileOutputStream("kardex.txt");
            String n="~";
            c=n.getBytes();
            file.write(c);
            arreglo1=lista.toArray(arreglo1);
            for(int i=0;i<lista.size();i++)
            {
                String cadena="idka:"+arreglo1[i].getIntidkard()+"*idpr:"+arreglo1[i].getIntidpord()+"*fech:"+arreglo1[i].getFecha()+"*saen:"+arreglo1[i].getSaldoantentrada()+"*sasa:"+arreglo1[i].getSaldoantsalida()+"*~";
                c=cadena.getBytes();
                file.write(c);
            }
            file.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Se creara un nuevo registro debido a que el anterior no existe o esta ilegible.");
            crearArchivoOrigen();
        }
        catch(IOException e)
        {
            System.out.println("No se pudo crear el archivo de articulos, saliendo");
            System.exit(0);
        }
    }
    public void crearArreglos()
    {
        int setter=0;
        int getter=0;
        int rezzer=0;
        clsEnKardex tmpkarde=new clsEnKardex();
        for(int i=0;i<dataInput.length();i++)
        {
            if(dataInput.charAt(i)==(char)'_')
            {
                if(dataInput.charAt(i+1)==(char)'_')
                {
                    int j=0;
                    setter=i+2;
                    while(j==0)
                    {
                        if(dataInput.charAt(setter)!='_')
                        {
                            setter=setter+1;
                        }
                        else
                        {
                            j=1;
                            setter=j;
                        }
                    }
                    break;
                }
            }
        }
        for(int line=setter;line<dataInput.length();line++)
        {
            if(dataInput.charAt(line)==Character.valueOf('~'))
            {
                getter++;
            }
        }
        arreglo=new clsEnKardex[getter];
        for(int i=0;i<getter;i++)
        {
            arreglo[i]=new clsEnKardex();
        }
        for(int line=setter;line<dataInput.length();line++)
        {
            int j;
            if(dataInput.charAt(line)==Character.valueOf('~'))
            {
                for(j=line;j<dataInput.length();j++)
                {
                    if(dataInput.charAt(j)==Character.valueOf('~'))
                    {
                        break;
                    }
                }
//                for(int palabra=line;palabra<j;palabra++)
//                {
//                    tmpkarde=new clsEnKardex();
//                    int tmp=1;
//                    String tmpstr="";
//                    String pala[]={"idka:","idpr","fech:","saen:","sasa:"};
//                    if(dataInput.charAt(palabra)==pala[tmp].charAt(0)&&dataInput.charAt(palabra+1)==pala[tmp].charAt(1)
//                            &&dataInput.charAt(palabra+2)==pala[tmp].charAt(2)&&dataInput.charAt(palabra+3)==pala[tmp].charAt(3)
//                            &&dataInput.charAt(palabra+4)==pala[tmp].charAt(4))
//                    {
//                        int hl=palabra;
//                        tmpstr="";
//                        while(dataInput.charAt(hl)!=(char)'*')
//                        {
//                            if(dataInput.charAt(hl)!=(char)'*')
//                                tmpstr=tmpstr+dataInput.charAt(hl);
//                            hl++;
//                        }
//                        palabra=hl;
//                        switch(tmp)
//                        {
//                            case 1: arreglo[rezzer].setIntidkard(Integer.parseInt(tmpstr));
//                                tmpkarde.setIntidkard(Integer.parseInt(tmpstr));
//                                break;
//                            case 2: arreglo[rezzer].setIntidpord(Integer.parseInt(tmpstr));
//                                tmpkarde.setIntidpord(Integer.parseInt(tmpstr));
//                                break;
//                            case 3: int rr;
//                                Fecha fec=new Fecha();
//                                rr=Integer.parseInt(String.valueOf(tmpstr.charAt(0)+tmpstr.charAt(1)));
//                                fec.setdia(rr);
//                                rr=Integer.parseInt(String.valueOf(tmpstr.charAt(3)+tmpstr.charAt(4)));
//                                fec.setmes(rr);
//                                rr=Integer.parseInt(String.valueOf(tmpstr.charAt(6)+tmpstr.charAt(7)));
//                                fec.setaño(rr);
//                                rr=Integer.parseInt(String.valueOf(tmpstr.charAt(9)+tmpstr.charAt(10)));
//                                fec.sethor(rr);
//                                rr=Integer.parseInt(String.valueOf(tmpstr.charAt(12)+tmpstr.charAt(13)));
//                                fec.setmin(rr);
//                                arreglo[rezzer].setFecha(fec);
//                                tmpkarde.setFecha(fec);
//                                break;
//                            case 4: arreglo[rezzer].setSaldoantentrada(Integer.parseInt(tmpstr));
//                            tmpkarde.setSaldoantentrada(Integer.parseInt(tmpstr));
//                                break;
//                            case 5: arreglo[rezzer].setSaldoantsalida(Integer.parseInt(tmpstr));
//                            tmpkarde.setSaldoantsalida(Integer.parseInt(tmpstr));
//                                rezzer++;
//                                lista.add(tmpkarde);
//                                tmp=0;
//                                break;
//                        }
//                        tmp++;
//                    }
//                }
                tmpkarde=new clsEnKardex();
                for(int palabra=line;palabra<j;palabra++)
                {
                    
                    int tmp=1;
                    String tmpstr="";
                    String pala[]={"idka:","idpr","fech:","saen:","sasa:"};
                    if(dataInput.charAt(palabra)==pala[tmp].charAt(0)&&dataInput.charAt(palabra+1)==pala[tmp].charAt(1)
                            &&dataInput.charAt(palabra+2)==pala[tmp].charAt(2)&&dataInput.charAt(palabra+3)==pala[tmp].charAt(3)
                            &&dataInput.charAt(palabra+4)==pala[tmp].charAt(4))
                    {
                        int hl=palabra;
                        tmpstr="";
                        while(dataInput.charAt(hl)!=(char)'*')
                        {
                            if(dataInput.charAt(hl)!=(char)'*')
                                tmpstr=tmpstr+dataInput.charAt(hl);
                            hl++;
                        }
                        palabra=hl;
                        switch(tmp)
                        {
                            case 1:
                                tmpkarde.setIntidkard(Integer.parseInt(tmpstr));
                                break;
                            case 2:
                                tmpkarde.setIntidpord(Integer.parseInt(tmpstr));
                                break;
                            case 3: int rr;
                                Fecha fec=new Fecha();
                                rr=Integer.parseInt(String.valueOf(tmpstr.charAt(0)+tmpstr.charAt(1)));
                                fec.setdia(rr);
                                rr=Integer.parseInt(String.valueOf(tmpstr.charAt(3)+tmpstr.charAt(4)));
                                fec.setmes(rr);
                                rr=Integer.parseInt(String.valueOf(tmpstr.charAt(6)+tmpstr.charAt(7)));
                                fec.setaño(rr);
                                rr=Integer.parseInt(String.valueOf(tmpstr.charAt(9)+tmpstr.charAt(10)));
                                fec.sethor(rr);
                                rr=Integer.parseInt(String.valueOf(tmpstr.charAt(12)+tmpstr.charAt(13)));
                                fec.setmin(rr);
                                tmpkarde.setFecha(fec);
                                break;
                            case 4: 
                            tmpkarde.setSaldoantentrada(Integer.parseInt(tmpstr));
                                break;
                            case 5: 
                            tmpkarde.setSaldoantsalida(Integer.parseInt(tmpstr));
                                rezzer++;
                                lista.add(tmpkarde);
                                tmpkarde=new clsEnKardex();
                                tmp=0;
                                break;
                        }
                        tmp++;
                    }
                }
            }
        }
    }
//    public void añadirKardex(clsEnKardex kar)
//    {
//        clsEnKardex tmp[]=new clsEnKardex[arreglo.length+1];
//        for(int i=0;i<arreglo.length;i++)
//        {
//            tmp[i]=new clsEnKardex();
//            tmp[i]=arreglo[i];
//        }
//        tmp[arreglo.length]=new clsEnKardex();
//        tmp[arreglo.length]=kar;
//        arreglo=tmp;
//        guardarArchivoOrigen();
//    }
        public void añadirKardex(clsEnKardex kar)
    {
        lista.add(kar);
        guardarArchivoOrigen();
    }
//    public int buscaIndex(int setter)
//    {
//        int res=-1;
//        for(int i=0;i<arreglo.length;i++)
//        {
//            if(arreglo[i].getIntidpord()==setter)
//            {
//                res=i;
//                break;
//            }
//        }
//        return res;
//    }
//    public int buscaIndex(String setter)
//    {
//        int res=-1;
//        for(int i=0;i<arreglo.length;i++)
//        {
//            if(arreglo[i].getFechaCorta().equals(setter))
//            {
//                res=i;
//                break;
//            }
//        }
//        return res;
//    }
    public int buscaIndex(clsEnKardex[] kar, int setter)
    {
        int res=-1;
        for(int i=0;i<kar.length;i++)
        {
            if(kar[i].getIntidpord()==setter)
            {
                res=i;
                break;
            }
        }
        return res;
    }
    public int buscaIndex(clsEnKardex[] kar, String setter)
    {
        int res=-1;
        for(int i=0;i<kar.length;i++)
        {
            if(kar[i].getFechaCorta().equals(setter))
            {
                res=i;
                break;
            }
        }
        return res;
    }
//    public void modificarKardex(clsEnKardex kar)
//    {
//        int _index=buscaIndex(kar.getIntidpord());
//        if(_index!=-1)
//        {
//            arreglo[_index]=kar;
//        }
//        guardarArchivoOrigen();
//    }
    public boolean modificarKardex(clsEnKardex kar)
    {
        boolean setter=false;
        clsEnKardex arreglo1[]=(clsEnKardex[])lista.toArray();
        int _index=buscaIndex(arreglo1,kar.getIntidpord());
        if(_index!=-1)
        {
            lista.set(_index, kar);
            setter=true;
        }
        guardarArchivoOrigen();
        return setter;
    }
//    public void eliminarKardex(String nom)
//    {
//        int _index=buscaIndex(nom);
//        if(_index!=-1)
//        {
//            for(int i=_index;i<arreglo.length;i++)
//            {
//                arreglo[i]=arreglo[i+1];
//                lista.remove(_index);
//            }
//            clsEnKardex tmp[]=new clsEnKardex[arreglo.length-1];
//            for(int i=0;i<arreglo.length-1;i++)
//            {
//                tmp[i]=new clsEnKardex();
//                tmp[i]=arreglo[i];
//            }
//            arreglo=tmp;
//        }
//        guardarArchivoOrigen();
//    }
    public void eliminarKardex(int nom)
    {
        int _index=buscaIndex((clsEnKardex[])lista.toArray(),nom);
        if(_index!=-1)
        {
            lista.remove(_index);
        }
        guardarArchivoOrigen();
    }
    public clsEnKardex[] listarKardex()
    {
        return (clsEnKardex[])lista.toArray();
    }
//    public clsEnKardex buscaKardexfec(String nombre)
//    {
//        int _index=buscaIndex(nombre);
//        if(_index!=-1)
//            return arreglo[_index];
//        else
//            return null;
//    }
//    public clsEnKardex buscaIdProd(int cod)
//    {
//        int _index=buscaIndex(cod);
//        if(_index!=-1)
//            return arreglo[_index];
//        else
//            return null;
//    }
    public clsEnKardex buscaKardexfec(String nombre)
    {
        clsEnKardex arreglo1[]=(clsEnKardex[])lista.toArray();
        int _index=buscaIndex(arreglo1,nombre);
        if(_index!=-1)
            return arreglo1[_index];
        else
            return null;
    }
    public clsEnKardex buscaIdProd(int cod)
    {
        int _index=buscaIndex((clsEnKardex[])lista.toArray(),cod);
        if(_index!=-1)
            return arreglo[_index];
        else
            return null;
    }
}