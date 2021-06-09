// 1 - Pacote
package intro;


// 2 - Referência às bibliotecas

import java.util.Locale;
import java.util.Scanner;

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos

    // 3.2 - Métodos e Funções
    public static void main(String[] args){
        // Classe Scanner para ler a escolha do usuário no console
        Scanner scanner = new Scanner(System.in);
        System.out.println("M E N U  D E  O P Ç Õ E S");
        System.out.println("c - Calcular Area Modo Curto");
        System.out.println("d - Contar Até Dez");
        System.out.println("e - Calcular Area Modo Extenso");
        System.out.println("i - If Simples");
        System.out.println("r - Contagem Regressiva");
        System.out.println("Digite a opção desejada: ");
        String opcao = scanner.next().toLowerCase();

        // Switch = Selecionar o comportamento do programa conforme a escolha da pessoa ou do software

        //String opcao = "teste";

        switch (opcao){
            case "c":
                System.out.println("Você escolheu executar o método calcularAreaModoCurto");
                calcularAreaModoCurto();
                break;
            case "d":
                System.out.println("Você escolheu executar o método contarAteDez");
                contarAteDez();
                break;
            case "e":
                System.out.println("Você escolheu executar o método calcularAreaModoExtenso");
                calcularAreaModoExtenso();
                break;
            case "i":
                System.out.println("Você escolheu executar o método ifSimples");
                ifSimples();
                break;
            case "r":
                System.out.println("Você escolheu executar o método contagemRegressiva");
                contagemRegressiva();
                break;
            default:
                System.out.println("Você escolheu outro valor que não tem uma ação associada");
        }
    }

    public static void ifSimples() {
        // Condicional

        String modo = "curto";

        if(modo == "curto"){
            calcularAreaModoCurto();
        }
        else {
            calcularAreaModoExtenso();
        }
    }

    public static void calcularAreaModoCurto(){
        System.out.println("Cálculo de área Modo Curto"); // digitar sout

        // Calculo de área - Reduzido
        int largura = 4;
        int comprimento = 3;
        System.out.println("Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m a área é de " + largura * comprimento + "m²");
    }

    public static void calcularAreaModoExtenso(){
        System.out.println("Cálculo de área Modo Extenso");

        // Calculo de area - Exemplo: o tamanho do tapete ou do piso
        int largura;
        int comprimento;
        int resultado;

        largura = 4;
        comprimento = 3;

        resultado = largura * comprimento;
        System.out.println("Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m a área é de " + resultado + "m²");
    }
    public static void contarAteDez(){

        // Loops ou Repetições
        // for = repetição incondicional

        System.out.println("Contagem Crescente");

        for(int numero = 1; numero <= 10; numero++){
            System.out.println(numero);
        }
    }

    public static void contagemRegressiva() {

        System.out.println("Contagem Regressiva");

        for(int numero = 10; numero > -1; numero--) {
            System.out.println(numero);
        }
    }
}


