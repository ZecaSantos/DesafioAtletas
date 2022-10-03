import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

       int N, id, qtd_man, qtd_woman, total_alturas_woman;
       String nome, atl_alto_mais;
       char sexo;
       double altura, peso, pes_medio, peso_total, porcent_man, alt_media_woman, 
       nova_altura, cadastro;

       alt_media_woman = 1;

       System.out.println("Qual é a quantidade de atletas? ");
       N = sc.nextInt();

       for(int i = 1; i < N; i++){
            System.out.printf("Digite os dados do atleta numero", i);
            System.out.println("Nome: ");
            nome = sc.next();

            System.out.println();
            System.out.println("Sexo (F / M):");
            sexo = sc.next().charAt(0);

               do{
                    
               }



    sc.close(); 
    }
}
