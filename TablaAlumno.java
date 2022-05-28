
package registroescolar;
import java.util.ArrayList;
//codigo
//nombre
//aleas
//correo
//telefono

public class TablaAlumno {
    //Atributos
    private int  codigo ;
    private String  nombre ;
    private String aleas;
    private String correo;
    private int telefono ;
    private int contador;
    private String [] vectorAlmacenar;
    private double[] matriz;
    private int indiceVector;
    
    
    
    //Contructor sin parametros
    public TablaAlumno(){
   
    this.contador=0;
    vectorAlmacenar= new String [300];
    this.indiceVector=0;
    
    }
    //constructor con parametros
    public TablaAlumno(int codigo,String nombre,String aleas, String corrreo,int telefono){
    this.codigo=codigo;
    this.nombre=nombre;
    this.aleas=aleas;
    this.correo=corrreo;
    this.telefono=telefono;
    }
    
    //metodos
     public int codigo(int cod){  
     int result=cod;
     this.registrarOperaciones("codigo", cod, result);
     return result;
    }
    
    public String nombre(String nom){  
     String result=nom;
     this.registrarOperacione("nombre", nom, result);
     return result;
    }
    
    public String alias(String allis){  
     String result=allis;
     this.registrarOperacione("alias", allis, result);
     return result;
    }
    
    public String correo(String cor){  
     String result=cor;
     this.registrarOperacione("correo", cor, result);
     return result;
    }
    
    public int telefono(int tel){  
     int result=tel;
     this.registrarOperaciones("telefono", tel, result);
     return result;
    }
    
    public int getCodigo() {
        
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        
        this.codigo = codigo;
    }

    public String getNombre() {
        
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAleas() {
        
        return aleas;
    }

    public void setAleas(String aleas) {
        this.aleas = aleas;
    }

    public String getCorreo() {
       
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

     public void registrarOperacione(String tipo,String primerValor,String result){ 
        indiceVector=indiceVector+1;
        vectorAlmacenar[indiceVector]="  "+tipo+"  "+primerValor+" "+result;
    
    }
     public void registrarOperaciones(String tipo,int primerValor,int result){ 
        indiceVector=indiceVector+1;
        vectorAlmacenar[indiceVector]="  "+tipo+"  "+primerValor+" "+result;
    
    }
    
   public void mostrarOperaciones(){
        try{       
            for (int i=1; i<vectorAlmacenar.length;i++){
                if(vectorAlmacenar[i] != null){
                    System.out.println(vectorAlmacenar[i]);
                }
            }
            System.out.println("\n // Mostrara  el vector en la pantalla// \n");
            for(String operacion : vectorAlmacenar){
                if(operacion != null){
                    System.out.println(operacion);
                }   
            } 
        }catch(Exception e){
            System.out.println(e.getMessage());       
        }
    

}

    
}
