package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Aprenda Java em 7 Dias");
        curso1.setDescricao("Java do Zero ao Hacker");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso jv ligeirinho ");
        curso2.setDescricao("JavaScript na tranquilidade");
        curso2.setCargaHoraria(1);

        Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria Java do mestre");
        mentoria.setDescricao("Torne um Jedi do Java");
        mentoria.setData(LocalDate.now());

      //  System.out.println(curso1);
       // System.out.println(curso2);
      //  System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp em Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devLuis = new Dev();
        devLuis.setNome("Luis");
        devLuis.InscricaoBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos, Luis: " + devLuis.getConteudosInscritos());
        devLuis.progressao();
        devLuis.progressao();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos, Luis: " + devLuis.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos, Luis: " + devLuis.getConteudosConcluiudos());
        System.out.println("XP: " + devLuis.calcularTotalXp() );

        System.out.println("----------------------------------");

        Dev devSandra = new Dev();
        devSandra.setNome("Sandra");
        devSandra.InscricaoBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos, Sandra: " + devSandra.getConteudosInscritos());
        devSandra.progressao();
        devSandra.progressao();
        devSandra.progressao();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos, Sandra: " + devSandra.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos, Sandra: " + devSandra.getConteudosConcluiudos());
        System.out.println("XP: " + devSandra.calcularTotalXp() );

    }
}
