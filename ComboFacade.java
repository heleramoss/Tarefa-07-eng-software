package org.yourcompany.yourproject;

public class ComboFacade {
    private Combo combo;

    
    public void criarCombo(int codigo) {
        switch (codigo) {
            case 1:
                combo = new Combo(
                    new Burger("Big Cheddar", 18.00),
                    new Bebida("Coca‑Cola", 8.00),
                    new Sobremesa("Sundae", 9.90)
                );
                break;
            case 2:
                combo = new Combo(
                    new Burger("Mega Bacon", 16.00),
                    new Bebida("Guaraná", 7.50),
                    new Sobremesa("Torta de Maçã", 9.00)
                );
                break;
            case 3:
                combo = new Combo(
                    new Burger("Mini Burger", 12.00),
                    new Bebida("Suco Laranja", 6.00),
                    new Sobremesa("Sorvete", 4.90)
                );
                break;
            default:
                System.out.println("Código de combo inválido!");
                combo = null;
                break;
        }
    }

  
    public void exibirItens() {
        if (combo == null) {
            System.out.println("Nenhum combo criado ainda!");
            return;
        }
        System.out.println("\n=== Detalhes do Pedido ===");
        System.out.printf("Burger     : %s – R$ %.2f%n",
                combo.getBurger().getNome(), combo.getBurger().getPreco());
        System.out.printf("Bebida     : %s – R$ %.2f%n",
                combo.getBebida().getNome(), combo.getBebida().getPreco());
        System.out.printf("Sobremesa  : %s – R$ %.2f%n",
                combo.getSobremesa().getNome(), combo.getSobremesa().getPreco());
        System.out.println("==========================");
    }

   
    public double getPrecoTotal() {
        if (combo == null) {
            return 0.0;
        }
        return combo.getPrecoTotal();
    }
}
