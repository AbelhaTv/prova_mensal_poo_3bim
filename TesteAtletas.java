public class TesteAtletas{

public static void main(String args[]){
System.out.println("\n\n");

Maratonista mineiro = new Maratonista();
mineiro.setNome("jose dos santos " + getNome() + " comecou a correr");
mineiro.correr();

System.out.println("\n\n");

Estradista corisco = new Estradista();
corisco.setNome("manoela assis" + getNome() + " comecou a pedalar");
corisco.pedalar();

System.out.println("\n\n");


   }

}