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
import MealItem.SingleMeal;

public class SingleMealData {

	public static ArrayList<SingleMeal> FoodList = new ArrayList<SingleMeal>();
	static {
		setFoodList();
	}

	public static void setFoodList() {
		String line = "";
		File f = new File("D://中央大學//Lesson//109-2//程式設計(陳仲儼)//109第三次段考(期末專案)//csv_data//Single_meal.csv");

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
				String[] value = line.split(",");
				FoodList.add(new SingleMeal(value[0], value[1], Integer.parseInt(value[2]), value[3],
						Boolean.parseBoolean(value[4])));
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
		String message = "<html><body>所有的單點:<br>";
		for (int i = 0; i < FoodList.size(); i++) {
			message += (FoodList.get(i) + "<br>");
		}
		return message + "<body><html>";
	}

	public static String showMainMeal() {
		String message = "<html><body>主餐:<br>";
		for (int i = 0; i < FoodList.size(); i++) {
			if (FoodList.get(i).getCategory().equals("主餐")) {
				message += (FoodList.get(i) + "<br>");
			}
		}
		return message+"<body><html>";
	}
	public static String showSideMeal() {
		String message = "<html><body>副餐:<br>";
		for (int i = 0; i < FoodList.size(); i++) {
			if (FoodList.get(i).getCategory().equals("副餐")) {
				message += (FoodList.get(i) + "<br>");
			}
		}
		return message+"<body><html>";
	}
	public static String showDrink() {
		String message = "<html><body>飲料:<br>";
		for (int i = 0; i < FoodList.size(); i++) {
			if (FoodList.get(i).getCategory().equals("飲料")) {
				message += (FoodList.get(i) + "<br>");
			}
		}
		return message+"<body><html>";
	}
	public static SingleMeal get(String id) {
		for (int i = 0; i < FoodList.size(); i++) {
			if(FoodList.get(i).getId().equals(id)) {
				return FoodList.get(i);
			}
		}
		return null;
	}
}
