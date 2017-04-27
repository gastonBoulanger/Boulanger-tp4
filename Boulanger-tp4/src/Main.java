import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Se crea una bolsa con capacidad determinada
		Bag m = new Bag(120);
		
		//Se crea una lista de productos disponibles
		ArrayList<Product> productsList = new ArrayList<Product>();
		Product p1 = new Product("Coffe", 5, 100, 4);
		Product p2 = new Product("Juice", 5, 10, 10);
		Product p3 = new Product("Sugar", 15, 50, 6);
		Product p4 = new Product("Beer", 20, 1000, 1);
		Product p5 = new Product("Fish", 30, 500, 2);
		Product p6 = new Product("Bread", 5, 200, 3);
		Product p7 = new Product("Milk", 2, 20, 2);
		
		productsList.add(p1);
		productsList.add(p2);
		productsList.add(p3);
		productsList.add(p4);
		productsList.add(p5);
		productsList.add(p6);
		productsList.add(p7);
		
		//Se rellena la bolsa y se imprime
		System.out.println("Capacidad inicial: " + m.getCapacity());
		System.out.println(m.selectorProducts(productsList).toString());
		System.out.println("Capacidad final: " + m.getCapacity());
	}

}
