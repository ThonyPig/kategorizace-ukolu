
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UkolyArray array = new UkolyArray();
		UkolyList list = new UkolyList();
		UkolySet set = new UkolySet();
		
		Ukol ukolOne = new Ukol("Jdi se psem",Priorita.DULEZITE_NENALEHAVE);
		Ukol ukolTwo = new Ukol("Jdi nakoupit",Priorita.DULEZITE_NALEHAVE);
		Ukol ukolThree = new Ukol("Vykoupat se",Priorita.NEDULEZITE_NALEHAVE);
		Ukol ukolFour = new Ukol("Najist se",Priorita.DULEZITE_NENALEHAVE);
		Ukol ukolFive = new Ukol("Jit do prace",Priorita.DULEZITE_NALEHAVE);
		Ukol ukolSix = new Ukol("Vzit si svacinu",Priorita.NEDULEZITE_NENALEHAVE);
		Ukol ukolSeven = new Ukol("Koupit kytici",Priorita.DULEZITE_NENALEHAVE);
		Ukol ukolEight = new Ukol("Zkontrolovat prijem elektriny",Priorita.DULEZITE_NALEHAVE);
		Ukol ukolNine = new Ukol("Splnit ukol",Priorita.DULEZITE_NENALEHAVE);
		Ukol ukolTen = new Ukol("Programovat",Priorita.NEDULEZITE_NENALEHAVE);
		Ukol ukolEleven = new Ukol("Relaxovat",Priorita.NEDULEZITE_NENALEHAVE);
		Ukol ukolTwelve = new Ukol("Opravit sporak",Priorita.DULEZITE_NALEHAVE);
		
		array.pridatUkol(ukolOne);
		array.pridatUkol(ukolTwo);
		array.pridatUkol(ukolThree);
		array.pridatUkol(ukolFour);
		
		list.pridatUkol(ukolFive);
		list.pridatUkol(ukolSix);
		list.pridatUkol(ukolSeven);
		list.pridatUkol(ukolEight);
		
		set.pridatUkol(ukolNine);
		set.pridatUkol(ukolTen);
		set.pridatUkol(ukolEleven);
		set.pridatUkol(ukolTwelve);
		
		System.out.println("----------------");
		System.out.println("Ukoly v kolekcich:");
		System.out.println("----------------");
		
		array.printUkoly();
		list.printUkoly();
		set.printUkoly();
		
		System.out.println("----------------");
		System.out.println("Nalezene ukoly:");
		System.out.println("----------------");
		
		System.out.println(array.najdiUkol("KoUp"));
		System.out.println(list.najdiUkol("vZ"));
		System.out.println(set.najdiUkol("BlabLaBla"));
		}

}
