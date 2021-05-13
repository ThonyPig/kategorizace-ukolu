import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.lang.StringBuilder;

public class UkolyList implements Ukoly {
	LinkedList<Ukol> list = new LinkedList<Ukol>();

	@Override
	public void pridatUkol(Ukol ukol) {
		list.add(ukol);
	}
	
	public void printUkoly() {
		for(Ukol ukol : list)
			System.out.println(ukol);
	}

	@Override
	public Collection najdiUkol(String nazev) {
		StringBuilder builder = new StringBuilder();
		LinkedList<Ukol> returnUkoly = new LinkedList<Ukol>();
		for(Ukol ukol : list) {
			builder.append(ukol.getUkolString().toLowerCase());
			if(builder.indexOf(nazev.toLowerCase()) != -1) {
				returnUkoly.add(ukol);
			}
			builder.delete(0, builder.length()-1);
		}
		return returnUkoly;
	}

}
