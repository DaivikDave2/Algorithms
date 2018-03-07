public class SmartDate{
	int day,month,year;
	SmartDate(int day,int month,int year){
		this.day=day;
		this.month=month;
		this.year=year;
		try{
		validateDate();
		}
		catch(DateNotValidException e){
			day=0;
			month=0;
			year=2000;
		}
	}
	SmartDate(String Date){
		String[] date=Date.split("/");
		day=Integer.parseInt(date[0]);
		month=Integer.parseInt(date[1]);
		year=Integer.parseInt(date[2]);
		try{
		validateDate();
		}
		catch(DateNotValidException e){
			day=0;
			month=0;
			year=2000;
		}
	}
	public void validateDate() throws DateNotValidException{
		if(day>=32 || month>12 || year<2000){
			throw new DateNotValidException();
		}
	}
	public String dayOfTheweek(){
		int Number_of_days=0;
		switch(month){
			case 12:Number_of_days+=30;
			case 11:Number_of_days+=31;
			case 10:Number_of_days+=30;
			case 9:Number_of_days+=31;
			case 8:Number_of_days+=31;
			case 7:Number_of_days+=30;
			case 6:Number_of_days+=31;
			case 5:Number_of_days+=30;
			case 4:Number_of_days+=31;
			case 3:Number_of_days+=28;
			case 2:Number_of_days+=31;
			case 1:Number_of_days+=0;
		}
		System.out.println(" day:"+day);
		System.out.println(" month:"+month);
		System.out.println(" year:"+year);
		long numberOfDaysPassed=((year-2000)*365)+Number_of_days+(day-1);
		System.out.println("days passed in this year:"+Number_of_days);
		
			if(year%4==0){
			if((month==2 && day<=28)|| month==1  ){
				numberOfDaysPassed--;
			}
		}
		int no_of_leapYears=((year-2000)/4)+1;
		System.out.println("leap years before:"+no_of_leapYears);
		
		
		numberOfDaysPassed+=no_of_leapYears;
		System.out.println("days passed in this year:"+numberOfDaysPassed);
		
		long dayOfTheweek=(numberOfDaysPassed%7);
		switch((int)dayOfTheweek){
			case 2: return "monday";
			case 3: return "tuesday";
			case 4: return "wednesday";
			case 5: return "thursday";
			case 6: return "friday";
			case 0: return "saturday";
			case 1: return "sunday";
		    default: return "";
		}

		}
	}
