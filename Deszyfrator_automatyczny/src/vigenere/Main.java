package vigenere;

import java.util.HashMap;
import java.util.HashSet;
import edu.duke.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap<String, HashSet<String>> languages = new HashMap<String, HashSet<String>>();
        VigenereBreaker vr = new VigenereBreaker();
        FileResource frden = new FileResource ("dictionaries/Danish.txt");
        languages.put("Danish",vr.readDictionary(frden));
        FileResource frdut = new FileResource ("dictionaries/Dutch.txt");
        languages.put("Dutch",vr.readDictionary(frdut));
        FileResource freng = new FileResource ("dictionaries/English.txt");
        languages.put("English",vr.readDictionary(freng));
        FileResource frfre = new FileResource ("dictionaries/French.txt");
        languages.put("French",vr.readDictionary(frfre));
        FileResource frger = new FileResource ("dictionaries/German.txt");
        languages.put("German",vr.readDictionary(frger));
        FileResource frita = new FileResource ("dictionaries/Italian.txt");
        languages.put("Italian",vr.readDictionary(frita));
        FileResource frpor = new FileResource ("dictionaries/Portuguese.txt");
        languages.put("Portuguese",vr.readDictionary(frpor));
        FileResource frspa = new FileResource ("dictionaries/Spanish.txt");
        languages.put("Spanish",vr.readDictionary(frspa));
        VigenereBreaker vc = new VigenereBreaker();
        FileResource fr = new FileResource ();
        vc.breakForAllLangs(fr.asString(),languages);
	}

}
