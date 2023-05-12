import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

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
    }
}