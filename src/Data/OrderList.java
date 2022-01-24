package Data;

import java.io.BufferedWriter;
import java.io.File;
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


	public static void changePackageSide1Meal(String id) {  // 選擇要改成甚麼
		addMoney = 0;  //差價
		addMoney = SingleMealData.get(id).getPrice()-PackageMealData.get(tempId).getSide1().getPrice();
		if(addMoney>0)
			OrderList.get(tempId).setPrice(OrderList.get(tempId).getPrice()+addMoney);
		((PackageMeal) OrderList.get(tempId)).setSide1(SingleMealData.get(id));
		
	}
	public static void changePackageSide2Meal(String id) {  // 選擇要改成甚麼
		addMoney = 0;  //差價
		addMoney = SingleMealData.get(id).getPrice()-PackageMealData.get(tempId).getSide2().getPrice();
		if(addMoney>0)
			OrderList.get(tempId).setPrice(OrderList.get(tempId).getPrice()+addMoney);
		((PackageMeal) OrderList.get(tempId)).setSide2(SingleMealData.get(id));
		
	}
	public static void changePackageDrinks(String id) {  // 選擇要改成甚麼
		addMoney = 0;  //差價
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

	public static Meal get(String id) {
		for (int i = 0; i < FoodList.size(); i++) {
			if(FoodList.get(i).getId().equals(id)) {
				return FoodList.get(i);
			}
		}
		return null;
	}
	
	static String txt_receipt = null;

	public static void receipt() throws IOException
	{	
		String fileName="收據.txt";  
		
		BufferedWriter output = new BufferedWriter(new FileWriter(fileName)); 
		String HTML_receipt=OrderList.showAll()+"		總金額:$"+OrderList.Calculate();
		txt_receipt = HTML_receipt.replaceAll("<br>", "\n").replaceAll("<body>", "").replaceAll("<html>", "");
		output.write(txt_receipt);
		output.flush();
		output.close();
	}
	public static void TransactionRecord() throws IOException {
		final String FILENAME = "交易記錄檔.txt";
		 
		File file = new File(FILENAME);
		 
		// if file doesnt exists, then create it
		if (!file.exists()) {
		  file.createNewFile();
		}
		 
		// true = append file
		FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(txt_receipt);
		 
		bw.close();
		fw.close();
	}
}
