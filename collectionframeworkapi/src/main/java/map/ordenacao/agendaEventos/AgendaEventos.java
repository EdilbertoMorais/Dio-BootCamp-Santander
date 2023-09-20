package map.ordenacao.agendaEventos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        if (!eventosMap.isEmpty()){
            Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
            System.out.println(eventosTreeMap);
        }else {
            System.out.println("A lista de eventos está vazia.".toUpperCase());
        }
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        //Estamos pegando o Map eventosMap, e atribuindo ele ao eventoOrdenadoPorData de forma ordenada por data.
        Map<LocalDate, Evento> eventoOrdenadoPorData = new TreeMap<>(eventosMap);

        boolean eventoEncontrado = false;
            for (Map.Entry<LocalDate, Evento> entry : eventoOrdenadoPorData.entrySet()){
                if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                    System.out.println("O próximo evento: ".toUpperCase() + entry.getValue() + " acontecerá na data ".toUpperCase()
                            + entry.getKey());
                    eventoEncontrado = true;
                    break;
                }
            }
            if (!eventoEncontrado){
                System.out.println("Não existem eventos próximos".toUpperCase());
            }
    }
}
