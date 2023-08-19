package pkgLista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListSample {
    public void ejemplo1(){
        List<String> taskList = new ArrayList<>();
        taskList.add("Sacar al perro");
        taskList.add("Ir de compras");
        taskList.add("Hacer la cama");
        taskList.add("Ir a votar");

        //iterar
        //iterator
        for (String item : taskList){
            System.out.println("Tarea: "+item);
        }

        //String primerElemento = taskList.get(0);
        //System.out.println("Primer elemento = "+primerElemento);

        //System.out.println("Elimina pos 0:");
        //taskList.remove(0);
        //primerElemento = taskList.get(0);
        //System.out.println("Primer elemento = "+primerElemento);
    }
    public void ejercicio1(){
        Scanner sc = new Scanner(System.in);
        List<Integer> tasklist = new ArrayList<Integer>();

        System.out.println("Ingrese un numero");
        int num = sc.nextInt();
        tasklist.add(1000);
        tasklist.add(2000);
        tasklist.add(3000);
        tasklist.add(4000);

        int suma = 0;
        for (int valor : tasklist) {
            suma = suma + valor;
        }
        System.out.println("La suma de los valores es de: " + suma);

    }

    public void ListaTareas(){
        List<ClsTaskList> tl = new ArrayList<>();
        ClsTaskList tarea = new ClsTaskList();

        tarea.setTaskName("Ir a votar");
        tarea.setTaskDescripcion("Escuela, mesa 5");
        tarea.setDone(false);
        tl.add(tarea);
        tarea = new ClsTaskList();

        tarea.setTaskName("Sacar al chucho");
        tarea.setTaskDescripcion("Llevar al firulais al parque");
        tarea.setDone(false);
        tl.add(tarea);
        tarea = new ClsTaskList();

        tarea.setTaskName("Hacer la cama");
        tarea.setTaskDescripcion("Mi mamá o mujer me regaña");
        tarea.setDone(false);
        tl.add(tarea);
        tarea = new ClsTaskList();

        for (ClsTaskList item: tl) {
            System.out.println("Nombre de la tarea: " + item.getTaskName());
            System.out.println("Descripción de la tarea: " + item.getTaskDescripcion());
            System.out.println("Estado de la tarea: " + (item.isDone() ? "Hecho" : "Pendiente"));
            System.out.println();
        }
    }
}
