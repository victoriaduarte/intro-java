// 1 - Pacote
package intro;


// 2 - Referência às bibliotecas

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos

    // 3.2 - Métodos e Funções
    public static void main(String[] args){

        calcularAreaModoCurto();
        calcularAreaModoExtenso();

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

}

