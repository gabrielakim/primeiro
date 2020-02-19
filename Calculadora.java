import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[] args) {
  
        String firstNumber =
                JOptionPane.showInputDialog ( " entre com um valor " );
        
        String secondNumber =
                JOptionPane.showInputDialog ( " entre com um valor " );
        
        int numero1 =  Integer.parseInt (firstNumber);
        int numero2 =  Integer.parseInt (secondNumber);
        
        String op =
                JOptionPane.showInputDialog ( " escolha entre : soma, subtração, multiplicação e divisão" );
        
        if (op.equals("soma")){
         int res = numero1 + numero2;
         JOptionPane.showMessageDialog(null, " o resultado é "  + res);
            }else{
                    if(op.equals("subtracao")){
                       int res = numero1 - numero2;
                        JOptionPane.showMessageDialog ( null , " o resultado é "  + res);
                       }else{
                        if(op.equals("multiplicacao")){
                           int res = numero1 * numero2;
                           JOptionPane.showMessageDialog ( null , " o resultado é "  + res);
                         }else{
                            if(op.equals("divisao")){
                              int res = numero1 / numero2;
                              JOptionPane.showMessageDialog ( null , " o resultado é "  + res);
                            }
                        }
                    }   
                }
           }
}
