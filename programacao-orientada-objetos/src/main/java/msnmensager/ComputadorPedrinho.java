package msnmensager;

import msnmensager.apps.FacebookMessenger;
import msnmensager.apps.MSNMensager;
import msnmensager.apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;

        String appEscolhido =  "face";

        if (appEscolhido.equals("msn"))
            smi = new MSNMensager();
        else if (appEscolhido.equals("face")) {
            smi = new FacebookMessenger();
        }else if (appEscolhido.equals("tel"))
            smi = new Telegram();


        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
