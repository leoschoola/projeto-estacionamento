import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Entrada {

    public String Entrou(){ //Registrando horário exato de entrada do veículo
        Date horaAtual = new Date();
        Locale localBrasil = new Locale("pt","BR");
        SimpleDateFormat formatadorBr = new SimpleDateFormat("dd' de 'MMMM' de 'yyyy' as 'HH:mm:ss", localBrasil);
        String formatado;
        return formatadorBr.format(horaAtual);
    }

}
