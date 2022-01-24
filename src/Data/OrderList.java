package Data;

import java.util.ArrayList;

import MealItem.Meal;
import MealItem.PackageMeal;

public class OrderList {
	public static ArrayList<Meal> FoodList = new ArrayList<Meal>();
	static String tempId;

	public static void SingleAdd(String id) {
		FoodList.add(SingleMealData.FoodList.get(Integer.parseInt(id) - 1));
	}

	public static void PackageAdd(String id) {
		for (int i = 0; i < PackageMealData.FoodList.size(); i++) {
			if (PackageMealData.FoodList.get(i).getId().equals(id)) {
				FoodList.add(PackageMealData.FoodList.get(i));
			}
		}
	}

	public static void changePackageSide1Meal(String id) { // 選擇要改成甚麼
		int addMoney = 0; // 差價
		for (int i = 0; i < FoodList.size(); i++) {
			if (FoodList.get(i).getId().equals(tempId) && FoodList.get(i) instanceof PackageMeal) {

				addMoney = SingleMealData.FoodList.get(Integer.parseInt(id) - 1).getPrice()
						- ((PackageMeal) FoodList.get(i)).getSide1().getPrice();
				if (addMoney > 0)
					FoodList.get(i).setPrice(FoodList.get(i).getPrice() + addMoney);

				((PackageMeal) FoodList.get(i)).setSide1(SingleMealData.FoodList.get(Integer.parseInt(id) - 1));
				break;
			}
		}

	}

	public static void changePackageSide2Meal(String id) {
		int addMoney = 0;
		for (int i = 0; i < FoodList.size(); i++) {
			if (FoodList.get(i).getId().equals(tempId) && FoodList.get(i) instanceof PackageMeal) {

				addMoney = SingleMealData.FoodList.get(Integer.parseInt(id) - 1).getPrice()
						- ((PackageMeal) FoodList.get(i)).getSide2().getPrice();
				if (addMoney > 0)
					FoodList.get(i).setPrice(FoodList.get(i).getPrice() + addMoney);

				((PackageMeal) FoodList.get(i)).setSide2(SingleMealData.FoodList.get(Integer.parseInt(id) - 1));
				break;
			}
		}

	}

	public static void changePackageDrinks(String id) {
		int addMoney = 0;
		for (int i = 0; i < FoodList.size(); i++) {
			if (FoodList.get(i).getId().equals(tempId) && FoodList.get(i) instanceof PackageMeal) {

				addMoney = SingleMealData.FoodList.get(Integer.parseInt(id) - 1).getPrice()
						- ((PackageMeal) FoodList.get(i)).getDrinks().getPrice();
				if (addMoney > 0)
					FoodList.get(i).setPrice(FoodList.get(i).getPrice() + addMoney);

				((PackageMeal) FoodList.get(i)).setDrinks(SingleMealData.FoodList.get(Integer.parseInt(id) - 1));
				break;
			}
		}

	}

	public static void Remove(String id) {
		for (int i = 0; i < FoodList.size(); i++) {
			if (FoodList.get(i).getId().equals(id)) {
				FoodList.remove(i);
			}
		}
	}

	public static String getTempId() {
		return tempId;
	}

	public static void setTempId(String tempId) {
		OrderList.tempId = tempId;
	}

	public static int Calculate() {
		int total = 0;
		for (int i = 0; i < FoodList.size(); i++) {
			total += FoodList.get(i).getPrice();
		}
		return total;
	}

	public static String showAll() {
		String message = "<html><body>清單:<br>";
		for (int i = 0; i < FoodList.size(); i++) {

			if (FoodList.get(i) instanceof PackageMeal) {
				message += (FoodList.get(i) + "<br>---副餐:" + ((PackageMeal) FoodList.get(i)).getSide1().simplePrint());
				if (((PackageMeal) FoodList.get(i)).getSide2() != null)
					message += "、" + ((PackageMeal) FoodList.get(i)).getSide2().simplePrint();
				message += ("<br>---飲料:" + ((PackageMeal) FoodList.get(i)).getDrinks().simplePrint() + "<br><br>");
			} else
				message += (FoodList.get(i) + "<br><br>");
		}

		return message + "<body><html>";
	}
}
