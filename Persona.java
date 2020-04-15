
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
   String nombre;
   String apellido;
   String telefono;
   String genero; 
  
   
    
   //Constructor sin parametros  
    public Persona()
    {
       
    }
   
   //Sobrecargando Constructor, Solicitamos Nombre y Apellido
   public Persona (String nom, String ape) {
       this.nombre = nom; 
       this.apellido = ape;
   
  
    }
}
