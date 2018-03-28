
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class ExemploHashMap {

    public static void main(String[] args) {

        Random geradorDeAleatorios = new Random();
        Map<Character, Character> alfabeto = new HashMap<>();
        Map<Character, Character> chave = new HashMap<>();

        int sorteado = 0;
        List<Character> caracteresGerados = new ArrayList<>();
        List<Character> chavesGeradas = new ArrayList<>();


        for (int i = 65; i <= 90; i++) {
            sorteado = geradorDeAleatorios.nextInt(26);
            sorteado = +65;
            if (!caracteresGerados.contains(sorteado) && sorteado != i) {
                caracteresGerados.add(new Character((char) sorteado));
                alfabeto.put((char) i, new Character((char) sorteado));
            }else{
                i--;
            }
            
        }

        for (Character c : alfabeto.values()) {
            System.out.println(c + " - " + alfabeto.get(c));
        }

    }

}
