package Data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import MealItem.PackageMeal;

public class PackageMealData {

	public static ArrayList<PackageMeal> FoodList = new ArrayList<PackageMeal>();
	static {
		setFoodList();
	}

	public static void setFoodList() {
		String line = "";
		File f = new File("D://中央大學//Lesson//109-2//程式設計(陳仲儼)//109第三次段考(期末專案)//csv_data//Set_meal.csv");

		InputStreamReader read = null;
		try {
			read = new InputStreamReader(new FileInputStream(f), "UTF-8");
		} catch (UnsupportedEncodingException | FileNotFoundException e1) {
			e1.printStackTrace();
		}

		try {
			BufferedReader br = new BufferedReader(read);
			int count = 0;
			while ((line = br.readLine()) != null) {
				if (count == 0) {
					count++;
					continue;
				}
				// System.out.println(line);
				String[] value = line.split(",");
				if (value[3].isEmpty()) {
					FoodList.add(new PackageMeal(value[0], value[1],
							SingleMealData.FoodList.get(Integer.parseInt(value[2]) - 1),
							SingleMealData.FoodList.get(Integer.parseInt(value[4]) - 1), Integer.parseInt(value[5])));
				} else {
					FoodList.add(new PackageMeal(value[0], value[1],
							SingleMealData.FoodList.get(Integer.parseInt(value[2]) - 1),
							SingleMealData.FoodList.get(Integer.parseInt(value[3]) - 1),
							SingleMealData.FoodList.get(Integer.parseInt(value[4]) - 1), Integer.parseInt(value[5])));
				}
				count++;
			}
			br.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	};

	public static String showAll() {
		String message = "<html><body>所有的套餐:<br>";
		for (int i = 0; i < FoodList.size(); i++) {
			message += (FoodList.get(i) + "<br>---副餐:"+FoodList.get(i).getSide1().simplePrint());
			if(FoodList.get(i).getSide2()!=null)
				message+="、"+FoodList.get(i).getSide2().simplePrint();

			message+=("<br>---飲料:"+FoodList.get(i).getDrinks().simplePrint()+"<br><br>");
		}
		return message + "<body><html>";
	}
	public static PackageMeal get(String id) {
		for (int i = 0; i < FoodList.size(); i++) {
			if(FoodList.get(i).getId().equals(id)) {
				return FoodList.get(i);
			}
		}
		return null;
	}
}
