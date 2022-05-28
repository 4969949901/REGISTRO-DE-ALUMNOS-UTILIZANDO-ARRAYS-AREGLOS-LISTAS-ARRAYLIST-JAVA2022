
package registroescolar;

//codigo_grado
//descripcion
public class Grado extends TablaCurso {
    
    //atributos
    private int codigoGrado;
    private String descripcion;
    
    //constructor
    public Grado (){
    }
    
    //Constructor con parametros
    public Grado(int codGr,String descrip){
    this.codigoGrado= codGr;
    this.descripcion=descrip;
    }
    
    
    //metodos

    public int getCodigoGrado() {
        
        return codigoGrado;
    }

    public void setCodigoGrado(int codigoGrado) {
        this.codigoGrado = codigoGrado;
    }

    public String getDescripcion() {
        
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
