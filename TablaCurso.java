
package registroescolar;

//codigo_curso
//nombre_curso

public class TablaCurso extends TablaAlumno{
    //Atributos
    private int codigoCurso;
    private String nombreCurso;
    
    //constructor
    public TablaCurso (){
    }
    
    //constructor con parametros
    public TablaCurso(int codCur,String nomCur){
    this.codigoCurso=codCur;
    this.nombreCurso=nomCur;
    }
    
    //metodos
    
    
    
    

    public int getCodigoCurso() {
        
        return codigoCurso;
    }

    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getNombreCurso() {
        
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }
    
   
    
    
}
