import javax.swing.JOptionPane;

public class Divisao {

	public static void main(String[] args) {
		Integer numerador = Integer.parseInt(JOptionPane.showInputDialog("Numerador?"));
		Integer denominador = Integer.parseInt(JOptionPane.showInputDialog("Denominador?"));
		
		Integer divisao = numerador / denominador;
		System.out.println ("O resultado da divisão é " + divisao);

	}

}
