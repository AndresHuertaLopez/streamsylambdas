import java.util.HashMap;
import java.util.Map;

public class Mapas {
    public static void main(String[] args) {
        String palabra = "baabcacdddeaalsdfkjaslñdkjfañjzlxckvjljljlqjelrjaslñdjfsalñdkjfaslñdjfsaldjfsjfsajffsa";

        Map<Character,Integer> mapa_abecedario= new HashMap<>();

        for(int i=0; i<palabra.length();i++){
            char caracter  = palabra.charAt(i);

            mapa_abecedario.compute(caracter, (k,v) -> (v == null) ? 1 : ++v);
        }
        mapa_abecedario.forEach((k ,v ) -> System.out.println(k +"  " + v ));
    }
}
