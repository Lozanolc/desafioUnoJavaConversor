package desafioUnoJavaConversor;

import javax.swing.*;

public class principal {
	public static void main(String[] args) {
	       String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opcion ", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de Moneda", "Conversonr de temperatura"},"Seleccion")).toString();
		}
}
