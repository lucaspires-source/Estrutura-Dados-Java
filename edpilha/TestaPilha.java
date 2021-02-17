package edpilha;

import java.util.Stack;

public class TestaPilha {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        System.out.println(pilha);
        System.out.println("-> " +pilha.vazia());
        pilha.push("Jordan");
        System.out.println(pilha);
        pilha.push("Pippen");
        System.out.println(pilha);
        pilha.push("Rodman");
        System.out.println(pilha);
        pilha.pop();
        System.out.println(pilha);
        System.out.println("-> " + pilha.vazia());


        Stack<String> stack = new Stack<String>();
        stack.push("Lebron");
        stack.push("Wade");
        stack.push("Bosh");
        System.out.println(stack);
        stack.pop();
        stack.peek();
        System.out.println(stack.peek());
    }
}
