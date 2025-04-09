// Criei uma classe interna Produto com atributos para nome, preço e percentual de desconto 
public class Loja {
    static class Produto {
        String nome;
        double preco;
        double percentualDesconto;

        Produto(String nome, double preco, double percentualDesconto) {
            this.nome = nome;
            this.preco = preco;
            this.percentualDesconto = percentualDesconto;
        }

        // Adicionei um método calcularPrecoFinal() que encapsula a lógica de cálculo do desconto
        double calcularPrecoFinal() {
            double desconto = preco * percentualDesconto;
            return preco - desconto;
        }

        // Criei um método exibirPrecoFinal() que reutiliza o cálculo e formata a saída 
        void exibirPrecoFinal() {
            System.out.println(nome + " - Preço final: R$ " + calcularPrecoFinal());
        }
    }

    // Usei um array de produtos e um loop para processar todos os itens, eliminando a repetição de código. 
    public static void main(String[] args) {
        Produto[] produtos = {
            new Produto("Celular", 2000.0, 0.10),  // 10% de desconto
            new Produto("Notebook", 4500.0, 0.15), // 15% de desconto
            new Produto("Tablet", 1500.0, 0.05)    // 5% de desconto
        };

        for (Produto produto : produtos) {
            produto.exibirPrecoFinal();
        }
    }
}

// A lógica de desconto e exibição agora é aplicada através de métodos reutilizáveis (DRY). 
