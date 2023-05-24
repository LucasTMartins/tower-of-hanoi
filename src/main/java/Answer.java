import java.util.Scanner;
import java.util.Stack;

public class Answer {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    Stack<Integer> s3 = new Stack<>();
    Integer rm_value;
    Integer rm_stack;
    
    //Roda o jogo em si
    public void menu(int stack_num) {
        switch (stack_num) {
            case 1:
                if (s1.size() >= 3) {
                    System.out.println("A pilha 1 está cheia!");
                    break;
                }
                rm_value = checkEmpty();
                putValue(stack_num, rm_value);
                break;
                
            case 2:
                if (s2.size() >= 3) {
                    System.out.println("A pilha 2 está cheia!");
                    break;
                }
                rm_value = checkEmpty();
                putValue(stack_num, rm_value);
                break;

            case 3:
                if (s3.size() >= 3) {
                    System.out.println("A pilha 3 está cheia!");
                    break;
                }
                rm_value = checkEmpty();
                putValue(stack_num, rm_value);
                break;

            default:
                break;
        }
    }
    
    public int checkEmpty() {
        Scanner sc = new Scanner(System.in);
        
        // Verificando o item a ser retirado da fila
        System.out.println("Digite a fila do qual será retirado:");
        rm_stack= sc.nextInt();
        if (rm_stack== 1 && s1.isEmpty() == false) {
            return s1.peek();
        } else if (rm_stack== 2 && s2.isEmpty() == false) {
            return s2.peek();
        } else if (rm_stack== 3 && s3.isEmpty() == false) {
            return s3.peek();
        }
        return 0;
    }
    
    public void putValue(int stack_num, int value) {
        boolean error_check = false;

        // Add o valor removido (rm_value) da pilha de remoção (rm_stack)
        switch (stack_num) {
            case 1:
                if (value >=1 && (s1.isEmpty() || s1.peek() > value)) {
                    s1.add(value);
                } else{
                    error_check = true;
                }
                break;
            case 2:
                if (value >=1 && (s2.isEmpty() || s2.peek() > value)) {
                    s2.add(value);
                }else{
                    error_check = true;
                }
                break;
            case 3:
                if (value >=1 && (s3.isEmpty() || s3.peek() > value)) {
                    s3.add(value);
                } else{
                    error_check = true;
                }
                break;

            default:
                break;
        }
        
        // Checando se não há nenhum erro para retirar o valor da pilha de remoção (rm_stack)
        if (error_check) {
            System.out.println("Erro encontrado, algo não se encaixa!");
        } else if(rm_stack == 1){
            s1.pop();
        } else if(rm_stack == 2){
            s2.pop();
        } else if(rm_stack == 3){
            s3.pop();
        }

        System.out.println("\nTorres: \nTorre 1: " + s1 + "\nTorre 2: " + s2 + "\nTorre 3: " + s3);
    }
}
