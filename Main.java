public class Main {
    
    public static void main(String[] args) {
        
        // Creación de usuarios
        Usuario usuario1 = new Usuario("Diego Javier", "Tan Chacon", 17, 2007);
        Usuario usuario2 = new Usuario("Derek Rodrigo", "Morales Santos", 17, 2007);

        // Llamada a métodos
        usuario1.mostrarDatos();
        usuario2.mostrarDatos();
        
        // Modificar datos del usuario1
        usuario1.setNombre("Nelson");
        System.out.println("Nuevo nombre: " + usuario1.getNombres());
        System.out.println("Apellidos: " + usuario1.getApellidos());
        System.out.println("Edad: " + usuario1.getEdad());
        System.out.println("Año de Nacimiento: " + usuario1.getFechaNacimiento());

        // Verificación de mayoría de edad
        if (usuario1.getEdad() >= 18) {
            System.out.println(usuario1.getNombres() + " es mayor de edad.");
        }
    }
}
