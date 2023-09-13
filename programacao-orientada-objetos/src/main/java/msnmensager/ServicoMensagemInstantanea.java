package msnmensager;

/**
 * Classe Abstrata com métodos abstratos e sem corpo. Obrigando assim a quem extender está classe
 * a implementar os métodos abstratos personalizando-os conforme a necessidade de cada classe
 */
public abstract class ServicoMensagemInstantanea {
      public abstract void enviarMensagem();
      public abstract void receberMensagem();

//      public abstract void salvarHistoricoMensagem();

       protected void validarConectadoInternet() {
           System.out.println("Validando se está conectado a Internet");
       }
    }
