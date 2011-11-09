package hr.infomare.drrh.pomocni;

import java.lang.reflect.Field;
// Debug klasa...
public class IspisObjekta {
	public IspisObjekta() {
	}

	public static void ispis(Object object) {
		if (object == null) {
			System.err.println("Ispis objekta null reference...");
		} else {
			Class klasa = object.getClass();
			Field[] polja = klasa.getDeclaredFields();
			for (Field polje : polja) {
				polje.setAccessible(true);
				try {
					System.out
							.println("----------------------------------------");
					System.out.println(polje.getName() + ": "
							+ polje.get(object));
				} catch (IllegalArgumentException e) {
					System.out.println(e.getMessage());
				} catch (IllegalAccessException e) {
					System.out.println(e.getMessage());
				}
			}

		}
	}

}
