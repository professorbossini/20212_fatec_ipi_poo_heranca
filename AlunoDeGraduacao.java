public class AlunoDeGraduacao{
    private String nome;
    private int idade;
    private double nota1, nota2, notaFinal;

    public void setNome (String nome){
        this.nome = nome;
    }

    public String getNome (){
        return this.nome;
    }

    public void setIdade (int idade){
        this.idade = idade;
    }

    public int getIdade (){
        return this.idade;
    }

    public void setNota1 (double nota1){
        this.nota1 = nota1;
    }

    public double getNota1(){
        return this.nota1;
    }

    public void setNota2(double nota2){
        this.nota2 = nota2;
    }

    public double getNota2(){
        return this.nota2;
    }

    public void setNotaFinal (double notaFinal){
        this.notaFinal = notaFinal;
    }

    public double getNotaFinal(){
        return this.notaFinal;
    }
}