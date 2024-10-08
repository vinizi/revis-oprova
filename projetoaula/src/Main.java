import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int votosTaffe = 0;
        int votosRodrigo = 0;
        int votosLucas = 0;
        int votosAlessandros = 0;
        int votosInválidos = 0;
        // Informar quantos usuários irão votar
        System.out.println("Informe quantos eleitores");
        int quantidadeEleitor = scanner.nextInt();
        //Criando uma forma de guardar os votos
        int [] votosRealizados = new int [quantidadeEleitor];

        for (int i = 0; i < quantidadeEleitor; i++) {
            int voto = 0;

           do {
               System.out.println("Eleitor numero " + i);
               System.out.println("Os candidatos da eleição são os seguintes:");
               System.out.println("99 - Taffe");
               System.out.println("88 - Rodrigo");
               System.out.println("77 - Lucas");
               System.out.println("66 - Alessandro");
               System.out.println("Qual o seu voto?");
               voto = scanner.nextInt();
           }while (voto !=99 && voto !=88 && voto !=77 && voto !=66);
           //Guarda voto
           votosRealizados[i] = voto;

           //Contabiliza o total de  votos
           if (voto == 99) {
                votosTaffe++;
            }else if (voto == 88) {
                votosRodrigo++;
            }else if (voto == 77) {
                votosLucas++;
            }else if (voto == 66) {
                votosAlessandros++;
            }
            }

        System.out.println("Exibindo os votos:");
        System.out.println("Taffe: " + votosTaffe + " votos!");
        System.out.println("Rodrigo: " + votosRodrigo + " votos!");
        System.out.println("Lucas: " + votosLucas + " votos!");
        System.out.println("Alessandro teve :" + votosAlessandros + " votos!");
        if(votosTaffe > votosRodrigo && votosTaffe> votosAlessandros && votosTaffe > votosLucas) {
            System.out.println("O grande ganhador é o Taffe");
        } else if (votosRodrigo > votosTaffe && votosRodrigo > votosLucas && votosRodrigo > votosAlessandros) {
            System.out.println("O grande ganhador é o Rodrigo");

        } else if (votosAlessandros > votosRodrigo && votosAlessandros > votosTaffe && votosAlessandros > votosLucas) {
            System.out.println("O grande ganhador é o Alessandro");

        } else {
            System.out.println("O grande ganhador é o Alessandro");

        }
    }
    }
