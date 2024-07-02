public class Produto {
    private String nome;
    private double preco;
    private int qtdEstoque;

    public Produto(String nome, double preco, int estoque){
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = estoque;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque){
        this.qtdEstoque = qtdEstoque;
    }

    public void adicionarEstoque(int quantidade){
        if(quantidade > 0){
            this.qtdEstoque += quantidade;
        }else {
            System.out.println("Quantidade inválida para adicionar ao estoque");
        }
    }

    public void removerEstoque(int quantidade){
        if(quantidade > 0 && quantidade < this.qtdEstoque){
            this.qtdEstoque -= quantidade;
        }else {
            System.out.println("Quantidade inválida para remover em estoque");
        }
    }

    public void exibirIformacao(){
        System.out.println("Nome do produto: " +nome);
        System.out.println("Preço do produto: " +preco);
        System.out.println("Quantidade de produto: " +qtdEstoque);
    }

    public static void main(String[] args){
        Produto produto = new Produto("PC Gamer", 4500.00, 4);
        produto.exibirIformacao();

        System.out.println("\nAdicionando 5 itens ao estoque...");
        produto.adicionarEstoque(5);
        produto.exibirIformacao();

        System.out.println("\nRemovendo 2 itens ao estoque...");
        produto.removerEstoque(4);
        produto.exibirIformacao();
    }
}

