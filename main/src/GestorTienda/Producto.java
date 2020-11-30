package GestorTienda;

public interface Producto {
    public void setPrecio(int precio);
    public int getPrecio();
    public void setCantidad(int cantidad);
    public int getCantidad();
    public void setExistencia(boolean bool);
    public boolean getExistencia();   
    public void getInfo();
}
