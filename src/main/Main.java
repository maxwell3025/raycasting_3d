package main;

import raycaster.Display;

public class Main {
	public static void main(String[] args){
		Display display = new Display(1080,720);
		while(true){
			display.Update();
		}
	}
}
