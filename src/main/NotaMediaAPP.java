package main;

import java.util.Hashtable;

import javax.swing.JOptionPane;

public class NotaMediaAPP {

	public static void main(String[] args) {

		//DECLARAMOS LAS VARIALES
		double notaMedia;
		String nombre = JOptionPane.showInputDialog("Introduce el nombre del alumno:");
		
		double listaNotas[] = new double[5];
		
		for (int i = 0; i < listaNotas.length; i++) {
			String nota = JOptionPane.showInputDialog("Introduce una nota:");
			listaNotas[i] = Double.parseDouble(nota);
		}
		
		notaMedia = (listaNotas[0] + listaNotas[1] + listaNotas [2] + listaNotas[3] + listaNotas[4]) / 5;
		
		Hashtable<String,Double> ficheroNotas = new Hashtable<String,Double>();
		ficheroNotas.put(nombre, notaMedia);
		
		System.out.println("La nota media de "+nombre+" es "+notaMedia);

	}

}
