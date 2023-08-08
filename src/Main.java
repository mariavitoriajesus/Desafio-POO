import br.com.dio.Curso;
import br.com.dio.Mentoria;

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

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("Descrição da mentoria java");
        mentoria.setData(LocalDate.now());

    }
}