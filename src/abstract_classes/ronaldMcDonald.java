package abstract_classes;

import java.util.ArrayList;

public class ronaldMcDonald {
public static void main(String[] args) {
	ArrayList<Animals> farm = new ArrayList<Animals>();
	Donkey dank = new Donkey();
	Pony peggy = new Pony();
	Chicken chickey = new Chicken();
	Llama llamey = new Llama();
	
	farm.add(dank);
	farm.add(peggy);
	farm.add(chickey);
	farm.add(llamey);
	
	for(Animals array : farm) {
		array.eatFood();
		array.makeNoise();
	}
}
}
