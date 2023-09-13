package msnmensager.apps;

import msnmensager.ServicoMensagemInstantanea;

public class FacebookMessenger extends ServicoMensagemInstantanea {


    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem via FACEBOOK");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem via FACEBOOK");
    }
}
