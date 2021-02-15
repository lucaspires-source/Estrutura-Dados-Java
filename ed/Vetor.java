package ed;

import java.util.Arrays;


public class Vetor {
    private Aluno[] alunos = new Aluno[100];
    private int totalDeAlunos = 0;
    //adiciona alunos
    public void adiciona (Aluno aluno){
        this.alunos[totalDeAlunos] = aluno;
        totalDeAlunos++;
    }
    
    //confere se a posição em que o aluno será adiciona está disponivel
    private boolean posicaoValida(int posicao){
        return posicao >= 0 && posicao < totalDeAlunos;
    }

      //adiciona alunos em uma posição específica
    public void adiciona (int posicao, Aluno aluno){
        if(!posicaoValida(posicao)){
            throw new IllegalArgumentException("Posição inválida");
        }
        for(int i = totalDeAlunos - 1; i >= posicao; i -=1){
            alunos[i+1] = alunos [i];
        }
        alunos [posicao] = aluno;
        totalDeAlunos++;
    }
    
    //confere se a posição está ocupada
    private boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao < totalDeAlunos;
    }
    //basicamente um getter de alunos
    public Aluno pega(int posicao){
        if(!posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição inválida");
        }
        return alunos[posicao];
    }
    //remove alunos
    public void remove(int posicao){
        for(int i = posicao; i < this.totalDeAlunos; i++){
            this.alunos [i] = this.alunos[i+1];
        }

        totalDeAlunos--;
    }
    //confere se um aluno especifico esta no array
    public boolean contem(Aluno aluno){
       for(int i = 0; i< totalDeAlunos; i++){
           if(aluno.equals(alunos[i])){
               return true;
           }
       }
       return false;
    }

    public int tamanho(){
        return totalDeAlunos ;
    }
    public String toString(){
        return Arrays.toString(alunos);
    }

}