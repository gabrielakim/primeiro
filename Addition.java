package addition;
import javax.swing.JOptionPane;
public class Addition {
    public static void main(String[] args) {
        String firstNumber =
                JOptionPane.showInputDialog("entro com um valor");
        String secondNumber =
                JOptionPane.showInputDialog("entro com um valor");
        int number1 = Integer.parseInt( firstNumber );
        int number2 = Integer.parseInt( secondNumber );
        
        int sum = number1 + number2;
        
        JOptionPane.showMessageDialog(null," a soma é " + sum);
   }
    
}
