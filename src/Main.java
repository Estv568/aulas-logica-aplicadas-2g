public class Main {
    public static void main(String[] args) {
// Aula introdutória de Orientação à Objetos
// Criar objetos
        Pessoa adao = new Pessoa();
// Declaração de objeto
        Pessoa qualquer;
// Instanciação do objeto
        qualquer = new Pessoa();
        Pessoa adulta = new Pessoa();
// Definir forma do objeto
        qualquer.nome = "Rita";
        qualquer.sobrenome = "Lee";
// Definir comportamento do objeto
        qualquer.falar();
        adao.falar("baixo");

        Pessoa rainha = new Pessoa();

        rainha.nome="tina";
        rainha.sobrenome="jif";

        rainha.falar();
        rainha.falar("alto");
System.out.println("alto");

        Animal cao = new Animal();
        cao.nome = "pluto";
        cao.comer();

        rainha.comer();

    }
}