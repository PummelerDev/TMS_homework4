import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class TheTasks {

	public static void main(String[] args) {
//		task0();
//		task1();
//		task2();
//		task3();
//		task4();
//		task5();
//		task6();
		task7();

	}

	public static void task0() {
		Scanner scan0 = new Scanner(System.in);
		System.out.println("Enter a number");
		int n0 = scan0.nextInt();
		int[] ints0 = new int[100];
		for (int i = 0; i < ints0.length; i++) {
			ints0[i] = i;
			System.out.print(ints0[i] + " ");
		}
		boolean bool0 = false;
		for (int i = 0; i < ints0.length; i++) {
			if (ints0[i] == n0) {
				bool0 = true;
			}
		}
		if (bool0 == false)
			System.out.println("\n" + "there is no such number");
		else
			System.out.println("\n" + "there is such number");
		scan0.close();
	}

	public static void task1() {
		Scanner scan1 = new Scanner(System.in);
		Random random1 = new Random();
		int size = 100;
		int[] ints1 = new int[size];
		for (int i = 0; i < ints1.length; i++) {
			ints1[i] = random1.nextInt(10);
			System.out.print(ints1[i] + " ");
		}
		System.out.println("\nEnter a number");
		int n1 = scan1.nextInt();
		int quantityOfCoincidence = 0;
		for (int i = 0; i < ints1.length; i++) {
			if (ints1[i] == n1)
				quantityOfCoincidence++;
		}
		int counter1 = 0;
		int[] ints1_new = new int[size - quantityOfCoincidence];
		System.out.println(ints1_new.length);
		for (int j = 0; j < ints1.length; j++) {
			if (ints1[j] != n1)
				ints1_new[counter1++] = ints1[j];
		}
		for (int i : ints1_new)
			System.out.print(i + " ");
		scan1.close();
	}

	public static void task2() {
		Scanner scan2 = new Scanner(System.in);
		Random random2 = new Random();
		System.out.println("Enter the size of the array");
		int size = scan2.nextInt();
		int[] ints2 = new int[size];
		for (int i = 0; i < ints2.length; i++)
			ints2[i] = random2.nextInt(20);
		for (int i : ints2)
			System.out.print(i + " ");
		System.out.println();
		int minValue = ints2[0];
		int maxValue = ints2[0];
		double sumValue = 0;
		double averageValue = 0;
		for (int i = 0; i < ints2.length; i++) {
			if (minValue > ints2[i])
				minValue = ints2[i];
			if (maxValue < ints2[i])
				maxValue = ints2[i];
		}
		System.out.println("min value= " + minValue + " max value = " + maxValue);

		for (int i = 0; i < ints2.length; i++)
			sumValue += ints2[i];
		averageValue = sumValue / ints2.length;
		System.out.println("average value= " + averageValue);
		scan2.close();
	}

	public static void task3() {
		int size3 = 5;
		int ints3_1[] = new int[size3];
		int ints3_2[] = new int[size3];
		double sumValue3_1 = 0;
		double sumValue3_2 = 0;
		double averageValue3_1 = 0;
		double averageValue3_2 = 0;
		Random random3 = new Random();
		for (int i = 0; i < size3; i++) {
			ints3_1[i] = random3.nextInt(20);
			ints3_2[i] = random3.nextInt(20);
			sumValue3_1 += ints3_1[i];
			sumValue3_2 += ints3_2[i];
		}
		System.out.println(Arrays.toString(ints3_1));
		System.out.println(Arrays.toString(ints3_2));
		averageValue3_1 = sumValue3_1 / size3;
		averageValue3_2 = sumValue3_2 / size3;
		if (averageValue3_1 > averageValue3_2)
			System.out.println("array 1 is bigger");
		else if (averageValue3_2 > averageValue3_1)
			System.out.println("array 2 is bigger");
		else
			System.out.println("array 1 equals array 2");
	}

	public static void task4() {
		Scanner scan4 = new Scanner(System.in);
		int size = toCheck(scan4);
		int quantityOfCoincidence4 = 0;
		int counter4 = 0;
		int[] ints4 = new int[size];
		for (int i = 0; i < ints4.length; i++) {
			ints4[i] = new Random().nextInt(10);
			if (ints4[i] % 2 == 0)
				quantityOfCoincidence4++;
		}
		System.out.println(Arrays.toString(ints4));
		int[] ints4_new = new int[quantityOfCoincidence4];
		for (int i = 0; i < ints4.length; i++) {
			if (ints4[i] % 2 == 0)
				ints4_new[counter4++] = ints4[i];
		}
		System.out.println(Arrays.toString(ints4_new));

	}

	private static int toCheck(Scanner scan4) {
		int check = 0;
		while (true) {
			System.out.println("enter a number from 5 to 10");
			if (scan4.hasNextInt() && (check = scan4.nextInt()) > 5 && check <= 10) {
				return check;
			} else {
				System.out.println("incorrect data. try again");
				scan4.next();
			}
		}

	}

	public static void task5() {
		int size5 = 20;
		int[] ints5 = new int[size5];
		for (int i = 0; i < size5; i++)
			ints5[i] = new Random().nextInt(20);
		System.out.println(Arrays.toString(ints5));
		for (int i = 1; i < ints5.length; i += 2)
			ints5[i] = 0;
		System.out.println(Arrays.toString(ints5));
	}

	public static void task6() {
		String[] names = { "Jack", "Ann", "John", "Elisabeth", "Yan", "Britney", "Harry", "Judy", "Thomas", "Caroline",
				"Oliver", "Kelly", "Calvin" };
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
	}

	public static void task7() {
//		a bubble sorting

		int size7 = 10;
		int[] ints7 = new int[size7];
		for (int i = 0; i < ints7.length; i++)
			ints7[i] = new Random().nextInt(40);
		System.out.println(Arrays.toString(ints7));
		int variable7 = 0;
		int maxValue = 0;
		int lastIndex = ints7.length - 1;
		while (true) {
			for (int i = 0, x = 1; x < ints7.length; i++, x++) {
				if (ints7[i] > ints7[x]) {
					if (ints7[i] > maxValue)
						maxValue = ints7[i];
					variable7 = ints7[x];
					ints7[x] = ints7[i];
					ints7[i] = variable7;
					System.out.println(Arrays.toString(ints7));
				}
			}
			if (maxValue <= ints7[lastIndex]) {
				lastIndex--;
//	just my system for analysis			
//				System.out.println(lastIndex + " " + maxValue);  
				maxValue = 0;
			}
			if (lastIndex==0)
				break;
		}
	}

}