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

       int N;
       String nome;
       String atl_alto_mais;
       String sexo;
       double altura, peso, pes_medio, peso_total, porcent_man, alt_media_woman, 
       nova_altura, total_alturas_woman, qtd_man, qtd_woman;

       alt_media_woman = 1.00;
       qtd_man = 0;
       nova_altura = 0.00;
       qtd_woman = 0;
       total_alturas_woman = 0;
       peso = 0;
       peso_total = 0;
       pes_medio = 0;
       atl_alto_mais = "joao";
       porcent_man = 0;
       nome = "joao";
       
      

       System.out.println("Qual é a quantidade de atletas? ");
       N = sc.nextInt();

       for(int i = 0; i < N; i++){
            System.out.printf("Digite os dados do atleta numero: %d\n", i+1);
            System.out.print("Nome: ");
            nome = sc.next();

            //Recebendo sexo

            System.out.print("Sexo (F / M):");
            sexo = sc.next();
            

            System.out.println();

                if(!sexo.equals("f") && !sexo.equals("m")){
                    sexo = sc.next();
               
                    while(!sexo.equals("f") && !sexo.equals("m")) {
                        System.out.println("Valor inválido! Favor digitar F ou M");
                        sexo = sc.next();
                    }
                }
               

                if(sexo.equals("m")){
                    qtd_man = qtd_man + 1;
                }


            //Recebento altura

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


            //Recebendo peso
                
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

                    if(sexo.equals("f")){
                        qtd_woman = qtd_woman + 1;
                        total_alturas_woman = (total_alturas_woman + altura);
                        alt_media_woman =  total_alturas_woman / qtd_woman;
                }
       }


            if(qtd_woman > 0){
                    System.out.println();
                    System.out.println("RELATÓRIO: ");
                    System.out.println();
                    System.out.printf("Peso médio dos atletas: %.2f\n", pes_medio);
                    System.out.printf("Atleta mais alto: %s\n", atl_alto_mais);
                    System.out.printf("Porcentagem de homens: %.2f\n", porcent_man);
                    System.out.printf("Altura média das mulheres: %.2f\n", alt_media_woman);
            }

            else if(qtd_woman <= 0){
                System.out.println();
                System.out.println("RELATÓRIO: ");
                System.out.println();
                System.out.printf("Peso médio dos atletas: %.2f\n", pes_medio);
                System.out.printf("Atleta mais alto: %s\n", atl_alto_mais);
                System.out.printf("Porcentagem de homens: %.2f\n", porcent_man);
                System.out.printf("Não há mulheres cadastradas!");
            }

        sc.close(); 
}

}