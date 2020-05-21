public class FizzBuzz{
	public static void main (String[] args){
		
		//un genre de if
		int max = (args.length >0) ? Integer.parseInt(args[0]): 100;
		
		for(int i=1; i<=max; ++i){
			if(i % 15 == 0){System.out.println("FizzBuzz");}
			else if(i % 3 == 0){System.out.println("Fizz");}
			else{System.out.println(i);}
		}	
	}
}

