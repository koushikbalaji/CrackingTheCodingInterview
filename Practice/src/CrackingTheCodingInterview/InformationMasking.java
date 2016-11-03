package CrackingTheCodingInterview;

import java.util.Scanner;

public class InformationMasking {

	public static void maskEmail(String email)
	{
		StringBuilder output=new StringBuilder();
		email.trim();
		int i=email.indexOf('@');
		output.append(email.charAt(2)).append("*****").append(email.substring(i-1));
		System.out.println("E:"+output);
		
		
	}
	
	public static void maskPhone(String phone)
	{
		
		StringBuilder output=new StringBuilder();
		phone=phone.trim();
		Character temp;
		int length=phone.length();
		
		for(int i=0;i<phone.length();i++)
		{
			temp=phone.charAt(i);
			
			if(Character.isDigit(temp))
				output.append("*");
			else if((temp=='+')&&(i==0))
				output.append("+");
			else if(i>0){
                if((temp==' '||temp=='-'||(temp==')'&&i!=length-1)||temp=='(')&&output.charAt(output.length()-1)!='-') 
				output.append('-');
            }
			/*else if(temp!=')')
				output.append(temp);*/	
		}
		
		int counter=0;
		
		int j=0;
		for(j=phone.length()-1;j>=0;j--)
		{
			temp=phone.charAt(j);
			
			if(Character.isDigit(temp))
				counter++;
			
			if(counter==4)
				break;
			
			/*else if(temp!=')')
				output.append(temp);*/	
		}
		
		output.replace(output.length()-4,output.length() , phone.substring(j,j+4));
		System.out.println("P:"+output);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		/*while(scan.hasNext())
		{
			String line=scan.nextLine();
			if(line.charAt(0)=='E')
				maskEmail(line);
			else
				maskPhone(line);
		}*/

		maskPhone("+ 21 (333) (456)-(5678)");

		maskPhone("+91 (333) 444-5678");

		maskPhone("+111 (333) 444-5678");

		maskPhone("333 444-5678");

		maskPhone("(333)444-5678");
		scan.close();
		
	}
		
}
