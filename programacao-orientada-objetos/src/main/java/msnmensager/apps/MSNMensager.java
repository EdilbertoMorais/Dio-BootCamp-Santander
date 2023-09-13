package msnmensager.apps;

import msnmensager.ServicoMensagemInstantanea;

public class MSNMensager extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem via MSN");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem via MSN");
    }

//    @Override
//    public void salvarHistoricoMensagem() {
//        System.out.println("Salvando histórico das mensagens ");
//    }
}
