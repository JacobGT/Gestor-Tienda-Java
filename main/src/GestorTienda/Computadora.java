package GestorTienda;

public class Computadora implements Producto{
    String nombre;
    int cantidad;
    boolean existencia;
    int precio;
    String cpu;
    String gpu;
    String marca;
    
    public Computadora(String nombre, String cpu, String gpu, String marca){
        this.nombre = nombre;
        this.gpu = gpu;
        this.cpu = cpu;
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
        System.out.println("CPU: " + cpu);
        System.out.println("GPU: " + gpu);
        System.out.println("Marca: " + marca); 
        System.out.println("Precio: Q" + getPrecio());
        System.out.println("----------------------------------");
    }
    
    public Integer[] getInfo(int a, int b){
        Integer[] cantidadPrecio = {a,b};
        return cantidadPrecio;
    }
}
