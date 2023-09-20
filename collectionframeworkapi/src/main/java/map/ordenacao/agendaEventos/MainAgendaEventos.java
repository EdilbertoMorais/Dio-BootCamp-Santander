package map.ordenacao.agendaEventos;

import java.time.LocalDate;

public class MainAgendaEventos {
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        //Deve imprimir a mensagem "A LISTA DE EVENTOS ESTÁ VAZIA."
        agendaEventos.exibirAgenda();

        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 15),  "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2021, 10, 9),  "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2021, 8, 22),  "Evento 3", "Atração 3");

        //Deve imprimir a lista de todos os eventos.
        agendaEventos.exibirAgenda();
        //Deve imprimir a mensagem "NÃO EXISTEM EVENTOS PRÓXIMOS".
        agendaEventos.obterProximoEvento();

        agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 21),  "Evento 4", "Atração 4");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 20),  "Evento 5", "Atração 5");
        //Deve imprimir a mensagem "O PRÓXIMO EVENTO: (nome= Evento 5, atração= Atração 5) ACONTECERÁ NA DATA 2024-09-20"
        agendaEventos.obterProximoEvento();
    }
}
