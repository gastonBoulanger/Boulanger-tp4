import java.util.Comparator;

public class ComparatorProduct implements Comparator<Product>{

	@Override
	public int compare(Product o, Product p) {
		if(o.getIndex() > p.getIndex()){
			return -1;
		}else if(o.getIndex() < (p.getIndex())){
			return 1;
		}else{
			return compareWeight(o,p);
		}
		
	}
	private int compareWeight(Product o, Product p){
		if (o.getWeight() < p.getWeight()){
			return -1;
		} else if ( o.getWeight() > p.getWeight()) {
			return 1;
		}else{
			return compareName(o,p);
		}
	}
	private int compareName(Product o, Product p){
		return o.getName().compareTo(p.getName());
	}
}
