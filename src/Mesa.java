
import java.time.Instant;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 * @author btd
 */
public class Mesa {
    private static int totalMesas = 0;
    private int numIDMesa;    //numero de identificação da mesa
    private ArrayList<Pedido> pedido;   //itens pedidos
    private double totalPagar;
    private boolean ocupacaoMesa; //informa se mesa está ocupada
    private Instant horarioEntrada; //horário de início do pedido
    private Instant horarioSaida;   //horario de fechamento do pedido

    public Mesa() {
        totalMesas++;   //atualiza o número de mesas
        this.numIDMesa = totalMesas;
        pedido = new ArrayList<>();
        this.totalPagar = 0;
        ocupacaoMesa = false; 
    }

    public int getNumIDMesa() {
        return numIDMesa;
    }   
    

    public void acrescentarPedido(Pedido produto) {
        pedido.add(produto);
        //defaultListModel.addElement(produto); 
        
    }

    public void cancelarPedido(Pedido produto, int qtde) {
        if(pedido.contains(produto)){
            int index = pedido.indexOf(produto);
            pedido.get(index).removeItem(qtde);
        }
        else{
            JOptionPane.showMessageDialog(null, 
                    "Não foi encontrado pedido para esse ítem!", 
                    "Cancelamento de Pedido", JOptionPane.ERROR_MESSAGE);
        }
            
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }
    
    
    public void abrirMesa(){
        horarioEntrada= Instant.now();
        ocupacaoMesa = true;
    }
    
    public String fecharMesa(){
        horarioSaida = Instant.now();
        ocupacaoMesa = false;
        String relatorioPedido; //descrição do pedido
        
        
        //Salva uma string contendo a descrição do pedido
        relatorioPedido = 
                "Mesa " + numIDMesa + "/n" + 
                "Horário de Entrada: " + horarioEntrada + "/n" +
                "Horário de Saida: " + horarioSaida + "/n" +
                "Itens Pedidos: ";
        
        for (Pedido iteratorPedido : pedido) {
            relatorioPedido += iteratorPedido.getProduto().getNome() + "\t";
            
            relatorioPedido += "Preço: " + iteratorPedido.getProduto().getValor()
                    + "\n";
            
            relatorioPedido += "Qtde: " + iteratorPedido.getQtdeDoProduto() + 
                    "\tValor dos Itens: R$ " + 
                    iteratorPedido.getValorDoPedido() + "\n\n";
            
            totalPagar += iteratorPedido.getValorDoPedido();
        }
        
        relatorioPedido += "Total a Pagar: R$ " + totalPagar + "\n";
                
        //Limpa o vetor de pedidos
        pedido.clear();
                
        return relatorioPedido;
    }

    /*
    public DefaultListModel getDefaultListModel() {
        return defaultListModel;
    } */   
    

    @Override
    public String toString() {
        return "Mesa " + numIDMesa;
    }
    
    
}
