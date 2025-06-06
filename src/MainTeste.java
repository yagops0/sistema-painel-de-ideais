import model.*;
import repositories.IdeiaRepository;
import repositories.IdeiaRepositoryEmMemoria;
import service.IdeiaService;


public class MainTeste {
    public static void main(String[] args) {
        IdeiaRepository ideiaRepository = new IdeiaRepositoryEmMemoria();
        IdeiaService ideiaService = new IdeiaService(ideiaRepository);

        IdeiaTecnica it1 = new IdeiaTecnica();
        it1.setId(1);
        it1.setTitulo("JAva");
        it1.setDescricao("TESTEEEE");
        it1.setEspecialidade("Desenvolvimento de Software");
        it1.setEspecialidade("Tecnologia");

        if (ideiaService.criarIdeia(it1)){
            System.out.println("Ideia criada com sucesso!");
        }
        else {
            System.out.println("não foi possível criar a ideia!");
        }

        System.out.println("==============================");

        for (Ideia i : ideiaService.retornarIdeias()){
            System.out.println(i.getId());
            System.out.println(i.getTitulo());
            System.out.println(i.getDescricao());
            System.out.println(i.getTipoIdeia().toString());
        }

        /*IdeiaEmpreendedora iemp1 = new IdeiaEmpreendedora(2, "Bitcoin", "Investir em bitcoin", Status.CONCLUIDA, "Criptomoeda", 1000.0);
        irem.save(iemp1);


        IdeiaOutro io1 = new IdeiaOutro(3, "otra", "Outra ideia", Status.A_INICIAR, "teste");
        irem.save(io1);

        IdeiaOutro io2 = new IdeiaOutro(4, "otra 2", "Outra ideia 2", Status.A_INICIAR, "teste2");
        irem.save(io2);


        //System .out.println(irem.getIndex(iemp1.getId()));

        for (Ideia i : irem.findAll()){
            System.out.println(i.toString());
        }

        System.out.println("==============================");


        System.out.println("==============================");

        for (Ideia i : irem.findAll()){
            System.out.println(i.getId());
            System.out.println(i.getDescricao());
            System.out.println(i.getTipoIdeia().toString());
        }

        System.out.println("==============================");

        *//*for (Ideia i : irem.findAll()){
            System.out.println(i.getId());
            System.out.println(i.getDescricao());
            System.out.println(i.getTipoIdeia().toString());
        }*//*

        *//*System.out.println("==============================");
        System.out.println(irem.findById(iemp1.getId()));
        System.out.println("REMOVENDO...");
        iemp1.setDescricao("testando o set");
        irem.save(iemp1);*//*

        *//*for (Ideia i : irem.findAll()){
            System.out.println(i.getId());
            System.out.println(i.getDescricao());
            System.out.println(i.getTipoIdeia().toString());
        }*//*

        *//*System.out.println("==============================");

        System.out.println("= TESTANDO A FUNÇÃO findByStatus");

        System.out.println("==============================");

        for (Ideia i : irem.findByStatus(Status.A_INICIAR.toString())){
            System.out.println("= ID: " + i.getId());
            System.out.println("= Title: " + i.getTitulo());
            System.out.println("= desc: " + i.getDescricao());
            System.out.println("= status: " + i.getStatus());

        }*//*

    

        System.out.println("==============================");

        System.out.println("= TESTANDO A FUNÇÃO findByTipoIdeia");

        System.out.println("==============================");

        for (Ideia i : irem.findByTipoIdeia(TipoIdeia.OUTRO.toString())){
            System.out.println("= ID: " + i.getId());
            System.out.println("= TIPO DE IDEIA: " + i.getTipoIdeia());
            System.out.println("= Title: " + i.getTitulo());
            System.out.println("= desc: " + i.getDescricao());
            System.out.println("= status: " + i.getStatus());
        }*/
    }
}
