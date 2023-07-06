package Application;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.ItemDoPedido;
import entities.Pedido;
import entities.Produto;
import enums.PedidoStatus;
public class App {
    public static void main(String[] args) throws Exception {
 
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        

        System.out.println("Entre com os dados do cliente: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Data de nascimento DD/MM/YYYY: ");
        Date dataNasci = sdf.parse(sc.next());

        Cliente client = new Cliente(nome, email, dataNasci);

        System.out.print("Entre com o status do pedido: ");
        PedidoStatus status = PedidoStatus.valueOf(sc.next());

        Pedido pedido = new Pedido(new Date(), status, client);

        System.out.print("Quantos itens para o pedido? ");
        Integer pedi = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < pedi; i++) {
            System.out.println("Dados do #" + (i + 1) + " item:");
            System.out.print("Nome do produto: ");
            String nomeProduto = sc.nextLine();
            System.out.print("valor do produto: ");
            Double valorProduto = sc.nextDouble();

            Produto produto = new Produto(nomeProduto, valorProduto);

            System.out.print("Quantidade: ");
            int quantiProduto = sc.nextInt();
            sc.nextLine();
            ItemDoPedido itempedido = new ItemDoPedido(quantiProduto, valorProduto, produto);

            pedido.addItem(itempedido);
        }
        
        System.out.println();
        System.out.println("RESUMO DO PEDIDO");
        System.out.println(pedido);
        sc.close();
    }
}
