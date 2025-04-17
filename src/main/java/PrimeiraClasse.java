import java.util.*;


public class PrimeiraClasse  {

    public static void main (String[] args)  {

    Scanner read = new Scanner(System.in);
    System.out.print("Insira seu nome: ");
    String nome = read.nextLine();
    System.out.print("Insira sua idade: ");
    int idade = read.nextInt();
    read.nextLine();
    Pessoa Pessoa1 = new Pessoa(nome,idade);
    System.out.println("Tem um pet?(Digite 1 para 'SIM' e 2 para 'Não') ");
    int answer = read.nextInt();
    read.nextLine();
    if(answer == 1) {
        System.out.println("Insira o nome: ");
        String nomePet = read.nextLine();
        System.out.println("Insira a idade: ");
        int idadePet = read.nextInt();
        Pet pet1 = new Pet(nomePet, idadePet, Pessoa1);
        System.out.println("Pet cadastrado!!");
        System.out.println("Pet: "+ pet1.getNome().toUpperCase() + " tem um dono chamado(a) "+ pet1.getDono().getNome().toUpperCase() );
    }else
    {
        System.out.println("Está na hora de adotar um viu em");
    }

    }
}
