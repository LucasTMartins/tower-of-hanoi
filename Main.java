import java.util.Scanner;
public class Main {

    
    public static void main(String[] args){
        Answer num = new Answer();
        num.s1.push(3);
        num.s1.push(2);
        num.s1.push(1);

        Scanner sc = new Scanner(System.in);
        System.out.println("\nMova a pilha um para a pilha dois, uma peça de cada vez! Nunca com uma peça maior em cima da menor!");
        System.out.println("\nTorres: \nTorre 1: " + num.s1 + "\nTorre 2: " + num.s2 + "\nTorre 3: " + num.s3);
        while (true) {
            if (num.s2.search(3) == 3 && num.s2.search(2) == 2 && num.s2.search(1) == 1) {
                System.out.println("\nParabéns, você conseguiu!");
                break;
            }
            else {
                System.out.println("\nDigite a pilha que deseja adicionar um valor:");
                num.menu(sc.nextInt());
            }
        }

    }
}
