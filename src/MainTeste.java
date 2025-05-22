import model.*;
import repositories.IdeiaRepositoryEmMemoria;

public class MainTeste {
    public static void main(String[] args) {
        IdeiaRepositoryEmMemoria irem = new IdeiaRepositoryEmMemoria();
        IdeiaTecnica it1 = new IdeiaTecnica(1, "Java", "testando tal coisa", "Tecnologia", "Java 21", "Java 21");
        irem.save(it1);

        System.out.println("==============================");

        IdeiaEmpreendedora iemp1 = new IdeiaEmpreendedora(2, "Bitcoin", "Investir no mercado de bitcoin", "Criptomoedas", 1000.0);
        irem.save(iemp1);




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

        /*for (Ideia i : irem.findAll()){
            System.out.println(i.getId());
            System.out.println(i.getDescricao());
            System.out.println(i.getTipoIdeia().toString());
        }*/

        System.out.println("==============================");
        System.out.println(irem.findById(iemp1.getId()).getDescricao());

    }
}
