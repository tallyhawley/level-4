import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Anagrams {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(new File("words.txt"));
			String word = JOptionPane.showInputDialog("enter a word");
			ArrayList<String> anagrams = new ArrayList<String>();
			while(scan.hasNextLine()) {
				if(scan.nextLine().equals()) {
					
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
