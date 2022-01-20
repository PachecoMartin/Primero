package Menu;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class menu {
	public static void main(String args[]) throws Exception {
		int op, opcion, op1;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog("1.-DECIMAL\n2.-OCTAL\n3.-HEXADECIMAL \n4.-BINARIO"));
			switch (op) {
			case 1:
				do {
					op1 = Integer.parseInt(
							JOptionPane.showInputDialog("Convertir a:\n1.-OCTAL\n 2.-HEXADECIMAL\n 3.-BINARIO"));
					switch (op1) {
					case 1:
						// decimal a octal
						
						
						Scanner leer = new Scanner(System.in);
						System.out.println("Ingrese el decimal: ");
						int cifra = leer.nextInt();
						System.out.print("El equivalente en octal es ");
						decimaloctal(cifra);
						break;
					case 2:
						// decimal a hexadecimal
						Scanner leer1 = new Scanner(System.in);
						System.out.println("\nIngrese el decimal: ");
						int cifra1 = leer1.nextInt();
						System.out.print("El equivalente en hexadecimal es ");
						decimalhexadecimal(cifra1);
						break;
					case 3:
						// decimal a binario
						Scanner leer2 = new Scanner(System.in);
						System.out.println("\nIngrese el decimal: ");
						int cifra2 = leer2.nextInt();
						System.out.print("El equivalente en binario es ");
						decimalbinario(cifra2);
						break;
					default:
						JOptionPane.showInputDialog(null, "\nIngresa una opcion correcta");
					}
					opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione 1.-Regresar \n2.- Salir"));
				} while (opcion == 1);
				break;
			case 2:
				do {
					op1 = Integer.parseInt(
							JOptionPane.showInputDialog("Convertir a:\n 1.-DECIMAL\n2.-HEXADECIMAL\n3.-BINARIO"));
					switch (op1) {
					case 1:
						// octal a decimal
						Scanner sc = new Scanner(System.in);
						System.out.println("\nIngrese el octal:");
						String octal = sc.nextLine();
						long decimal = octaldecimal(octal);
						System.out.printf("El equivalente en decimal es" + decimal);
						break;
					case 2:
						// octal a hexadecimal
						int oct, dec = 0, i = 0, t;
						Scanner sc1 = new Scanner(System.in);
						System.out.println("\nIngresa el octal: ");
						oct = sc1.nextInt();
						while (oct != 0) {
							dec = dec + (oct % 10) * (int) Math.pow(8, i);
							i++;
							oct = oct / 10;
						}
						String hex = octalhexadecimal(dec);
						System.out.println("El equivalente en hexadecimal es :" + hex);
						break;
					case 3:
						// octal a binario
						Scanner sc2 = new Scanner(System.in);
						System.out.println("\nIngrese el octal:");
						String octal1 = sc2.nextLine();
						long decimal1 = octaldecimal(octal1);
						System.out.print("El equivalente en binario es ");
						decimalbinario(+decimal1);
						break;
					default:
						JOptionPane.showInputDialog(null, "Ingresa una opcion correcta");
					}
					opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione 1.- Regresar \n2.- Salir"));
				} while (opcion == 1);
				break;
			case 3:
				do {
					op1 = Integer.parseInt(
							JOptionPane.showInputDialog("Convertir a:\n1.-OCTAL\n2.-DECIMAL \n3.-BINARIO"));
					switch (op1) {
					case 1:
						// hexadecimal a octal
						String hexdec_num;
						int dec_num, i = 1, j;
						int octal_num[] = new int[100];
						Scanner in = new Scanner(System.in);
						System.out.print("\nIngresa el hexadecimal: ");
						hexdec_num = in.nextLine();
						dec_num = hexadecimaldecimal(hexdec_num);
						while (dec_num != 0) {
							octal_num[i++] = dec_num % 8;
							dec_num = dec_num / 8;
						}
						System.out.print("El equivalente en octal es : ");
						for (j = i - 1; j > 0; j--) {
							System.out.print(octal_num[j]);
						}
						System.out.print("\n");
						break;
					case 2:
						// hexadecimal a decimal
						String hexdec_num1;
						int dec_num1, i1 = 1, j1;
						Scanner in1 = new Scanner(System.in);
						System.out.print("\nIngresa el hexadecimal: ");
						hexdec_num1 = in1.nextLine();
						dec_num1 = hexadecimaldecimal(hexdec_num1);
						System.out.print("El equivalente en decimal es : " + dec_num1);
					case 3:
						// hexadecimal a binario
						String hexdec_num2;
						int dec_num2, i2 = 1, j2;
						Scanner in2 = new Scanner(System.in);
						System.out.print("\nIngresa el hexadecimal: ");
						hexdec_num2 = in2.nextLine();
						dec_num2 = hexadecimaldecimal(hexdec_num2);
						System.out.print("El equivalente en binario es ");
						decimalbinario(dec_num2);
						break;
					default:
						JOptionPane.showInputDialog(null, "Ingresa una opcion correcta");
					}
					opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione 1.- Regresar \n2.- Salir"));
				} while (opcion == 1);
				break;
			case 4:
				do {
					op1 = Integer.parseInt(
							JOptionPane.showInputDialog("Convertir a: \n1.-OCTAL \n2.-HEXADECIMAL \n3.-DECIMAL"));
					switch (op1) {
					case 1:
						// binario a octal
						long binario2;
						Scanner sc2 = new Scanner(System.in);
						System.out.print("\nIngresa el binario: ");
						binario2 = sc2.nextLong();
						long decimal2 = binariodecimal(binario2);
						System.out.print("El equivalente en octal es ");
						decimaloctal(decimal2);
						break;
					case 2:
						// binario a hexadecimal
						long binario1;
						Scanner sc = new Scanner(System.in);
						System.out.print("\nIngresa el binario: ");
						binario1 = sc.nextLong();
						long decimal1 = binariodecimal(binario1);
						System.out.print("El equivalente en hexadecimal es ");
						decimalhexadecimal(decimal1);
						break;
					case 3:
						// binario a decimal
						long binario;
						Scanner sc4 = new Scanner(System.in);
						System.out.print("\nIngresa el binario: ");
						binario = sc4.nextLong();
						long decimal = binariodecimal(binario);
						System.out.printf("El equivalente en decimal es " + decimal);
						break;
					default:
						JOptionPane.showInputDialog(null, "Ingresa una opcion correcta");
					}
					opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione 1.- Regresar \n2.- Salir"));
				} while (opcion == 1);
				break;
			default:
				JOptionPane.showInputDialog(null, "Ingresa una opcion correcta");
			}
			opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione 1.- Regresar \n2.- Salir"));

		} while (opcion == 1);
	}

	public static long octaldecimal(String octal) {
		long decimal = 0;
		int potencia = 0;
		for (int x = octal.length() - 1; x >= 0; x--) {
			int valorActual = Character.getNumericValue(octal.charAt(x));
			long elevado = (long) Math.pow(8, potencia) * valorActual;
			decimal += elevado;
			potencia++;
		}
		return decimal;
	}

	public static void decimalbinario(long N) {
		if (N == 1)
			System.out.print("1");
		else {
			decimalbinario(N / 2);
			System.out.print(N % 2);
		}
	}

	public static void decimaloctal(long N) {
		if (N < 8)
			System.out.print(N);
		else {
			decimaloctal(N / 8);
			System.out.print(N % 8);
		}
	}

	public static void decimalhexadecimal(long N) {
		if (N < 16) {
			if (N == 10)
				System.out.print("A");
			if (N == 11)
				System.out.print("B");
			if (N == 12)
				System.out.print("C");
			if (N == 13)
				System.out.print("D");
			if (N == 14)
				System.out.print("E");
			if (N == 15)
				System.out.print("F");
			if (N < 10)
				System.out.print(N);
		} else {
			decimalhexadecimal(N / 16);
			System.out.print(N % 16);
		}
	}

	public static String octalhexadecimal(int q) {
		char a[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		int rem;
		String hexdec = "";
		while (q != 0) {
			rem = q % 16;
			hexdec = a[rem] + hexdec;
			q = q / 16;
		}
		return hexdec;
	}

	public static int hexadecimaldecimal(String s) {
		String digits = "0123456789ABCDEF";
		s = s.toUpperCase();
		int val = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int d = digits.indexOf(c);
			val = 16 * val + d;
		}
		return val;
	}

	public static long binariodecimal(long binario) {
		long aux, digito, decimal;
		int exponente;
		exponente = 0;
		decimal = 0;
		while (binario != 0) {
			digito = binario % 10;
			decimal = decimal + digito * (int) Math.pow(2, exponente);
			exponente++;
			binario = binario / 10;
		}
		return decimal;
	}
}