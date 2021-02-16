package edlistaligada;



public class TestaListaLigada {
    public static void main(String[] args) {
            ListaLigada lista = new ListaLigada();
            System.out.println(lista);
            lista.adicionaNoComeco("Godard");
            System.out.println(lista);
            lista.adicionaNoComeco("Truffaut");
            System.out.println(lista);
            lista.adicionaNoComeco("Rivette");
            System.out.println(lista);
            lista.adiciona("Demy");
            System.out.println(lista);
            lista.adiciona(2,"Malle");
            System.out.println(lista);
            System.out.println(lista.tamanho());
            System.out.println(lista.pega(0));
            lista.removeDoComeco();
            System.out.println(lista);
            System.out.println(lista.tamanho());
    }
}
