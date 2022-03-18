import javax.swing.JOptionPane;

public class ResultadoAluno {

	public static void main(String[] args) {

		double media = 8 ;
		
		if (media >= 6) {
			
			JOptionPane.showInternalMessageDialog(null, media + ": Aluno Aprovado!");
		}
		
		else {
			
			JOptionPane.showInternalMessageDialog(null, media + ": Aluno Reprovado!");
		}
		

	}

}
