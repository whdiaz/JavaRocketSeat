public class Estudante {

  String nome;
  Integer nota;

  public Estudante(String nome, Integer nota) {
    this.nome = nome;
    this.nota = nota;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Integer getNota() {
    return nota;
  }

  public void setNota(Integer nota) {
    this.nota = nota;
  }

  public String toString(){
    return "Estudante: " + nome + "Nota: " + nota;
  }

  

}
