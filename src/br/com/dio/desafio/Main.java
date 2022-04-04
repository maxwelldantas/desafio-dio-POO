package br.com.dio.desafio;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Dev;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

/*        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devSebastiana = new Dev();
        devSebastiana.setNome("Sebastiana");
        devSebastiana.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Sebastiana:" + devSebastiana.getConteudosInscritos());
        devSebastiana.progedir();
        devSebastiana.progedir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Sebastiana:" + devSebastiana.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Sebastiana:" + devSebastiana.getConteudosConcluidos());
        System.out.println("XP:" + devSebastiana.calcularTotalXp());

        System.out.println("-------------");

        Dev devSebastiao = new Dev();
        devSebastiao.setNome("Sebastião");
        devSebastiao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Sebastião:" + devSebastiao.getConteudosInscritos());
        devSebastiao.progedir();
        devSebastiao.progedir();
        devSebastiao.progedir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Sebastião:" + devSebastiao.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Sebastião:" + devSebastiao.getConteudosConcluidos());
        System.out.println("XP:" + devSebastiao.calcularTotalXp());
    }
}
