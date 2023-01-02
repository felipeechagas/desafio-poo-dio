package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Java Básico para Iniciantes");
        curso1.setCargaHoraria(80);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso PostgreSql");
        curso2.setDescricao("PostgreSql Básico para Iniciantes");
        curso2.setCargaHoraria(80);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Mentoria Básico para Iniciantes");
        mentoria1.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devFelipe = new Dev();
        devFelipe.setNome("Felipe");
        devFelipe.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Felipe: " + devFelipe.getConteudosInscritos());
        devFelipe.progredir();
        devFelipe.progredir();
        devFelipe.progredir();
        devFelipe.progredir();
        System.out.println("---");
        System.out.println("Conteúdos inscritos Felipe: " + devFelipe.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Felipe: " + devFelipe.getConteudosConcluidos());
        System.out.println("Xp: " + devFelipe.calcularTotalXp());

        System.out.println("---------------");

        Dev devLeticia = new Dev();
        devLeticia.setNome("Leticia");
        devLeticia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Leticia" + devLeticia.getConteudosInscritos());
        devLeticia.progredir();
        devLeticia.progredir();
        System.out.println("Conteúdos concluídos Leticia" + devLeticia.getConteudosConcluidos());
        System.out.println("Xp: " + devLeticia.calcularTotalXp());

    }
}
