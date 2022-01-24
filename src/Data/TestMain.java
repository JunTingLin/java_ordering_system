package Data;

import MealItem.*;

public class TestMain {
	public static void main(String[] args) {
		System.out.println(SingleMealData.showAll());
		System.out.println(PackageMealData.showAll());
		System.out.println(SingleMealData.showMainMeal());
		System.out.println(SingleMealData.showSideMeal());
		System.out.println(SingleMealData.showDrink());
		OrderList.SingleAdd("10");
		OrderList.PackageAdd("A");
		
		
		OrderList.setTempId("B");
		OrderList.PackageAdd(OrderList.getTempId());  
		String message=OrderList.getTempId()+"套餐的副餐為:";
		message+=((PackageMeal) OrderList.FoodList.get(OrderList.FoodList.size()-1)).getSide1();
		if(((PackageMeal) OrderList.FoodList.get(OrderList.FoodList.size()-1)).getSide2()!=null)
			message+="  、"+((PackageMeal) OrderList.FoodList.get(OrderList.FoodList.size()-1)).getSide2();
		
		System.out.println(message);
		System.out.println(OrderList.getTempId()+"套餐的飲料為:"+((PackageMeal) OrderList.FoodList.get(OrderList.FoodList.size()-1)).getDrinks());
		
		((PackageMeal) OrderList.FoodList.get(OrderList.FoodList.size()-1)).setSide1(SingleMealData.FoodList.get(2-1));;
		
		OrderList.setTempId("A");
		OrderList.changePackageSide1Meal("8");
		OrderList.changePackageDrinks("10");
		
		
		OrderList.Remove("2");
		OrderList.SingleAdd("3");
		
		System.out.println(OrderList.showAll());
		System.out.println("總金額:" + OrderList.Calculate());

	}
}
