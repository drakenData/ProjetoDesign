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

        double calcularPrecoFinal() {
            double desconto = preco * percentualDesconto;
            return preco - desconto;
        }

        void exibirPrecoFinal() {
            System.out.println(nome + " - Preço final: R$ " + calcularPrecoFinal());
        }
    }

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