package br.edu.univas.si3.lab3.order;

import java.util.ArrayList;

public class Order {

	ArrayList<Item> items = new ArrayList<Item>();
	
	void addItem(Item newItem) {
		items.add(newItem);
	}
	
	float calculateTotalValue() {//exerc�cio: implementar o teste para este m�todo
		float total = 0f;
		
		for(int i = 0; i < items.size(); i++) {
			Item it = items.get(i); //elemento da vez (no loop)
			total += it.totalValue();
		}
		return total;
	}
}
