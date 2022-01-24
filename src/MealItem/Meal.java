package MealItem;

public class Meal {
	protected String id;
	protected String name;
	protected int price;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public String toString() {
		return id+name+" $"+price;
	}
	public String simplePrint() {
		return id+name;
	}

}
