import java.util.Collection;
import java.util.HashSet;
import java.lang.StringBuilder;

public class UkolySet implements Ukoly {
	HashSet<Ukol> hSet = new HashSet<Ukol>();

	@Override
	public void pridatUkol(Ukol ukol) {
		// TODO Auto-generated method stub
		hSet.add(ukol);
	}
	
	public void printUkoly() {
		for(Ukol ukol : hSet)
			System.out.println(ukol);
	}

	@Override
	public Collection najdiUkol(String nazev) {
		StringBuilder builder = new StringBuilder();
		HashSet<Ukol> returnUkoly = new HashSet<Ukol>();
		for(Ukol ukol : hSet) {
			builder.append(ukol.getUkolString().toLowerCase());
			if(builder.indexOf(nazev.toLowerCase()) != -1) {
				returnUkoly.add(ukol);
			}
			builder.delete(0, builder.length()-1);
		}
		return returnUkoly;
	}

}
