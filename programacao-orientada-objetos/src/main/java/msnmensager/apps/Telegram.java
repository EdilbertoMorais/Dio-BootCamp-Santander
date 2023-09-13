package msnmensager.apps;

import msnmensager.ServicoMensagemInstantanea;

public class Telegram extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem via TELEGRAM");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem via TELEGRAM");
    }
}
