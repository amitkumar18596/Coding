public class Check Prime {
    public static String isPrime(int num) {
		//Your code goes here
		boolean res;
		if(num==0 || num==1)
			return "NO";
		for(int i=2;i*i<num;i++){
			if(num % i == 0)
				return "NO";
		}
		return "YES";
	}
}
