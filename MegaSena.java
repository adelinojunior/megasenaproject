/* 
   Criação de Adelino Junior.
   18 de Setembro de 2003.
   Exibir 6 números aleatórios distintos de 1 a 60 para jogar na MegaSena.
*/   
import java.util.Random;
import javax.swing.JOptionPane;

public class MegaSena {
	public static void main (String args[]) {
		int     num_escolhido[] = new int[6];
		Random  r = new Random();
        boolean num_valido = true;
        // aux = variável que usaremos para guardar o maior valor de cada comparação
        int aux = 0;

		// Sorteando os números
		for (int i=0; i<6; i++ ) {
			num_escolhido[i] = Math.abs(r.nextInt()) % 61;
           	if (i >= 0) {
				for (int j=0; j<i; j++) {
					if (num_escolhido[i] == num_escolhido[j]) {
 					   num_valido = false;
 					   break;
				   }
				}
			}
			if  ((num_valido == false) | (num_escolhido[i] == 0)){
			    i--;
			    num_valido = true;
			}
 	    }
		  
        /* 
	   Deixando os seis números escolhidos em ordem crescente dentro do vetor primeiro for = esse for fará com que o a variável i percorra o vetor a ser ordenado,
           mas ela vai anda uma casa enquanto a variável j percorre o vetor todo, ou seja, i percorrerá apenas o tamanho do vetor ja j percorrerá o tamanho do vetor 
	   vezes o tamanho do vetor
	*/
        for (int i = 0; i < num_escolhido.length; i++) {
            for (int j = 0; j < num_escolhido.length; j++) {
                if (num_escolhido[i] < num_escolhido[j]) {
                   //aqui acontece a troca, o Valor maior vai para a direita e o menor para a esquerda
                   aux = num_escolhido[i];
                   num_escolhido[i] = num_escolhido[j];
                   num_escolhido[j] = aux;
                }
            }
        }
	  
        JOptionPane.showMessageDialog (null, "As Dezenas Escolhidas Foram: "+num_escolhido[0]+","
                                             +num_escolhido[1]+","+num_escolhido[2]+","+num_escolhido[3]+
                                             ","+num_escolhido[4]+","+num_escolhido[5]+"\n\n Created by Adelino Junior",
                                             "Dezenas Para Jogar Na MEGASENA",JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
	}
}
