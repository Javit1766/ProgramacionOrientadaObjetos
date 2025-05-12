public class Main {
    
    public static void main(String[] args) {
        
        //Usuarios
        Usuario usuario1 = new Usuario("Diego Javier", "Tan Chacon", 17, 2007);
        Usuario usuario2 = new Usuario("Derek Rodrigo", "Morales Santos", 17, 2007);

        //Metodos del objeto
        usuario1.mostrarDatos();
        usuario2.mostrarDatos();
        
        usuario1.setNombre("Nelson");
        System.out.println(usuario1.getNombres());
        System.out.println(usuario1.getApellidos());
        System.out.println(usuario1.getEdad());
        System.out.println(usuario1.getFechaNacimiento());

        if (usuario1.getEdad() >= 18) {
            System.out.println("Mayor de edad");
        }

    }
}