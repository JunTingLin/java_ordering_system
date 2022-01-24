package Data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

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

	public static String showAll() throws ParseException{
		SimpleDateFormat ft = new SimpleDateFormat("HH:mm:ss");

		Date date1 = new Date();
		//Date date1 = ft.parse("01:49:55");
		Date date2 = ft.parse("10:30:00");

		if (date1.after(date2)) {
			System.out.println("10點半後了，無早餐");
		}
		else {
			System.out.println("有早餐");
		}

		System.out.println(ft.format(date1));


		String message = "<html><body>所有的單點:<br>";
		for (int i = 0; i < FoodList.size(); i++) {
			if (date1.after(date2) && FoodList.get(i).isBreakfast()) {
				continue;
			}
			message += (FoodList.get(i) + "<br>");
		}
		return message + "<body><html>";
	}

	public static String showSideMeal() {
		String message = "<html><body>副餐:<br>";
		for (int i = 0; i < FoodList.size(); i++) {
			if (FoodList.get(i).getCategory().equals("副餐")) {
				message += (FoodList.get(i) + "<br>");
			}
		}
		return message + "<body><html>";
	}

	public static String showDrink() {
		String message = "<html><body>飲料:<br>";
		for (int i = 0; i < FoodList.size(); i++) {
			if (FoodList.get(i).getCategory().equals("飲料")) {
				message += (FoodList.get(i) + "<br>");
			}
		}
		return message + "<body><html>";
	}

	public static SingleMeal get(String id) {
		for (int i = 0; i < FoodList.size(); i++) {
			if (FoodList.get(i).getId().equals(id)) {
				return FoodList.get(i);
			}
		}
		return null;
	}
}
