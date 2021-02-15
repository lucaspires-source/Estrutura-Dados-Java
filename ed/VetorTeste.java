package ed;

public class VetorTeste {
    public static void main(String[] args) {
       Aluno a1 = new Aluno("Neymar");
       Aluno a2 = new Aluno("Coutinho");

       Vetor lista = new Vetor();
       lista.adiciona(a1);
       lista.adiciona(a2);

       System.out.println(lista);
       System.out.println(lista.tamanho());
       Aluno a3 = new Aluno("Marquinhos");
       System.out.println(lista.contem(a1));
       System.out.println(lista.contem(a3));
       lista.adiciona(1,a3);
       System.out.println(lista);
       lista.remove(1);
       System.out.println(lista);
    }
}
