package GestorTienda;

public class Trabajador extends Usuario{
    public Trabajador(String correo){
        permiso = true;
        this.correo = correo;
    }
    @Override
    public void setSaldo(int saldo){
    };
    
    
}
