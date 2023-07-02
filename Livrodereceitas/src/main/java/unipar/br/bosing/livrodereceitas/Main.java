/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unipar.br.bosing.livrodereceitas;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;



// Diogo Massayuki Kumizaki RA: 00238909


public class Main {
    public static void main(String[] args) {
        
         
        LivroDeReceitas livro = new LivroDeReceitas("Bolo de Chocolate", "3 xícaras de farinha de trigo\n2 xícaras de açúcar\n1 xícara de chocolate em pó\n1 xícara de leite\n1/2 xícara de óleo\n2 ovos\n1 colher de sopa de fermento em pó", "1. Em uma tigela, misture a farinha de trigo, o açúcar e o chocolate em pó.\n2. Adicione o leite, o óleo e os ovos. Misture bem.\n3. Por último, adicione o fermento em pó e misture novamente.\n4. Despeje a massa em uma forma untada e leve ao forno preaquecido a 180°C por aproximadamente 40 minutos.");
        
        LivroDeReceitas livro2 = new LivroDeReceitas("Pão de Queijo", "500g de polvilho doce\n250ml de leite\n100ml de óleo\n2 ovos\n200g de queijo ralado\nSal a gosto", "1. Em uma panela, aqueça o leite e o óleo até ferver.\n2. Despeje o líquido quente sobre o polvilho doce e misture bem.\n3. Adicione os ovos, o queijo ralado e o sal. Misture até obter uma massa homogênea.\n4. Modele bolinhas e coloque em uma assadeira untada.\n5. Leve ao forno preaquecido a 180°C por aproximadamente 30 minutos.");
        
        LivroDeReceitas livro3 = new LivroDeReceitas("Lasanha de Frango", "500g de massa para lasanha\n500g de peito de frango cozido e desfiado\n1 cebola picada\n2 dentes de alho picados\n2 latas de molho de tomate\n300g de queijo mussarela fatiado\n300g de presunto fatiado\nSal e temperos a gosto", "1. Em uma panela, refogue a cebola e o alho em um pouco de óleo.\n2. Adicione o frango desfiado e tempere com sal e temperos a gosto.\n3. Acrescente o molho de tomate e deixe cozinhar por alguns minutos.\n4. Em um refratário, monte camadas alternadas de massa para lasanha, molho de frango, presunto, presunto e queijo mussarela.\n5. Repita as camadas até finalizar os ingredientes.\n6. Leve ao forno preaquecido a 180°C por aproximadamente 40 minutos ou até a lasanha estar bem cozida e gratinada.");
        
        LivroDeReceitas livro4 = new LivroDeReceitas("Salada Caesar", "1 alface americana lavada e picada\n1 xícara de croutons\n100g de queijo parmesão ralado\n2 colheres de sopa de maionese\n1 dente de alho picado\n1 colher de sopa de mostarda\nSuco de meio limão\nAzeite a gosto\nSal e pimenta-do-reino a gosto", "1. Em uma tigela, prepare o molho misturando a maionese, o alho picado, a mostarda, o suco de limão, o azeite, o sal e a pimenta-do-reino.\n2. Em uma saladeira, disponha as folhas de alface.\n3. Regue a salada com o molho e misture bem.\n4. Acrescente os croutons e o queijo parmesão ralado. Misture novamente e sirva.");
        
        LivroDeReceitas livro5 = new LivroDeReceitas("Arroz de Carreteiro", "2 xícaras de arroz\n500g de carne de charque dessalgada e cortada em cubos\n1 cebola picada\n2 dentes de alho picados\n2 tomates picados\n2 colheres de sopa de óleo\nSal e temperos a gosto", "1. Em uma panela de pressão, aqueça o óleo e refogue a cebola e o alho.\n2. Adicione a carne de charque e deixe dourar.\n3. Acrescente os tomates picados e refogue por mais alguns minutos.\n4. Adicione o arroz e tempere com sal e temperos a gosto.\n5. Cubra com água, feche a panela de pressão e cozinhe por aproximadamente 15 minutos.\n6. Desligue o fogo, aguarde a pressão sair naturalmente e sirva.");
        
        livro.exibirReceita();
        livro2.exibirReceita();
        livro3.exibirReceita();
        livro4.exibirReceita();
        livro5.exibirReceita();
        
         String opcaoStr = JOptionPane.showInputDialog("Digite '1' para alterar uma receita, '2' para excluir uma receita ou qualquer outra tecla para criar uma nova receita:");
        int opcao = Integer.parseInt(opcaoStr);
        
        if (opcao == 1) {
            
            String novoTitulo = JOptionPane.showInputDialog("Digite o novo título da receita:");
            livro.setReceita(novoTitulo);
            
            String novosIngredientes = JOptionPane.showInputDialog("Digite os novos ingredientes da receita:");
            livro.setIngredientes(novosIngredientes);
            
            String novoModoPreparo = JOptionPane.showInputDialog("Digite o novo modo de preparo da receita:");
            livro.setModoPreparo(novoModoPreparo);
            
            livro.exibirReceita();
        } else if (opcao == 2) {
        
            livro = null;
            System.out.println("Receita excluída.");
        } else {
          
            String novoTitulo = JOptionPane.showInputDialog("Digite o título da nova receita:");
            String novosIngredientes = JOptionPane.showInputDialog("Digite os ingredientes da nova receita:");
            String novoModoPreparo = JOptionPane.showInputDialog("Digite o modo de preparo da nova receita:");
            
            LivroDeReceitas novaReceita = new LivroDeReceitas(novoTitulo, novosIngredientes, novoModoPreparo);
            novaReceita.exibirReceita();
            
            
        }
    }
}
        
   
