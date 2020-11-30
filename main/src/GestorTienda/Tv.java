package GestorTienda;

public class Tv implements Producto{
    String nombre;
    int cantidad;
    boolean existencia;
    int precio;
    String refreshRate;
    String resolucion;
    String marca;
    
    public Tv(String nombre, String resolucion, String refreshRate, String marca){
        this.nombre = nombre;
        this.refreshRate = refreshRate;
        this.resolucion = resolucion;
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
        System.out.println("Taza de Refresco: " + refreshRate);
        System.out.println("Resolucion: " + resolucion);
        System.out.println("Marca: " + marca); 
        System.out.println("Precio: Q" + getPrecio());
        System.out.println("----------------------------------");
    }
    
    public Integer[] getInfo(int a, int b){
        Integer[] cantidadPrecio = {a,b};
        return cantidadPrecio;
    }
}
