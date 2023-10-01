package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item i = new Item("laptop",50,0,0);
		
		i.imprimir();
		
		i.vender(5);
		i.imprimir();
		i.devolver(2);
		i.imprimir();
		
	}

}
