package controller;

import model.Fornecedor;
import model.Fornecimento;
import model.Produto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ProdutoFornecedorFornecimentoController {
    public static void main(String[] args) {

        //instânciando 2 objetos de produto
        Produto produto1 = new Produto("SKU12345", "Notebook Dell", "Notebook Dell Inspiron 15", 50, new BigDecimal("2000.00"), new BigDecimal("2500.00"));
        Produto produto2 = new Produto("SKU67890", "Smartphone Samsung", "Smartphone Samsung Galaxy S21", 100, new BigDecimal("3000.00"), new BigDecimal("3500.00"));

        //instânciando objeto fornecedor
        Fornecedor fornecedor = new Fornecedor(12345678000199L, "Fornecedor LTDA", "Fornecedor Fantasia", "contato@fornecedor.com", "(11) 91234-5678");

        //instânciando 2 objetos do fornecimento
        Fornecimento fornecimento1 = new Fornecimento(LocalDateTime.of(2024, 8, 6, 14, 30), 10, new BigDecimal("20000.00"), fornecedor, produto1);
        Fornecimento fornecimento2 = new Fornecimento(LocalDateTime.of(2024, 8, 7, 9, 15), 20, new BigDecimal("60000.00"), fornecedor, produto2);

        List<Fornecimento> fornecimentos = new ArrayList<>();
        fornecimentos.add(fornecimento1);
        fornecimentos.add(fornecimento2);

        //somando o total dos fornecimentos
        BigDecimal total = BigDecimal.ZERO;
        for (Fornecimento fornecimento : fornecimentos) {
            total = total.add(fornecimento.getTotal());
        }

        //imprimindo os fornecimentos
        System.out.println("\n\nRelatório de fornecimentos:" + fornecimentos + "\n- Valor Total dos fornecimentos: " + total);

    }
}
