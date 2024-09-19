public class Metodo {

    public String verificarPositivoOuNegativo(int numero) {  // Metodo de verificacao, se o numero e positivo ou negativo
        if (numero >= 0) {
            return "Positivo";
        } else {
            return "Negativo";
        }

    }

    public double calcularMedia(double n1, double n2, double n3) {   // Metodo que recebe tres numeros e retorna media aritmetica 
        double media = (n1 + n2 + n3) / 3;
        return media;

    }

    public int encontrarMaior(int n1, int n2, int n3) {  //metodo que recebe tres numeros e retorna o maior 

        int maior = n1;

        if (n2 > maior) {
            maior = n2;
        }

        if (n3 > maior) {
            maior = n3;
        }

        return maior;

    }

    public double calcularPotencia(double base, double expoente) { //metodo para receber dois numeros "a" e "b" e retornar "ab"

        return Math.pow(base, expoente);  //utilizando a funcao "math pow"  para calcular a potencia 
    }

    public String converterMinutosParaHoras(int minutos) {  //metodo que recebe uma quantidade de minutos e retorna o equivalente em horas e minutos.

        int horas = minutos / 60;

        int minutosRestantes = minutos % 60; //aqui calculamos o numero de minutos restantes 

        return horas + " horas e " + minutosRestantes + " minutos";


    }

    public int calcularFatorial(int numero) {   //metodo que calcula fatorial de um numero

        int fatorial = 1; //variavel que armazena resultado do fatorial, comeca em 1

        //loop para multiplicar o numero por cada valor abaixo dele 
        for (int i = 1; i <= numero; i++) { 
                fatorial *= i;
            }
            return fatorial;
        }
        public static void main (String[] args) {

            Metodo metodoObj = new Metodo();



            System.out.println(metodoObj.verificarPositivoOuNegativo(0)); // Positivo
            System.out.println(metodoObj.verificarPositivoOuNegativo(-5)); // Negativo
    
            // Testando o método calcularMedia
            System.out.println(metodoObj.calcularMedia(10, 20, 30)); // 20.0
    
            // Testando o método encontrarMaior
            System.out.println(metodoObj.encontrarMaior(10, 20, 30)); // 30
    
            // Testando o método calcularPotencia
            System.out.println(metodoObj.calcularPotencia(2, 3)); // 8.0
    
            // Testando o método converterMinutosParaHoras
            System.out.println(metodoObj.converterMinutosParaHoras(90)); // 1 horas e 30 minutos
    
            // Testando o método calcularFatorial
            System.out.println(metodoObj.calcularFatorial(5)); // 120
        }
    }
    










