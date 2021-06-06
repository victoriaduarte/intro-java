// 1 - Pacote
package intro;


// 2 - Referência às bibliotecas

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos

    // 3.2 - Métodos e Funções
    public static void main(String[] args){
        System.out.println("Meu primeiro codigo em Java!"); // digitar sout

    }

    public void calcularAreaModoExtenso(){
        // Calculo de area - Exemplo: o tamanho do tapete ou do pisoS

        int largura;
        int comprimento;
        int resultado;

        largura = 4;
        comprimento = 4;

        resultado = largura * comprimento;
        System.out.println("Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m a área é de " + resultado + "m²");
    }

    public void calcularAreaModoCompacto(){
        int largura = 4;
        int comprimento = 3;
        System.out.println("Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m a área é de " + largura * comprimento + "m²");
    }
}

