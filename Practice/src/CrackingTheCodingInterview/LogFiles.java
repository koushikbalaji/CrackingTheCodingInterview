package CrackingTheCodingInterview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogFiles {

	static class Counter
	{
		double total=0.00,success=0.00;
		Counter(double total,double success)
		{
			this.total=total;
			this.success=success;
		}
	}

	public static void parseLog(String[] input) throws Exception {
		String logEntryPattern = "^([\\d.]+) (\\S+) (\\S+) \\[([\\w:/]+\\s[+\\-]\\d{4})\\] \"(.+?)\" (\\d{3}) (.*)";
		Pattern p = Pattern.compile(logEntryPattern);
		int start = 0, end = 0;
		String time = null, endPoint = null, request = null;
		//String prev=null;
		String prevTime=null,currTime=null;
		//String temp=null;
		double total=0.00,success=0.00;
		Double d=0.00;
		ArrayList<String> output=new ArrayList<String>();
		String out;
		HashMap<String,Counter> map=new HashMap<>();
		
		
		for (String curr : input) {
			/*start = curr.indexOf("HTTP");
			curr = curr.substring(0, start + 13);*/

			Matcher matcher = p.matcher(curr);
			if (!matcher.matches()) {
				System.err.println("Bad log entry (or problem with RE?):");
				return;
			}
			
			time = matcher.group(4);
			String[] tempArr=time.split(" ");
			time=tempArr[0].substring(0, tempArr[0].length()-3);
			
			//time = time.substring(0, (time.indexOf('+')-4));
			
	        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MMM/yyyy:hh:mm",Locale.ENGLISH);
	       
	            Date date =  simpleDateFormat.parse(time);
	            
	        time = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()).toString();
	        currTime=time;
	        if(prevTime==null)
	        	prevTime=currTime;
	        
	        
	        endPoint = matcher.group(5);
			
            tempArr=endPoint.split(" ");
	        int index=tempArr[1].indexOf('?');
	        if(index==-1)
	        	endPoint=tempArr[1];
	        else
	        	endPoint=tempArr[1].substring(0, index);
	        
			request=matcher.group(6);
	        	
			if(currTime.compareTo(prevTime)<0)
				throw new Exception("koushik");
				
	        if(currTime.equals(prevTime))
		        {
		        
				if(!map.containsKey(endPoint))
					map.put(endPoint, new Counter(0.00,0.00));
				
					map.get(endPoint).total++;
					if(!request.equals("500"))
                        map.get(endPoint).success++;
		        }
	        
	        else
			{
				for(String a:map.keySet())
				{
					success=map.get(a).success;
					total=map.get(a).total;
					d=success/total;
					d=d*100;
					
					out=prevTime+" "+a+" "+new DecimalFormat("#0.00").format(d);
					output.add(out);
					
					
					
				}
				
				map=new HashMap<>();
				if(!request.equals("500"))
					map.put(endPoint, new Counter(1.00,1.00));
				else
					map.put(endPoint, new Counter(1.00,0.00));
				prevTime=currTime;

			}
		}
		
		
		d=success/total;
		for(String a:map.keySet())
		{
			success=map.get(a).success;
			total=map.get(a).total;
			d=success/total;
			d=d*100;
			
			out=prevTime+" "+a+" "+new DecimalFormat("#0.00").format(d);
			output.add(out);
			
		}
		Collections.sort(output);
		for(String a:output)
			System.out.println(a);
	}
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> input = new ArrayList<String>();
		String line = null;
		while ((line = scan.readLine()) != null && line.length() != 0)
			input.add(line);

		String[] inputs = new String[input.size()];
		parseLog(input.toArray(inputs));
	}

	
	
}
