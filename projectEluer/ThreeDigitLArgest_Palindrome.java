package projecteuler;

public class palindrome_digit_multiplication {
	

	public static void main(String[] args) {
		int i=999,num=999,digit,j,d,rev,max=0,a=0,b=0;
		for(i=num;i>=100;i--) {
			for(j=num;j>=100;j--) {
				digit=i*j;
				int n=digit;
				rev=0;
				while(n>0) {
					d=n%10;
					
					rev=(rev*10)+d;
					n/=10;
				}
				if(digit==rev) {
					
					if(digit>max) {
						max=digit;
						a=i;
						b=j;
					}
					break;
				}
				
			}
	  }
		System.out.println("the multiplication numbers are : "+a+" "+b);
	}

}
