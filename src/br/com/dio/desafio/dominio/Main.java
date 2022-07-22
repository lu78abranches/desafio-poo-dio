package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Aprenda Java em 7 Dias");
        curso1.setDescricao("Java do Zero ao Hacker");
        curso1.setCargaHoraria(1200);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso jv ligeirinho ");
        curso2.setDescricao("JavaScript na tranquilidade");
        curso2.setCargaHoraria(1);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria Java do mestre");
        mentoria.setDescricao("Torne um Jedi do Java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}
