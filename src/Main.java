import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java POO");
        curso1.setDescricao("Descrição curso JAVA POO");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("JavaScript web");
        curso2.setDescricao("Descrição curso JavaScript web");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setDate(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Jason");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + dev1.getNome() + ": "  + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();

        System.out.println("-");
        System.out.println("Conteúdos Inscritos " + dev1.getNome() + ": "  + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + dev1.getNome() + ": "  + dev1.getConteudosConcluidos());
        System.out.println("XP: "+dev1.calcularTotalXp() );

        System.out.println("----------");

        Dev dev2 = new Dev();
        dev2.setNome("Costa");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos "+ dev2.getNome() + ": "  +dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos "+ dev2.getNome() + ": "  +dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos "+ dev2.getNome() + ": "  +dev2.getConteudosConcluidos());
        System.out.println("XP: "+dev2.calcularTotalXp() );

        System.out.println("----------");

        Dev dev3 = new Dev();
        dev3.setNome("Souza");
        dev3.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos "+ dev3.getNome() + ": "  +dev3.getConteudosInscritos());
        dev3.progredir();
        dev3.progredir();
        dev3.progredir();

        System.out.println("-");
        System.out.println("Conteúdos Inscritos "+ dev3.getNome() + ": "  +dev3.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos "+ dev3.getNome() + ": "  +dev3.getConteudosConcluidos());
        System.out.println("XP: "+dev3.calcularTotalXp() );


        System.out.println("----------");
        // Realizar o ranking de XP dos DEVS
        System.out.println("Ranking dos DEVs");
        Set<Map.Entry<String, Double>> inscritos = new TreeSet<>(new ComparatorRanking());
        inscritos.add(Map.entry(dev1.getNome(), dev1.calcularTotalXp()));
        inscritos.add(Map.entry(dev2.getNome(), dev2.calcularTotalXp()));
        inscritos.add(Map.entry(dev3.getNome(), dev3.calcularTotalXp()));

        List<Map.Entry<String, Double>> ranking = new ArrayList<>(inscritos);
        Collections.reverse(ranking);

        System.out.println(ranking);

    }
}