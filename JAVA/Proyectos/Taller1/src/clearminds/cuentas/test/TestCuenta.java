package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//cuenta1
		Cuenta cuenta1 = new Cuenta("03476");	
		//saldo en cuenta1
		cuenta1.setSaldo(675);
		
		//cuenta2
		Cuenta cuenta2 = new Cuenta("03476","C",98);
		
		//Cuenta 3
		Cuenta cuenta3 = new Cuenta("03476");
		//tipo de cuenta
		cuenta3.setTipo("C");
		
		//imprimir cuentas
		System.out.println("----Valores iniciales");
		cuenta1.imprimirCuenta();
		cuenta2.imprimirCuenta();
		cuenta3.imprimirCuenta();
		
		cuenta1.setSaldo(444);
		cuenta3.setSaldo(567);
		cuenta2.setTipo("D");
		
		System.out.println("----Valores modificados");
		cuenta1.imprimirCuenta();
		cuenta2.imprimirCuenta();
		cuenta3.imprimirCuenta();
		
		//Cuenta4
		Cuenta cuenta4 = new Cuenta("0987");
		cuenta4.setTipo("A");
		cuenta4.setSaldo(10);
		
		Cuenta cuenta5 = new Cuenta("0557","K",0);
		cuenta5.setSaldo(10);
		cuenta5.setTipo("C");
		
		Cuenta cuenta6 = new Cuenta("0666","A",0);
		
		//imprimir datos
		System.out.println("--Imprimir con mi estilo--");
		cuenta4.imprimirConMiEstilo();
		cuenta5.imprimirConMiEstilo();
		cuenta6.imprimirConMiEstilo();
		
		
	}

}
