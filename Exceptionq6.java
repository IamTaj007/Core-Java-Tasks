/*4. perform followiing operations on array list
a)How to Iterate ArrayList using Java ListIterator
b)Arraylist add element at specific index
c)Sort ArrayList in descending order
d)insert an element to ArrayList using ListIterator
e)Hsort arraylist of strings alphabetically java
f)Sort elements of Java ArrayList
g)replace an element at specified index arraylist
h)Search an element of Java ArrayList
i)Remove element from specified index ArrayList
j)Remove duplicates from arraylist without using collections
*/

package CoreJavaTask;

import java.util.*;

public class Exceptionq6 {

	ArrayList<Integer> al = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	ArrayList<String> alstring = new ArrayList<>();

	void arrayList() {

		for (int i = 0; i < 10; i++) {
			al.add(i);
		}
	}

	void Iteration() {
		Iterator<Integer> it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	void addElements() {
		try {
			System.out.println("Enter the index and ArrayList items to be inserted");
			int index = sc.nextInt();
			int val = sc.nextInt();
			al.add(index, val);
			System.out.println("The updated ArrayList is =" + al);
		} catch (Exception e) {
			System.out.println("Error value given or type mismatch");
		}
	}

	void sortArrayList() {
		Iterator<Integer> it1 = al.iterator();
		al.sort(Collections.reverseOrder());
		;
		System.out.println(al);
	}

	void insertElement() {
		// Iterator <Integer> it = al.iterator();

		ListIterator<Integer> it = al.listIterator();

		it.add(25);

		System.out.println(al);
	}
	

	void sortAlphabet() {
		alstring.add("Taj");
		alstring.add("Soun");
		alstring.add("Kofu");
		alstring.add("Jaiswal");
		alstring.add("Brata");
		alstring.add("Sartaz");
		alstring.add("Bishal");
		alstring.add("Akshat");
		Collections.sort(alstring);
		System.out.println(alstring);
	}

	void replace() {
		System.out.println(alstring);
		System.out.println("Enter the index you want to repalce");
		int index = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the new data");
		String val = sc.nextLine();
		alstring.set(index, val);
		System.out.println(alstring);
	}

		void search() {
		System.out.println("Enter the element you want to search");
		String search = null;
		
	}
	public static void main(String arg[]) {

		Exceptionq6 e = new Exceptionq6();
//		e.arrayList();
//		e.Iteration();
//		e.sortArrayList();
//		e.insertElement();
//		e.addElements();
		e.sortAlphabet();
		e.replace();

	}
}
