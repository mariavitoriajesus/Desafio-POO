import br.com.dio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);
        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso1.setTitulo("curso Angular");
        curso1.setDescricao("descrição curso angular");
        curso1.setCargaHoraria(8);
        System.out.println(curso2);

        Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("Descrição da mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java Developer");
        bootcamp.setDescricao("Descrição bootcamp java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Maria: " + devMaria.getConteudosInscritos());
        devMaria.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Maria: " + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Maria: " + devMaria.getConteudosConcluidos());
        System.out.println("XP: " +devMaria.calcularTotalXp());

        System.out.println("\n-----------------------------------------------\n");

        Dev devJp = new Dev();
        devJp.setNome("Jp");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos João: " + devMaria.getConteudosInscritos());
        devJp.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos João: " + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos concluidos João: " + devMaria.getConteudosConcluidos());
        System.out.println("XP: " + devJp.calcularTotalXp());

    }
}