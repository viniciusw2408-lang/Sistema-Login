package principal;

import javax.swing.JOptionPane;
import model.Triangulo;
public class Principal {
    public static void main(String[] args) {
        //declara a instancia do objeto
        Triangulo trill = new Triangulo();
        
        //entrada
        trill.setBase(Double.parseDouble(JOptionPane.
                showInputDialog("digite a base do triangulo")));
        trill.setAltura(Double.parseDouble(JOptionPane.
                showInputDialog("digite a altura do triangulo")));
        
        //saida
        JOptionPane.showMessageDialog(null,"a área do triângulo é " + trill.getArea());
  }
}