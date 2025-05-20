import model.IdeiaCientifica;

public class MainTeste {
    public static void main(String[] args) {
        IdeiaCientifica ic1 = new IdeiaCientifica(1, "teste", "descricacao", "Fisica", false);
        System.out.println(ic1.getTipoIdeia().toString());
    }
}
