package ProgramasDecisões;

import javax.swing.JOptionPane;

public class TotalEntradas {

	public static void main(String[] args) {
		
		double entradas, total_semana;
		int segunda, terca, quarta, quinta, sexta;
		double media;
		
		segunda = Integer.parseInt(JOptionPane.showInputDialog("Informe os valores recebidos na Segunda-Feira: "));
		terca = Integer.parseInt(JOptionPane.showInputDialog("Informe os valores recebidos na Terça-Feira: "));
		quarta = Integer.parseInt(JOptionPane.showInputDialog("Informe os valores recebidos na Quarta-Feira: "));
		quinta = Integer.parseInt(JOptionPane.showInputDialog("Informe os valores recebidos na Quinta-Feira: "));
		sexta = Integer.parseInt(JOptionPane.showInputDialog("Informe os valores recebidos na Sexta-Feira: "));

		total_semana = segunda+terca+quarta+quinta+sexta;
		media = Math.round(total_semana/5);
			
		
		JOptionPane.showMessageDialog(null, "O total de valores recebidos na semana foi de: "+total_semana);
		JOptionPane.showMessageDialog(null, "A média da semana foi de: "+media);
	}

}
