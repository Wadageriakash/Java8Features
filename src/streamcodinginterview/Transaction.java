package streamcodinginterview;

public class Transaction {

	private String date;
	private Integer amount;

	public Transaction(String date, int amount) {
		this.date = date;
		this.amount = amount;
	}

	public String getDate() {
		return this.date;
	}

	public Integer getAmount() {
		return this.amount;
	}
}
