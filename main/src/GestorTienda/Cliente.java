package GestorTienda;

import java.util.ArrayList;

public class Cliente extends Usuario{
    public Cliente(String correo){
        permiso = false;
        saldo = 0;
        this.correo = correo;
    }
    
    int saldo;
    ArrayList<String> compras;
    
    public int getSize(){
        return compras.size();
    }
    
    public void addArrayList(String info, String info2, String info3){
        compras.add(info);
        compras.add(info2);
        compras.add(info3);
    }
    
    public String[] getArrayList(){
        String str[] = new String[compras.size()];
        for (int j = 0; j < compras.size(); j++) { 
          str[j] = compras.get(j); 
        } 
        return str;
    }
    
    @Override
    public void setSaldo(int saldo){
      this.saldo = saldo;
    };
    
    public int getSaldo(){
        return saldo;
    }
    
    public void añadir(String nombre){
        compras.add(nombre);
    };
    
    public void eliminar(int posicion){
        compras.remove(posicion);
    }
    
    public void resetear(){
        compras.clear();
    }
    
    public void mostrarCompras(){
        for(int i = 0; i < compras.size(); i++){
            System.out.println("#" + (i+1) + compras.get(i)); 
        }
    }
    
    public void info(){
        showInfo();
        mostrarCompras();
        getSaldo();
    }
}
