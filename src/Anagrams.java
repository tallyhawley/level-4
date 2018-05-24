import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Anagrams {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(new File("src/words.txt"));
			String word = JOptionPane.showInputDialog("enter a word");
			ArrayList<Character> chars = new ArrayList<Character>();
			for(int i=0;i<word.length();i++) {
				chars.add(word.toCharArray()[i]);
			}
			int amt = 1;
			for(int i=1;i<=word.length();i++) {
				amt*=i;
			}
			for(int i=0;i<chars.size();i++) {
				
			}
			ArrayList<String> anagrams = new ArrayList<String>();
			ArrayList<String> posAna = new ArrayList<String>();
			while(posAna.size()<amt) {
				Collections.shuffle(chars);
				String temp = "";
				for(Character c : chars) {
					temp+=c;
				}
				if(!posAna.contains(temp)) {
					posAna.add(temp);
					System.out.println(temp);
				}
			}
 			while(scan.hasNextLine()) {
 				String line = scan.nextLine();
				if(posAna.contains(line)) {
					anagrams.add(line);
				}
			}
 			if(anagrams.isEmpty()) {
 				System.out.println("there are no known anagrams of "+word);
 			}
 			else {
	 			System.out.println("anagrams:");
	 			for(String s : anagrams) {
	 				System.out.println(s);
	 			}
 			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
