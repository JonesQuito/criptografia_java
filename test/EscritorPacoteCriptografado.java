
import com.criptografia.service.Arquivo;
import com.criptografia.service.CriptografiaAES;
import com.criptografia.service.MensagemCriptografada;
import java.io.File;
import java.io.IOException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class EscritorPacoteCriptografado {

    public static void main(String[] args) throws Exception {

        String mensagem = "Mensagem a ser criptografada ada ada ada ada ada ada";
        Cipher cipher = Cipher.getInstance("AES");
        SecretKeySpec skeyspec = CriptografiaAES.getKeyAES();
        byte[] encrypted;
        MensagemCriptografada mc = new MensagemCriptografada();
        
        encrypted = CriptografiaAES.criptografar(skeyspec, mensagem, cipher);
                
        //mc.setCipher(cipher);
        mc.setSkeySpec(skeyspec);
        mc.setMensagem(encrypted);
        
        File file = null;
        
        
        JFileChooser fc = new JFileChooser();
            fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            fc.setSelectedFile(file);
            if (fc.showSaveDialog(null) == 1) {
                return;
            }
            file = fc.getSelectedFile();

            if (file != null) {
                String destino = file.getPath();
                destino = destino;
                Arquivo.writeObject(mc, destino);
                JOptionPane.showMessageDialog(null, "Pacote salvo em: " + destino);
            }
        
        
    }

}
