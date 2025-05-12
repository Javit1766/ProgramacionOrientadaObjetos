public class Usuario { // Define la clase Usuario que encapsula los datos de un usuario.
    // Atributos privados (encapsulados)
    private String nombres; // Almacena el nombre del usuario.
    private String apellidos; // Almacena los apellidos del usuario.
    private int edad; // Almacena la edad del usuario.
    private int fechaNacimiento; // Almacena el año de nacimiento del usuario.

    // Constructor de la clase
    public Usuario(String nombres, String apellidos, int edad, int fechaNacimiento) {
        this.nombres = nombres; // Inicializa el atributo nombres con el valor proporcionado.
        this.apellidos = apellidos; // Inicializa el atributo apellidos con el valor proporcionado.
        this.edad = edad; // Inicializa el atributo edad con el valor proporcionado.
        this.fechaNacimiento = fechaNacimiento; // Inicializa el atributo fechaNacimiento con el valor proporcionado.
    }

    // Métodos getter y setter para los atributos

    public String getNombres() { // Devuelve el valor del atributo nombres.
        return nombres;
    }

    public void setNombre(String nombres) { // Establece un nuevo valor para el atributo nombres.
        this.nombres = nombres;
    }

    public String getApellidos() { // Devuelve el valor del atributo apellidos.
        return apellidos;
    }

    public void setApellidos(String apellidos) { // Establece un nuevo valor para el atributo apellidos.
        this.apellidos = apellidos;
    }

    public int getEdad() { // Devuelve el valor del atributo edad.
        return edad;
    }

    public void setEdad(int edad){ // Establece un nuevo valor para el atributo edad.
        this.edad = edad;
    }
    
    public int getFechaNacimiento() { // Devuelve el valor del atributo fechaNacimiento.
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) { // Establece un nuevo valor para el atributo fechaNacimiento.
        this.fechaNacimiento = fechaNacimiento;
    }

    public void mostrarDatos() { // Muestra todos los datos del usuario en la consola.
        System.out.println("Nombre: " + nombres); // Imprime el nombre completo.
        System.out.println("Apellido: " + apellidos); // Imprime el apellido completo.
        System.out.println("Edad: " + edad); // Imprime la edad.
        System.out.println("Año de Nacimiento: " + fechaNacimiento); // Imprime el año de nacimiento.
    }
}

