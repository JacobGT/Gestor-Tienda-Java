package GestorTienda;

public class Telefono implements Producto{
    String os;
    String tamaño;
    String marca;
    
    String nombre;
    int cantidad;
    boolean existencia;
    int precio;
    
    public Telefono(String nombre, String os, String tamaño, String marca){
        this.nombre = nombre;
        this.os = os;
        this.tamaño = tamaño;
        this.marca = marca;
    }
 
    @Override
    public void setPrecio(int precio){
        this.precio = precio;
    }
    
    @Override
    public int getPrecio(){
        return precio;
    }

    @Override
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    
    @Override
    public int getCantidad(){
        return cantidad;
    }
    
    @Override
    public void setExistencia(boolean bool){
        this.existencia = bool;
    }
    
    @Override
    public boolean getExistencia(){
        return existencia;
    }
    
    @Override
    public void getInfo(){
        System.out.println("----------------------------------");
        System.out.println("Nombre de producto: " + nombre);
        System.out.println("Sistema Operativo: " + os);
        System.out.println("Tamaño: " + tamaño);
        System.out.println("Marca: " + marca); 
        System.out.println("Precio: Q" + getPrecio());
        System.out.println("----------------------------------");
    }
    
    public Integer[] getInfo(int a, int b){
        Integer[] cantidadPrecio = {a,b};
        return cantidadPrecio;
    }
}
