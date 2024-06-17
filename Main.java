import java.util.Scanner;

public class Main extends Espacial {

    public static void main(String args[]) {
        Main calc = new Main();
        Scanner scn = new Scanner(System.in);

        while (true) {
            System.out.println("1 - Geometria Plana");
            System.out.println("2 - Geometria Espacial");
            System.out.println("3 - Sair do programa");

            int escolha = scn.nextInt();
            scn.nextLine();
            
            switch (escolha) {
                case 1:
                    System.out.println("Geometria Plana:");
                    System.out.println("1 - Quadrado");
                    System.out.println("2 - Retângulo");
                    System.out.println("3 - Triângulo");
                    System.out.println("4 - Triângulo Equilatero");
                    System.out.println("5 - Paralelogramo");
                    System.out.println("6 - Trapezio");
                    System.out.println("7 - Losango");
                    System.out.println("8 - Círculo");

                    escolha = scn.nextInt();
                    scn.nextLine();

                    Plana plna = new Plana();

                    switch (escolha) {
                        case 1:

                            System.out.println("Insira o valor do lado do quadrado");
                            plna.a = scn.nextDouble();
                            scn.nextLine();
                            System.out.println(plna.Square());

                            break;

                        case 2:

                            System.out.println("Insira o valor da base do retângulo");
                            plna.a = scn.nextDouble();
                            scn.nextLine();
                            System.out.println("Insira o valor da altura do retângulo");
                            plna.b = scn.nextDouble();
                            scn.nextLine();
                            System.out.println(plna.Rectangle());

                            break;

                        case 3:

                            System.out.println("Insira o valor da base do lado 1 do triangulo");
                            plna.a = scn.nextDouble();
                            System.out.println("Insira o valor da base do lado 2 do triangulo");
                            plna.b = scn.nextDouble();
                            System.out.println("Insira o valor da base do lado 3 do triangulo");
                            plna.c = scn.nextDouble();
                            scn.nextLine();
                            System.out.println("Insira o valor da altura do triangulo");
                            plna.h = scn.nextDouble();
                            scn.nextLine();
                            System.out.println(plna.Triangle());

                            break;

                        case 4:

                            System.out.println("Insira o valor da base do triangulo");
                            plna.a = scn.nextDouble();
                            scn.nextLine();
                            System.out.println(plna.TriangleEqui());

                            break;

                        case 5:

                            System.out.println("Insira o valor do lado 1 do paralelogramo");
                            plna.a = scn.nextDouble();
                            scn.nextLine();
                            System.out.println("Insira o valor do lado 2 do paralelogramo");
                            plna.b = scn.nextDouble();
                            scn.nextLine();
                            System.out.println("Insira o valor da altura do paralelogramo");
                            plna.h = scn.nextDouble();
                            scn.nextLine();
                            System.out.println(plna.Parelelogram());

                            break;

                        case 6:

                            System.out.println("Insira o valor da base maior do trapézio");
                            plna.D = scn.nextDouble();
                            scn.nextLine();
                            System.out.println("Insira o valor da base menor do trapézio");
                            plna.d = scn.nextDouble();
                                 scn.nextLine();
                            System.out.println("Insira o valor da altura do trapézio");
                            plna.a = scn.nextDouble();
                            scn.nextLine();
                            System.out.println(plna.Trapezium());

                            break;

                        case 7:

                            System.out.println("Insira o valor da diagonal maior do losango");
                            plna.D = scn.nextDouble();
                            scn.nextLine();
                            System.out.println("Insira o valor da diagonal menor do losango");
                            plna.d = scn.nextDouble();
                            scn.nextLine();
                            System.out.println("Insira o valor do lado do losango");
                            plna.a = scn.nextDouble();
                            scn.nextLine();
                            System.out.println(plna.Losangle());

                            break;

                        case 8:

                            System.out.println("Insira o valor do raio do círculo");
                            plna.r = scn.nextDouble();
                            scn.nextLine();
                            System.out.println(plna.Circle());

                            break;

                        default:
                            System.out.println("Número Invalido");
                            break;
                    }
                    break;
                case 2:

                    System.out.println("Geometria Espacial:");
                    System.out.println("1 - Pirâmide de base quadrada");
                    System.out.println("2 - Pirâmide de base triangular");
                    System.out.println("3 - Pirâmide de base pentagonal");
                    System.out.println("4 - Cone");
                    System.out.println("5 - Prisma de base quadrada");
                    System.out.println("6 - Prisma de base triangular");
                    System.out.println("7 - Prisma de base pentagonal");
                    System.out.println("8 - Cilindro");
                    System.out.println("9 - Tronco de cone");
                    System.out.println("10 - Tronco de base quadrada");
                    System.out.println("11 - Esfera");
                    

                    escolha = scn.nextInt();
                    scn.nextLine();

                    Espacial esp = new Espacial();

                    switch (escolha) {
                        case 1:
                            System.out.println("Insira o valor do lado da base da piramide de base quadrada");
                            esp.a = scn.nextDouble();
                            scn.nextLine();
                            System.out.println("Insira o valor da geratriz da piramide de base quadrada");
                            esp.g = scn.nextDouble();
                            scn.nextLine();
                            System.out.println("Insira o valor da altura da piramide de base quadrada");
                            esp.h = scn.nextDouble();
                            scn.nextLine();
                            System.out.println(esp.PiramideB4());
                            break;
                        case 2:
                            System.out.println("Insira o valor da base da base da piramide de base triangular");
                            esp.a = scn.nextDouble();
                            scn.nextLine();
                            System.out.println("Insira o valor da geratriz da piramide de base triangular");
                            esp.g = scn.nextDouble();
                            scn.nextLine();
                            System.out.println("Insira o valor da altura da piramide de base triangular");
                            esp.h = scn.nextDouble();
                            scn.nextLine();
                            System.out.println("Insira o valor da altura da base da piramide de base triangular");
                            esp.b = scn.nextDouble();
                            scn.nextLine();
                            System.out.println(esp.PiramideB3());
                            break;
                        case 3:
                            System.out.println("Insira o valor do lado da base da piramide de base pentagonal");
                            esp.a = scn.nextDouble();
                            scn.nextLine();
                            System.out.println("Insira o valor da geratriz da piramide de base pentagonal");
                            esp.g = scn.nextDouble();
                            scn.nextLine();
                            System.out.println("Insira o valor da altura da piramide de base pentagonal");
                            esp.h = scn.nextDouble();
                            scn.nextLine();
                            System.out.println("Insira o valor apotema da base da piramide de base pentagonal");
                            esp.b = scn.nextDouble();
                            scn.nextLine();
                            System.out.println(esp.PiramideB5());
                            break;
                        case 4:
                            System.out.println("Insira o valor do raio do cone");
                            esp.r = scn.nextDouble();
                            scn.nextLine();
                            System.out.println("Insira o valor da geratriz do cone");
                            esp.g = scn.nextDouble();
                            scn.nextLine();
                            System.out.println(esp.Cilindro());
                            break;
                        case 5:
                            System.out.println("Insira o valor do lado 1 do prisma de base quadrada");
                            esp.a = scn.nextDouble();
                            scn.nextLine();
                            System.out.println("Insira o valor do lado 2 do prisma de base quadrada");
                            esp.b = scn.nextDouble();
                            scn.nextLine();
                            System.out.println("Insira o valor da altura do prisma de base quadrada");
                            esp.h = scn.nextDouble();
                            scn.nextLine();
                            System.out.println(esp.PrismaB4());
                            break;
                        case 6:
                            System.out.println("Insira o valor da base da base do prisma de base triangular");
                            esp.a = scn.nextDouble();
                            scn.nextLine();
                            System.out.println("Insira o valor da altura da base do prisma de base triangular");
                            esp.b = scn.nextDouble();
                            scn.nextLine();
                            System.out.println("Insira o valor da altura do prisma de base triangular");
                            esp.h = scn.nextDouble();
                            scn.nextLine();
                            System.out.println(esp.PrismaB4());
                            break;
                        case 7:
                            System.out.println("Insira o valor do lado do prisma de base pentagonal");
                            esp.a = scn.nextDouble();
                            scn.nextLine();
                            System.out.println("Insira o valor do apotema do prisma de base pentagonal");
                            esp.b = scn.nextDouble();
                            scn.nextLine();
                            System.out.println("Insira o valor da altura do prisma de base pentagonal");
                            esp.h = scn.nextDouble();
                            scn.nextLine();
                            System.out.println(esp.PrismaB5());
                            break;
                        case 8:
                            System.out.println("Insira o valor do raio do cilindro");
                            esp.r = scn.nextDouble();
                            scn.nextLine();
                            System.out.println("Insira o valor da altura do cilindro");
                            esp.h = scn.nextDouble();
                            scn.nextLine();
                            System.out.println(esp.Cilindro());
                            break;
                        case 9:
                            System.out.println("Insira o valor do raio menor do tronco do cone");
                            esp.r = scn.nextDouble();
                            scn.nextLine();
                            System.out.println("Insira o valor o raio maior do tronco do cone");
                            esp.R = scn.nextDouble();
                            scn.nextLine();
                            System.out.println("Insira o valor da altura do tronco do cone");
                            esp.h = scn.nextDouble();
                            scn.nextLine();
                            System.out.println(esp.TroncoC());
                            break;
                        case 10:
                            System.out.println("Insira o valor do lado maior do tronco da piramide");
                            esp.L = scn.nextDouble();
                            scn.nextLine();
                            System.out.println("Insira o valor do lado menor do tronco da piramide");
                            esp.l = scn.nextDouble();
                            scn.nextLine();
                            System.out.println("Insira o valor da altura da pirâmide");
                            esp.h = scn.nextDouble();
                            scn.nextLine();
                            System.out.println(esp.TroncoQ());
                            break;
                        case 11:
                            System.out.println("Insira o valor do raio da esfera");
                            esp.r = scn.nextDouble();
                            scn.nextLine();
                            System.out.println(esp.Esfera());
                            break;

                        default:
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Programa fechado");
                    scn.close();
                    System.exit(0);
                break;
                    default:
                    System.out.println("Valor inserido inválido");
                    break;
            }
        }
    }
}