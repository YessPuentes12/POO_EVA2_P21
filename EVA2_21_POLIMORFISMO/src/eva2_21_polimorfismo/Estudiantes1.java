/*

 */
package eva2_21_polimorfismo;

//Clase derivada extends clase base
//subclase extends superclase

public class Estudiantes1 extends Persona1{
 private String noControl;

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
    
    
//------------------------------------------------------------------------------   

    public Estudiantes1(String noControl, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.noControl = noControl;
    }
//------------------------------------------------------------------------------
    
    public Estudiantes1(String noControl) {
        this.noControl = noControl;
    }
//------------------------------------------------------------------------------    
    
    
    
}
