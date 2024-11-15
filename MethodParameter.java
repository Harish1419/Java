package Allprogram;

public class MethodParameter {
	static void mymethod(String fname){
		System.out.println(fname+"Argument added");}
	
	static String mymethods(String dname) {
        String result = dname + " Argument added";
        System.out.println(result);
        return result;  // Now the method returns a String
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
mymethod("ram");
mymethod("anjana");
mymethod("Jenny");

mymethods("ram");
mymethods("anjana");
mymethods("Jenny");

	}

}
