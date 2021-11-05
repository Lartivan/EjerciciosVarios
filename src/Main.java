import java.util.*;

public class Main {

    public static void main(String[] args) {

        int numeros[] = new int[]{4, 5, 76, 8, 3, 1, 2, 0, 9};
        for (int i : numeros) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        java.util.Arrays.sort(numeros); //ordena arraylist

        for (int i : numeros) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

        java.util.Arrays.asList(numeros);
        for (int i : numeros) {
            System.out.print(i + " ");
        }

        LinkedList<String> nombres = new LinkedList<String>();
        nombres.add("messi");
        nombres.add("maradona");
        nombres.add("maxi");
        nombres.add("maxi");
        nombres.add("mick");
        nombres.add("mencho");
        System.out.println("iterado con el for clasico");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }
        System.out.println(" ");
        nombres = borrarTodos(nombres, "maxi");

        nombres.set(2,"Muñeco");
        nombres.set(3,"TUki");
        nombres.remove(0);
        nombres.remove("maxi");
        if (nombres.contains("maxi")) {
            System.out.println("la persona esta");
        } else {
            System.out.println("la persona ya no esta");
        }


        System.out.println("iterado con for colecciones");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
    public static LinkedList<String> borrarTodos(LinkedList<String> lista, String nombre){
        while(lista.contains(nombre)){
            lista.remove(nombre);
        }
        return lista;
    }

}



