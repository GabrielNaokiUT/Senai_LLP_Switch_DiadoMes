import java.util.Scanner;

public class DiadoMes{
    public static void main(String args[]){
        Scanner leia = new Scanner(System.in);
        int mes, dias = 0;
        System.out.print("Digite o número correspondente ao mês desejado (Ex: Janeiro - 1, Fevereiro - 2, Março - 3...): ");
        mes = leia.nextInt();
        switch (mes){
            case 1: dias = 31;
                break;
            case 2: System.out.print("Digite o ano atual: ");
                    int ano = leia.nextInt();
                    if((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
                        dias = 29;
                    }
                    else{
                        dias = 28;
                    }
                break;
            case 3: dias = 31;
                break;
            case 4: dias = 30;
                break;
            case 5: dias = 31;
                break;
            case 6: dias = 30;
                break;
            case 7: dias = 31;
                break;
            case 8: dias = 31;
                break;
            case 9: dias = 30;
                break;
            case 10: dias = 31;
                break;
            case 11: dias = 30;
                break;
            case 12: dias = 31;
                break;
            default:
                System.out.println("Opção inválida.");
                return;  
        }
        System.out.println("O mês escolhido tem: " + dias + " dias.");
    }
}
