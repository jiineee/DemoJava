package day08.super_;

public class Parent {
	String mother;
	String father;

	//생략됨
//	Parent(){
//			
//		}
	
	Parent(String mother, String father){
		this.mother = mother;
		this.father = father; 
	}
	
	String info() {
		return "name:" + mother + ",name:" + father;
	}
	
}
