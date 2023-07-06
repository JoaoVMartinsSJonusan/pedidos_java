package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;
import enums.PedidoStatus;

public class Pedido {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date momento;
    private PedidoStatus status;
    private Cliente cliente;

    private List<ItemDoPedido> itens = new ArrayList<>();

    public Pedido(Date momento, PedidoStatus status, Cliente cliente) {
        this.momento = momento;
        this.status = status;
        this.cliente = cliente;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public PedidoStatus getStatus() {
        return status;
    }

    public void setStatus(PedidoStatus status) {
        this.status = status;
    }

    public List<ItemDoPedido> getitens() {
        return itens;
    }

    public void addItem(ItemDoPedido itensPedido) {
        itens.add(itensPedido);
    }

    public void removeItem(ItemDoPedido itensPedido) {
        itens.remove(itensPedido);
    }
    
    public Double total() {
        Double total = 0.0;
        for (ItemDoPedido x : itens) {
            total += x.subTotal();
        }
        return total;
    }

    @Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Momento pedido: ");
		sb.append(sdf.format(momento) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(cliente + "\n");
		sb.append("Itens pedidos:\n");
		for (ItemDoPedido item : itens) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
}
