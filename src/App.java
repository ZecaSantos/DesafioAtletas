import java.util.Locale;
import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        
    Locale.setDefault(Locale.US);
     Scanner sc = new Scanner(System.in);

       int N, qtd_man, qtd_woman, total_alturas_woman;
       String nome;
       String atl_alto_mais;
       char sexo;
       double altura, peso, pes_medio, peso_total, porcent_man, alt_media_woman, 
       nova_altura;

       alt_media_woman = 1;
       qtd_man = 0;
       nova_altura = 0;
       qtd_woman = 0;
       total_alturas_woman = 0;
       peso_total = 0;
       pes_medio = 0;
       atl_alto_mais = "joao";
       porcent_man = 0;

       System.out.println("Qual é a quantidade de atletas? ");
       N = sc.nextInt();

       for(int i = 1; i < N; i++){
            System.out.printf("Digite os dados do atleta numero: %d\n", i);
            System.out.print("Nome: ");
            nome = sc.next();

            System.out.print("Sexo (F / M):");
            sexo = sc.next().charAt(0);

               
                    while(sexo != 'f' && sexo != 'm') {
                        System.out.println("Valor inválido! Favor digitar F ou M");
                        sexo = sc.next().charAt(0);
                    }
               

                if(sexo == 'm'){
                    qtd_man = qtd_man + 1;
                }

            System.out.print("Altura: ");
            altura = sc.nextDouble();

               if(altura <= 0){

                    do{
                        System.out.println("Valor invalido! Favor digitar um valor positivo:");
                        altura = sc.nextDouble();
                    }while(altura <= 0);
               }

               if(altura > nova_altura){
                atl_alto_mais = nome;
               }
            nova_altura = altura;

                 if(sexo == 'f'){
                    qtd_woman = qtd_woman + 1;
                    total_alturas_woman = (int) (total_alturas_woman + altura);
                    alt_media_woman =  total_alturas_woman / qtd_woman;
            }

            System.out.println("Peso: ");
            peso = sc.nextDouble();

                if(peso <= 0 ){
                    do{
                        System.out.println("Valor invalido! Favor digitar um valor positivo: ");
                        peso = sc.nextDouble();
                    }while(peso <= 0 );
                }
            
                    peso_total = peso_total + peso;
                    pes_medio = peso_total / N;
                    porcent_man = (qtd_man * 100) / N;
       }

       System.out.println();
       System.out.println("RELATÓRIO: ");
       System.out.println();
       System.out.printf("Peso médio dos atletas: %.2f\n", pes_medio);
       System.out.printf("Atleta mais alto: %.2f\n", atl_alto_mais);
       System.out.printf("Porcentagem de homens: %.2f\n", porcent_man);
       System.out.printf("Altura média das mulheres: %.2f\n", alt_media_woman);

        sc.close(); 

}

}