package hr.infomare.drrh.pomocni;

public enum BudcommsgType {
	RESERVATION(0), CONTRACT(1), PURCHASE_ORDER(2);

	private int value;

	private BudcommsgType(int typeres) {
		this.value = typeres;
	}

	public int getValue() {
		return value;
	}
}