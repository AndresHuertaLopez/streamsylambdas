import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {


        List<Integer> lista = new ArrayList<Integer>();
        System.out.println("Josue");
        lista.add(1);
        lista.add(2);
        lista.add(14);
        lista.add(5);
        lista.add(6);
        lista.add(13423432);
        lista.add(16);
        //Stream Pipeline cat file.txt |  grep palabra |
        System.out.println(lista);
        lista.stream().forEach( numero -> System.out.println(numero+10));

        List<Integer> lista_nueva = new ArrayList<Integer>();
        lista_nueva=  lista.stream().filter(n -> n > 10).collect(Collectors.toList());

        System.out.println(lista_nueva);
    }


}
