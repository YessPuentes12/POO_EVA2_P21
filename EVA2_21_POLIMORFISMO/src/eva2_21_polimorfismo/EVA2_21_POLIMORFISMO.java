/*

 */
package eva2_21_polimorfismo;


public class EVA2_21_POLIMORFISMO {


    public static void main(String[] args) {
     Estudiantes1 estu = new Estudiantes1("22550338","Yessly","Mayorga",18);
     Docentes1 doc = new Docentes1();
     estu.imprimirDatos();
     doc.setNombre("Martina");
     doc.setApellido("Chávez");
     doc.setEdad(44);
     doc.setPlaza("Tiempo completo");
     doc.imprimirDatos();
     
     //Se puede tratar a los objetos de las subclases como objetos de la superclase
     //No se puede al revés
     //Se asigna un objeto de tipo estudiante
     //A una variable de tipo persona
     
     Persona1 perso = estu;
     
     //Se generaliza (simplifica)
     
     Persona1 perso2 = doc;
     
    Persona1 perso3 = new Persona1(); 
    
    //Estudiantes1 estudiante = perso3; <--- datos incompatibles
    //Es imposible convertir una persona en un estudiante 
    //No podemos agregar cosas, simplemente se ocultan propiedades
    
    //Estudiante is-a (es-un) persona??? SI
    //Persona is-a (es-un) estudiante??? NO
    
    
    
    }
    
}
