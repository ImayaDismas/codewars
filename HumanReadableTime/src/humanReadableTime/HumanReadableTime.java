package humanReadableTime;

public class HumanReadableTime {
	public String makeReadable(int seconds) {
	    int second =0;
	    int minute = 0;
	    int min = 0;
	    int hour = 0;
	    
	    second = seconds % 60;
	    min = seconds / 60;
	    minute = min % 60;
	    hour = min / 60;
	    if(second < 10 && minute < 10 && hour < 10)
	    {
	    	return "makeReadable(" + seconds + ")" + ", " + "0" + hour + ":" + "0" + minute + ":" + "0" + second;
	    }
	    
	    else if(second > 10 && minute < 10 && hour < 10)
	    {
	    	return "makeReadable(" + seconds + ")" + ", " + "0" + hour + ":" + "0" + minute + ":" + second;
	    }
	    else if(second > 10 && minute > 10 && hour < 10)
	    {
	    	return "makeReadable(" + seconds + ")" + ", " + "0" + hour + ":"  + minute + ":" + second;
	    }
	    else if(second < 10 && minute > 10 && hour < 10)
	    {
	    	return "makeReadable(" + seconds + ")" + ", " + "0" + hour + ":"  + minute + ":" + "0" + second;
	    }
	    else if(second < 10 && minute < 10 && hour > 10)
	    {
	    	return "makeReadable(" + seconds + ")" + ", " + hour + ":" + "0" + minute + ":" + "0" + second;
	    }
	    else if(second < 10 && minute > 10 && hour > 10)
	    {
	    	return "makeReadable(" + seconds + ")" + ", " + hour + ":" + minute + ":" + "0" + second;
	    }
	    else if(second > 10 && minute < 10 && hour > 10)
	    {
	    	return "makeReadable(" + seconds + ")" + ", " + hour + ":"+ "0" + minute + ":" + second;
	    }
	    
	    return "makeReadable(" + seconds + ")" + ", " + hour + ":" + minute + ":" + second;
	     
	  }

	
	public static void main(String[] args) {
		HumanReadableTime obj = new HumanReadableTime();
		System.out.println(obj.makeReadable(0));

	}

}
