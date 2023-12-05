import java.util.*;
import java.lang.*;

class monster{
	String name;
	monster(String name){
		this.name=name;
	}
	
	String attack(){
		return this.name+" monster is attacking on you";
	}
}

class fireMonster extends monster{
	fireMonster(){
		super("fire");
	}
}

class waterMonster extends monster{
	waterMonster(){
		super("water");
	}
}

class stoneMonster extends monster{
	stoneMonster(){
		super("stone");
	}
}

class Monstor{
	public static void main(String args[]){
		monster f=new fireMonster();
		System.out.println(f.attack());	
		monster w=new waterMonster();
		System.out.println(w.attack());	
		monster s=new stoneMonster();
		System.out.println(s.attack());	
	}
}






