
package registroescolar;

import java.util.Scanner;

public class MenuPrincipal {
    Scanner inside= new Scanner(System.in);
   
    TablaAlumno menu[]= new TablaAlumno[2];
    TablaCurso menu2 []= new TablaCurso[2];
    Grado menu3[] =new Grado [2];
    
    TablaAlumno menus= new TablaAlumno();
    TablaCurso menus2 = new TablaCurso();
    Grado menus3 =new Grado ();
            
    public void menuDeClases (){
    String resul,nombre="",aleas="",correo="",nombreCurso="",descripcion="";
    int opcion,codigo=0,telefono=0,codigoCurso=0,codigoGrado=0;
    
            System.out.println("==================================================================="); //menu
            System.out.println("Menú de registro para alumnos eliga las siguientes opciones:" );
            System.out.println("-------->1.Registro de datos de Alumno               <-------");
            System.out.println("-------->2.Registro de datos de Curso                <-------");
            System.out.println("-------->3.Registro de datos de Grado                <-------");
            System.out.println("-------->4.Registro de datos de Alumno,Curso y Grado  <------");
            System.out.println("-------->5.Mostrar Historial de datos                 <------");
            System.out.println("-------->6.Mostrar Lista de datos                     <------");
            System.out.println("-------->7.Salir                                      <------");
            System.out.println("===================================================================");
            opcion = inside.nextInt ();
           
            switch (opcion){
                case 1:
                  for (int i=0; i<menu.length;i++){
                    System.out.println("***************************************");
                    System.out.println("******INGRESE LOS DATOS DEL ALUMNO*****");
                    System.out.println(":::::Ingrese el codigo del Alumno:");
                    codigo= inside.nextInt(); 
                    System.out.println(":::::Ingrese el nombre del alumno:");
                    nombre=inside.nextLine(); nombre=inside.nextLine();                 
                    System.out.println(":::::Ingrese el aleas del Alumno:");
                    aleas= inside.nextLine();                  
                    System.out.println(":::::Ingrese el correo del Alumno:");
                    correo= inside.nextLine();                   
                    System.out.println(":::::Ingrese el telefono del Alumno:");
                    telefono= inside.nextInt();
                    menu[i]=new TablaAlumno(codigo,nombre,aleas,correo,telefono);
                    System.out.println("****************************************************************************************************");
                  }
                    for (int i=0;i<menu.length;i++){
                     System.out.println("Se muestran datos opcion 1: \n"+menu[i].getCodigo()+"--->"+menu[i].getNombre()+"--->"+menu[i].getAleas()+"--->"+menu[i].getCorreo()
                     +"--->"+menu[i].getTelefono());
                    }
                    System.out.println("****************************************************************************************************");
                    break;
                case 2:
                    for (int i=0; i<menu2.length;i++){
                    System.out.println("***************************************");
                    System.out.println("******INGRESE LOS DATOS DEL CURSO*****");
                    System.out.println(":::::Ingrese el codigo del Curso:");
                    codigoCurso= inside.nextInt();
                    System.out.println(":::::Ingrese el nombre  del Curso:");
                    nombreCurso=inside.nextLine(); nombreCurso=inside.nextLine();
                    menu2[i]=new TablaCurso(codigoCurso,nombreCurso);
                    System.out.println("***************************************");
                    }
                    break;
                case 3:
                     for (int i=0; i<menu3.length;i++){
                    System.out.println("***************************************");
                    System.out.println("******INGRESE LOS DATOS DEL GRADO*****");
                    System.out.println(":::::Ingrese el codigo del Grado:");
                    codigoGrado= inside.nextInt();
                    System.out.println(":::::Ingrese una pequeña descripcion:");
                    descripcion=inside.nextLine();
                    descripcion=inside.nextLine();
                     menu3[i]=new Grado(codigoGrado,descripcion);
                    System.out.println("***************************************");
                     }
                    break;
                case 4:
                    System.out.println("**************************************************************");
                    System.out.println("******INGRESO DE DATOS DE: ALUMNO, CURSO Y GRADO *****");
                     for (int i=0; i<menu.length;i++){
                    System.out.println(":::::Ingrese el codigo del Alumno:");
                    codigo= inside.nextInt();   
                    System.out.println(":::::Ingrese el nombre del alumno:");
                    nombre=inside.nextLine(); nombre=inside.nextLine();                 
                    System.out.println(":::::Ingrese el aleas del Alumno:");
                    aleas= inside.nextLine();                  
                    System.out.println(":::::Ingrese el correo del Alumno:");
                    correo= inside.nextLine();                   
                    System.out.println(":::::Ingrese el telefono del Alumno:");
                     telefono= inside.nextInt();
                    menu[i]=new TablaAlumno(codigo,nombre,aleas,correo,telefono);
                     }
                    for (int i=0; i<menu2.length;i++){
                    System.out.println(":::::Ingrese el codigo del Curso:");
                    codigoCurso= inside.nextInt();
                    System.out.println(":::::Ingrese el nombre  del Curso:");
                    nombreCurso=inside.nextLine(); nombreCurso=inside.nextLine();
                    
                    }
                    for (int i=0; i<menu3.length;i++){
                    System.out.println(":::::Ingrese el codigo del Grado:");
                    codigoGrado= inside.nextInt();
                    System.out.println(":::::Ingrese una pequeña descripcion:");
                    descripcion=inside.nextLine();
                    descripcion=inside.nextLine();
                     menu3[i]=new Grado(codigoGrado,descripcion);
                    }
                    System.out.println("***************************************************************");
                    break;
                case 5:
                    
                    menus.mostrarOperaciones();
                    
                    System.out.println("********************************************************************");
                    System.out.println("********SE MUESTRA EL HISTORIAL DE LAS SELECCIONES 1,2 Y 3 *********");
                    for (int i=0;i<menu.length;i++){
                     System.out.println("Se muestran datos opcion 1: \n"+menu[i].getCodigo()+"--->"+menu[i].getNombre()+"--->"+menu[i].getAleas()+"--->"+menu[i].getCorreo()
                     +"--->"+menu[i].getTelefono());
                    }
                    for (int i=0;i<menu2.length;i++){
                    System.out.println("Se muestran datos opcion 2:\n"+menu2[i].getCodigoCurso()+"--->"+menu2[i].getNombreCurso());
                    }
                    for (int i=0; i<menu3.length;i++){
                    System.out.println("Se muestran datos de opcion 3:\n"+menu3[i].getCodigoGrado()+"--->"+menu3[i].getDescripcion());
                    }
                   
                    System.out.println("********************************************************************");
                    break;
                case 6:
                    
                    
                    break;
                default :
                    System.out.println("Opcion no valida, intente una opcion valida ...GRACIAS");
                    
                    
            
    
    }
}  
        
}

