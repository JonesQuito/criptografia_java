
import com.criptografia.service.Arquivo;
import com.criptografia.service.CriptografiaAES;
import com.criptografia.service.MensagemCriptografada;
import java.io.File;
import javax.crypto.Cipher;


public class LeitorPacoteCriptografado {
    
    public static void main(String[] args) throws Exception{
        String mensagem = "";
        Cipher cipher = Cipher.getInstance("AES");
        
        File arquivo = Arquivo.abrirArquivo();
        MensagemCriptografada mc = (MensagemCriptografada) Arquivo.lerObject(arquivo.getAbsolutePath());
        
        mensagem = CriptografiaAES.decriptografar(mc.getSkeySpec(), mc.getMensagem(), cipher);
        
        System.out.println(mensagem);
        
    }
    
}
