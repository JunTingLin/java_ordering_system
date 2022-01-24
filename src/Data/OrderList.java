package Data;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import MealItem.Meal;
import MealItem.PackageMeal;

public class OrderList {
	public static ArrayList<Meal> FoodList = new ArrayList<Meal>();
	static String tempId;
	public static int addMoney;

	public static void SingleAdd(String id) {
		FoodList.add(SingleMealData.get(id));
	}

	public static void PackageAdd(String id) {
		FoodList.add(PackageMealData.get(id));
	}


	public static void changePackageSide1Meal(String id) {  // ��ܭn�令�ƻ�
		addMoney = 0;  //�t��
		addMoney = SingleMealData.get(id).getPrice()-PackageMealData.get(tempId).getSide1().getPrice();
		if(addMoney>0)
			OrderList.get(tempId).setPrice(OrderList.get(tempId).getPrice()+addMoney);
		((PackageMeal) OrderList.get(tempId)).setSide1(SingleMealData.get(id));
		
	}
	public static void changePackageSide2Meal(String id) {  // ��ܭn�令�ƻ�
		addMoney = 0;  //�t��
		addMoney = SingleMealData.get(id).getPrice()-PackageMealData.get(tempId).getSide2().getPrice();
		if(addMoney>0)
			OrderList.get(tempId).setPrice(OrderList.get(tempId).getPrice()+addMoney);
		((PackageMeal) OrderList.get(tempId)).setSide2(SingleMealData.get(id));
		
	}
	public static void changePackageDrinks(String id) {  // ��ܭn�令�ƻ�
		addMoney = 0;  //�t��
		addMoney = SingleMealData.get(id).getPrice()-PackageMealData.get(tempId).getDrinks().getPrice();
		if(addMoney>0)
			OrderList.get(tempId).setPrice(OrderList.get(tempId).getPrice()+addMoney);
		((PackageMeal) OrderList.get(tempId)).setDrinks(SingleMealData.get(id));
		
	}


	public static void Remove(String id) {
		FoodList.remove(OrderList.get(id));
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
		String message = "<html><body>�M��:<br>";
		for (int i = 0; i < FoodList.size(); i++) {

			if (FoodList.get(i) instanceof PackageMeal) {
				message += (FoodList.get(i) + "<br>---���\:" + ((PackageMeal) FoodList.get(i)).getSide1().simplePrint());
				if (((PackageMeal) FoodList.get(i)).getSide2() != null)
					message += "�B" + ((PackageMeal) FoodList.get(i)).getSide2().simplePrint();
				message += ("<br>---����:" + ((PackageMeal) FoodList.get(i)).getDrinks().simplePrint() + "<br><br>");
			} else
				message += (FoodList.get(i) + "<br><br>");
		}

		return message + "<body><html>";
	}

	public static Meal get(String id) {
		for (int i = 0; i < FoodList.size(); i++) {
			if(FoodList.get(i).getId().equals(id)) {
				return FoodList.get(i);
			}
		}
		return null;
	}
//	private static String parseHTMLContent(String toString) {
//	    String result = toString.replaceAll("<br>", "\n");
//	    String previousResult = "";
//	    while(!previousResult.equals(result)){
//	        previousResult = result;
//	        result = result.replaceAll("\n\n","\n");
//	    }
//	    return result;
//	}
	public static void receipt() throws IOException
	{	
		String fileName="����.txt";  
		
		BufferedWriter output = new BufferedWriter(new FileWriter(fileName)); 
		String HTML_receipt=OrderList.showAll()+"		�`���B:$"+OrderList.Calculate();
		String txt_receipt = HTML_receipt.replaceAll("<br>", "\n").replaceAll("<body>", "").replaceAll("<html>", "");
		output.write(txt_receipt);
		output.flush();
		output.close();
	}
}
