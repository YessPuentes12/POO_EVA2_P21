/*
 
 */
package eva2_21_polimorfismo;


public class Persona1 {
  private String nombre;
  private String apellido;
  private int edad; 

  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
//------------------------------------------------------------------------------
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
//------------------------------------------------------------------------------
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
//------------------------------------------------------------------------------

    public Persona1(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
//------------------------------------------------------------------------------
    
    public Persona1 (){
       this.nombre = "---";
       this.apellido = "---";
       this.edad = 0;   
    }
//------------------------------------------------------------------------------

public void imprimirDatos(){
    System.out.println("Datos.");
    System.out.println("Nombre: "+this.nombre);
    System.out.println("Apellido: "+this.apellido);
    System.out.println("Edad: "+this.edad);
}





  
}
