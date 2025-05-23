import model.*;
import repositories.IdeiaRepositoryEmMemoria;

public class MainTeste {
    public static void main(String[] args) {
        IdeiaRepositoryEmMemoria irem = new IdeiaRepositoryEmMemoria();

        /*IdeiaTecnica it1 = new IdeiaTecnica(1, "Java", "testando tal coisa", Status.A_INICIAR,"Tecnologia", "Java 21", "Java 21");
        irem.save(it1);*/

        IdeiaTecnica it1 = new IdeiaTecnica(1, "Estudar Java", "Estudar o Java 21", Status.A_INICIAR, "Programação", "Etsudarea ", "Java");
        irem.save(it1);

        System.out.println("==============================");

        /*IdeiaEmpreendedora iemp1 = new IdeiaEmpreendedora(2, "Bitcoin", "Investir no mercado de bitcoin", Status.A_INICIAR, "Criptomoedas", 1000.0);
        irem.save(iemp1);*/

        IdeiaEmpreendedora iemp1 = new IdeiaEmpreendedora(2, "Bitcoin", "Investir em bitcoin", Status.CONCLUIDA, "Criptomoeda", 1000.0);
        irem.save(iemp1);

        /*IdeiaOutro io1 = new IdeiaOutro(3, "Outro", "outroa ideia", Status.CONCLUIDA, "testando outra ideia");
        irem.save(io1);*/

        IdeiaOutro io1 = new IdeiaOutro(3, "otra", "Outra ideia", Status.A_INICIAR, "teste");
        irem.save(io1);


        System .out.println(irem.getIndex(iemp1.getId()));

        for (Ideia i : irem.findAll()){
            System.out.println(i);
        }

        System.out.println("==============================");


        System.out.println("==============================");

        for (Ideia i : irem.findAll()){
            System.out.println(i.getId());
            System.out.println(i.getDescricao());
            System.out.println(i.getTipoIdeia().toString());
        }

        System.out.println("==============================");

        for (Ideia i : irem.findAll()){
            System.out.println(i.getId());
            System.out.println(i.getDescricao());
            System.out.println(i.getTipoIdeia().toString());
        }

        System.out.println("==============================");
        //System.out.println(irem.findById(iemp1.getId()));
        System.out.println("REMOVENDO...");
        iemp1.setDescricao("testando o set");
        irem.save(iemp1);

        for (Ideia i : irem.findAll()){
            System.out.println(i.getId());
            System.out.println(i.getDescricao());
            System.out.println(i.getTipoIdeia().toString());
        }

        System.out.println("==============================");

        System.out.println("= TESTANDO A FUNÇÃO findByStatus");

        System.out.println("==============================");

        for (Ideia i : irem.findByStatus(Status.A_INICIAR.toString())){
            System.out.println("= ID: " + i.getId());
            System.out.println("= Title: " + i.getTitulo());
            System.out.println("= desc: " + i.getDescricao());
            System.out.println("= status: " + i.getStatus());

        }
    }
}
