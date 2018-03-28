
import com.criptografia.service.CriptografiaPorSubstituicao;
import java.io.File;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

public class teste {

    public static void main(String[] args) {

        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        
      
        
        System.out.println(fc.showOpenDialog(null));

        //File file = fc.getSelectedFile();
        /*     
        String nome = "Jones Dhyemison Quito de Oliveira";
        
        String nomeCriptografado = CriptografiaPorSubstituicao.criptografar(nome, 5);
        String nomeDecriptografado = CriptografiaPorSubstituicao.decriptografar(nomeCriptografado, 5);
        
        System.out.println("Nome Criptografado: " + nomeCriptografado);
        System.out.println("Nome Criptografado: " + nomeDecriptografado);
         */
    }

}
