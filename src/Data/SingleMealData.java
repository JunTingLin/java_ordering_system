package Data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

import MealItem.SingleMeal;

public class SingleMealData {

	public static ArrayList<SingleMeal> FoodList = new ArrayList<SingleMeal>();
	static {
		JOptionPane.showMessageDialog(null, "訊息:static初始畫區塊前");
		setFoodList();
		JOptionPane.showMessageDialog(null, "訊息:static初始畫區塊後");
	}

	public static void setFoodList() {
		String line = "";
		InputStreamReader read = null;
		try {
			JOptionPane.showMessageDialog(null, "執行前");
//			JOptionPane.showMessageDialog(null, SingleMealData.class.getResourceAsStream("/Single_meal.csv"));
			
//			File f = new File(SingleMealData.class.getResource("/Single_meal.csv").toURI());
			
//			File f = new File("D://中央大學//Lesson//109-2//程式設計(陳仲儼)//109第三次段考(期末專案)//csv_data//Set_meal.csv");
			read = new InputStreamReader(SingleMealData.class.getResourceAsStream("/Single_meal.csv"), "UTF-8");
			JOptionPane.showMessageDialog(null, "執行後");
			
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
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
			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
		}catch ( Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	};

	public static String showAll() throws ParseException {
		String message = "<html><body>所有的單點:<br>";
		for (int i = 0; i < FoodList.size(); i++) {
			if (noBreakfast() && FoodList.get(i).isBreakfast()) {
				continue;
			}
			message += (FoodList.get(i) + "<br>");
		}
		return message + "<body><html>";
	}

	public static String showMainMeal() throws ParseException {
		String message = "<html><body>";
		for (int i = 0; i < FoodList.size(); i++) {
			if (FoodList.get(i).getCategory().equals("主餐")) {
				if (noBreakfast() && FoodList.get(i).isBreakfast()) {
					continue;
				}
				message += (FoodList.get(i) + "<br>");
			}
		}
		return message + "<body><html>";
	}

	public static String showSideMeal() {
		String message = "<html><body>";
		for (int i = 0; i < FoodList.size(); i++) {
			if (FoodList.get(i).getCategory().equals("副餐")) {
				message += (FoodList.get(i) + "<br>");
			}
		}
		return message + "<body><html>";
	}

	public static String showDrink() {
		String message = "<html><body>";
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

	public static boolean noBreakfast() throws ParseException {
		SimpleDateFormat ft = new SimpleDateFormat("HH:mm:ss");

		Date date = new Date();
		String a = ft.format(date);
		Date date1 = ft.parse(a);
		Date date2 = ft.parse("10:30:00");

		return date1.after(date2);
	}
}
