package MealItem;

public class PackageMeal extends Meal {
	protected SingleMeal side1;
	protected SingleMeal side2;
	protected SingleMeal drinks;

	public PackageMeal(String id, String name, SingleMeal side1, SingleMeal side2, SingleMeal drinks, int price) {
		setId(id);
		setName(name);
		setSide1(side1);
		setSide2(side2);
		setDrinks(drinks);
		setPrice(price);
	}

	public PackageMeal(String id, String name, SingleMeal side1, SingleMeal drinks, int price) {
		setId(id);
		setName(name);
		setSide1(side1);
		setDrinks(drinks);
		setPrice(price);
	}

	public SingleMeal getSide1() {
		return side1;
	}

	public void setSide1(SingleMeal side1) {
		this.side1 = side1;
	}

	public SingleMeal getSide2() {
		return side2;
	}

	public void setSide2(SingleMeal side2) {
		this.side2 = side2;
	}

	public SingleMeal getDrinks() {
		return drinks;
	}

	public void setDrinks(SingleMeal drinks) {
		this.drinks = drinks;
	}

}
