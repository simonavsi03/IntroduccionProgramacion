package metodosofunciones;

import javax.swing.JOptionPane;

public class arraysYmetodosQuiz {

	public static void main(String[] args) {
		int mayor = 0;
		int menor = 0;
		double raiz = 0;
		double potencia = 0;
		int opc = Integer.parseInt(JOptionPane.showInputDialog("este es un programa para distintas operaciones, escoge la que quieras: \n " + "1. ver el numero mayor que pusiste\n" + "2. ver numero menor que pusiste\n"+ "3.calcular raiz cuadrada\n" + "4. Elevecar a una potencia\n"));

		switch(opc) {
		case 1:
			if(opc==1) {
				vermayor(mayor);
			}
		case 2:
			if(opc==2) {
				vermenor(menor);
			}
		case 3:
			if(opc==3) {
				calcraiz(raiz);
			}
		case 4:
			if(opc==4) {
				calcpotencia(potencia);
			}
		case 5:
			if (opc>=4) {
				System.exit(opc);
			}
		}
		
	}
	
	public static void vermayor(int mayor) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("pon un numero"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("pon otro numero"));
		if (a>b) {
			JOptionPane.showMessageDialog(null, "el numero mayor es: "+ a);}
			else JOptionPane.showMessageDialog(null, "el numeor mayor es"+ b);
		}
	
	public static void vermenor(int menor) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("pon un numero"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("pon otro numero"));
		if (a>b) {
			JOptionPane.showMessageDialog(null, "el numero menor es: "+ b);}
			else JOptionPane.showMessageDialog(null, "el numeor menor es"+ a);
	}
	public static void calcraiz(double raiz) {
		double a = Integer.parseInt(JOptionPane.showInputDialog("pon un numero"));
		double ar = Math.sqrt(a);
		JOptionPane.showMessageDialog(null, "la raiz cuadradda del numero es " + ar);
		
	}
	
	public static void calcpotencia(double potencia) {
		double a = Integer.parseInt(JOptionPane.showInputDialog("pon un numero A"));
		double b = Integer.parseInt(JOptionPane.showInputDialog("pon un numero B"));
		double aB = Math.pow(a, b);
		JOptionPane.showMessageDialog(null, "A eleveado a B es: " + aB);
	
	}}
	
        
	
	

