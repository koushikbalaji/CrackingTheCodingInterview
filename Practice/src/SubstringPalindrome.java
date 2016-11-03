import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class SubstringPalindrome {

	public static void main(String ar[])
	{
		
		//max_Chocolates(new int[]{5,4,7,90000000});
		//mystery(new String[]{"abcd"});
		System.out.println(palindrome("gello"));
	}
	
	 static void mystery(String[] letter) {

		 int length=0;
		 String temp;
		 int sum;
		 for(int m=0;m<letter.length;m++)
		 {
			 
		 temp=letter[m];	 
		 length=temp.length();
		 sum=0;
		 if(temp.length()%2==0)
		 {
			 for(int i=(length/2),j=(length/2)-1;i<length;i++,j--)
			 {
				sum=sum+Math.abs(temp.charAt(i)-temp.charAt(j)); 
			 }
				 
		 }
		 else
		 {
			 for(int i=(length/2)+1,j=(length/2)-1;i<length;i++,j--)
			 {
				sum=sum+Math.abs(temp.charAt(i)-temp.charAt(j)); 
			 } 
		 }

		 System.out.println(sum);
	    }
	 }
	static void max_Chocolates(int[] arr) {
		 
		long a;
		for(int i=0;i<arr.length;i++)
        {
			a=arr[i]/2;
			if(arr[i]%2==0)    
			{
        	 	System.out.println(a*a);
			}
			else
			{
				System.out.println(a*(a+1));
			}
     }
 }

static int palindrome(String str) {
        

Set<String> op = new HashSet<>();
String chk;

for(int i=0; i<=str.length(); i++){

for(int j=i+1; j<=str.length(); j++){

chk =str.substring(i, j);

if(checkPali(chk))
op.add(chk);
}

}

return op.size();

    }

/*int countPalindrome(String str)
{
	int i,j,k,count=0;
	for(i=0;i<str.length();i++)
	{
		k=i-1;j=i+1;  //count odd length palindromes
		while(k>=0 &&str.charAt(j)==str.charAt(j) && str.charAt(k)==str.charAt(j))
		{
			++count;
			k--;j++;
		}

		k=i;j=i+1; //count even length palindrome
		while(k>=0 && str[j] && str[k]==str[j])
		{
			++count;
			k--;j++;
		}
	}
	return count;
}*/
public class Pair
{
	Integer key;
	Integer value;
	public  Pair(Integer key, Integer value) {
		super();
		this.key = key;
		this.value = value;
	}
	public Integer getKey() {
		return key;
	}
	public void setKey(Integer key) {
		this.key = key;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	
	}
static LinkedList<Pair> pairs = new LinkedList<Pair>();

public static String isItPossible(Integer a, Integer b, Integer c, Integer d){
    pairs.addLast(new SubstringPalindrome().new Pair(a,b));
    while (!pairs.isEmpty()){
        Pair pair = pairs.poll();
        Integer key = pair.getKey();
        Integer value = pair.getValue();
        if(key.equals(a) &&
                value.equals(b)){
            return "YES";
        }
        int sum=key+value;
        if (sum<=c){
            pairs.addLast(new SubstringPalindrome().new Pair(sum,value));
        }
        if (sum<=d){
            pairs.addLast(new SubstringPalindrome().new Pair(key,sum));
        }

    }

    return "NO";
}

	public static Boolean checkPali(String s)
	{
		int len=s.length();
		for(int i=0;i<len/2;i++)
		{
			if(s.charAt(i)!=s.charAt(len-i-1));
			return false;
		}
		return true;
	}
}
