import java.util.ArrayList;
import java.util.List;
public class Main {  
public static void main(String[] args) {  
    
    List<alumnos> list=new ArrayList<alumnos>();
    
   alumnos a1=new alumnos(101," Angel ");  
   alumnos a2=new alumnos(102," Andrea");  
   alumnos a3=new alumnos(103," Shanira");  
    
    list.add(a1);  
    list.add(a2);  
    list.add(a3);  
    System.out.println("Id  "+" NOMBRES");
    for(alumnos a:list){  
        System.out.println(a.id+" "+a.nombre);  
    }  
}
}