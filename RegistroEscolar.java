
package registroescolar;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroEscolar {

   
    public static void main(String[] args) {
        Scanner opciones= new Scanner (System.in);
        
        TablaAlumno menu[]= new TablaAlumno[2];
        TablaCurso menu2 []= new TablaCurso[2];
        Grado menu3[] =new Grado [2];
        MenuPrincipal registro =new MenuPrincipal();
        
        
        System.out.println("************************************************************");
        System.out.println("*****SELECCIONES UNA DE LAS SIGUIENTES DOS OPCIONES*********");
        System.out.println("-------->1.Registro de datos de Alumno               <-------");
        System.out.println("-------->2.MUESTRA DE LISTA                          <-------");
        System.out.println("-------->3.SALIR                                      <-------");
        System.out.println("************************************************************");
        int opci;
        opci=opciones.nextInt();
        
        switch (opci){
            case 1:
                registro.menuDeClases();
                break;
            case 2:
                System.out.println("************************************************************");
                List<TablaAlumno>listAlumno= new ArrayList<>();
                TablaAlumno ingreso= new TablaAlumno();
                TablaCurso curso=new TablaCurso();
                Grado selec=new Grado();
                ingreso.setCodigo(0001);
                ingreso.setNombre("Julio Mendoza");
                ingreso.setAleas("Memo");
                ingreso.setCorreo("JulioM@gmail.com");
                ingreso.setTelefono(45128536);
                curso.setCodigoCurso(4512);
                curso.setNombreCurso("Ciencias Sciales");
                selec.setCodigoGrado(1);
                selec.setDescripcion("ES UNA CLASE DONDE SE DESCUBREN DIFERENTES TEMAS.");
                
                listAlumno.add(ingreso);
                listAlumno.add(curso);
                listAlumno.add(selec);
                System.out.println("Lista de Datos:::"+listAlumno.get(0).getCodigo()+"-->"+listAlumno.get(0).getNombre()
                +listAlumno.get(0).getAleas()+"-->"+listAlumno.get(0).getCorreo()+"-->"+listAlumno.get(0).getTelefono()+"-->");
                System.out.println("************************************************************");
                break;
            default:
                System.out.println("Ingrese una opcion valida");
        
        }
    }   
}
    

