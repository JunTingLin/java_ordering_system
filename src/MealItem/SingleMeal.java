package MealItem;

public class SingleMeal extends Meal{  //陳侑宣、謝理致
	private String category;
	private boolean breakfast;
	
	public SingleMeal(String id, String name, int price, String category,boolean breakfast) {
		setId(id);
		setName(name);
		setPrice(price);
		setCategory(category);
		setBreakfast(breakfast);
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public boolean isBreakfast() {
		return breakfast;
	}

	public void setBreakfast(boolean breakfast) {
		this.breakfast = breakfast;
	}
	
}
