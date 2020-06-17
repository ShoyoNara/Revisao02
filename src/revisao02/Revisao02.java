
package revisao02;

import javax.swing.JOptionPane;

/**
 *
 * @author samuc
 */
public class Revisao02 {

    public static void main(String[] args) {
/*A granja Frangotech possui um controle automatizado de cada frango 
da sua produção. No pé direito do frango há um anel com um chip de identificação; 
no pé esquerdo são dois anéis para indicar o tipo de alimento que ele deve consumir.
Sabendo que o anel com chip custa R$4,00 e o anel de alimento custa R$3,50,
faça um algoritmo para calcular o gasto total da granja para marcar todos 
os seus frangos.  \ */ 

          double anelC , anelA, GastoTotal, PéD, PéE;
          int Nfrango;
          
          anelC = 4.00;
          anelA = 3.50;
          
          PéD = anelC;
          PéE = anelA * 2;
          
          Nfrango = Integer.parseInt(JOptionPane.showInputDialog("Insira o número de Frangos da produção: ") );
          
          GastoTotal = (PéD + PéE) * Nfrango;
          
          JOptionPane.showMessageDialog(null, "O total de frangos na produção é de: "+Nfrango+
                  "\n E o gasto total de granja será de: R$"+GastoTotal);


    }
    
}
