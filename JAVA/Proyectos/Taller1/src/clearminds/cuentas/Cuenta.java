package clearminds.cuentas;

public class Cuenta {
	private String id;
	private String tipo;
	private float saldo;
	
	
	
	public Cuenta(String id) {
		this.id = id;
		this.tipo = "A";
		this.saldo = 0.00f;
	}
	
	

	public Cuenta(String id, String tipo, float saldo) {
		this.id = id;
		this.tipo = tipo;
		this.saldo = saldo;
	}



	public String getId() {
		return id;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public void imprimirCuenta(){
		System.out.printf("%s%n%s%n%s%n","********","CUENTA","********");
		System.out.printf("%s%s%n%s%s%n%s%.2f%n","Número de cuenta: ",id,"Tipo: ",tipo,"Saldo: ",saldo);
		System.out.println("*************");
		
	}
	
	public void imprimirConMiEstilo(){
		System.out.println("********Cuenta********");
		System.out.printf("%s%s%n%s%s%n%s%.2f%n","Número de cuenta: ",id,"Tipo: ",tipo,"Saldo: ",saldo);		
	}
	
	

	
}
