package GestorTienda;

abstract class Usuario {
    String correo;
    String password;
    Boolean permiso;
    
    public abstract void setSaldo(int saldo);
    
    public void showInfo(){
        System.out.println("Correo:   " + correo);
        if (permiso == false){
            System.out.println("Permiso:  Cliente");
        } else{
            System.out.println("Permiso:  Trabajador");
        }
    };
}
