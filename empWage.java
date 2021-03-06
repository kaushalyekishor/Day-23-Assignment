//emp present absent code added
public class empPresentAbsent
{
        public static void main(String[] args)
        {
                int isPresent=1;
                double empCheck=Math.floor(Math.random() * 10) % 2;
                //System.out.println("randome value: "+Math.random());
                if (empCheck == isPresent)
                {
                        System.out.println("Employee is present");
                }
                else
                {
                        System.out.println("EMployee is Absent");
                }
        }
}



//Daily emp wage code added
public class dailyEmpWage
{
        public static void main(String[] args)
        {
                //CONSTANTS
                int IS_FULL_TIME=1;
                int EMP_RATE_PER_HOUR=20;

                //vARIABLES
                int empHrs=0;
                int empWage=0;

                //computation
                double empCheck=Math.floor(Math.random() * 10 ) % 2;
                if(empCheck==IS_FULL_TIME)
                {
                        empHrs=8;
                }
                else
                {
                        empHrs=0;
                }
        empWage=empHrs*EMP_RATE_PER_HOUR;
        System.out.println("empWage: " +empWage);
        }
}




//part time emp wage code added
public class partTimeEMpWage
{
        public static void main(String[] args)
        {
                //CONSTANTS
                int IS_PART_TIME=1;
                int IS_FULL_TIME=2;
                int EMP_RATE_PER_HOUR=20;

                //vARIABLES
                int empHrs=0;
                int empWage=0;

                //computation
                double empCheck=Math.floor(Math.random() * 10 ) % 3;
                if(empCheck==IS_PART_TIME)
                {
                        empHrs=4;
                }
                else if(empCheck==IS_FULL_TIME)
                {
                        empHrs=8;
                }
		else
		{
			empHrs=0;
		}
        empWage=empHrs*EMP_RATE_PER_HOUR;
        System.out.println("empWage: " +empWage);
        }
}




//part full time switch case code added
public class partFullTimeSwitch
{
//CONSTANTS
public static final int IS_PART_TIME=1;
public static final int IS_FULL_TIME=2;
public static final int EMP_RATE_PER_HOUR=20;

        public static void main(String[] args)
        {
                //vARIABLES
                int empHrs=0;
                int empWage=0;

                //computation
                int empCheck=(int) Math.floor(Math.random() * 10 ) % 3;
                switch (empCheck)
                {
                   case IS_PART_TIME:
                        empHrs=4;
			break;
		   case IS_FULL_TIME:
			empHrs=8;
			break;
		   default:
			empHrs=0;
                }
        	empWage=empHrs*EMP_RATE_PER_HOUR;
        	System.out.println("empWage: " +empWage);
        }
}




//Emp wages for a month code added
public class empWageForMonthSalary
{
       public static final int IS_PART_TIME=1;
       public static final int IS_FULL_TIME=2;
       public static final int empRatePerHours=20;
       public static final int numberOfDays=20;

	public static void main(String[] args)
	{
	   int totalSalary=0;
	   int empHrs=0;
	   int salary=0;

	   for(int day=1;day<=numberOfDays;day++)
	   {
	       double empCheck=Math.floor(Math.random()*10)%3;
	       switch((int)empCheck)
	       {
		  case IS_PART_TIME:
		  empHrs=8;
		  break;

		  case IS_FULL_TIME:
		  empHrs=4;
		  break;

		  default:
		  empHrs=0;
	       }
	   salary=empHrs*empRatePerHours;
	   totalSalary=totalSalary+salary;
	   }
      System.out.println("Total Salary: "+totalSalary);
     }
}





//emp Days a Reached for month code added 
public class empDaysReachedForMonth
{
         //Constants
        public static final int IS_FULL_TIME=1;
        public static final int IS_PART_TIME=2;
        public static final int EMP_RATE_PER_HOUR=20;
        public static final int NUM_OF_WORKING_DAYS=20;
        public static final int MAX_HRS_IN_MONTH=100;

//              public empTotalWage(int empRate,int numbOfDays,int maxDays)
//              {
//                      this.EMP_RATE_PER_HOUR=empRate;
//                      this.NUM_OF_WORKING_DAYS=numbOfDays;
//              }

                public static void main(String[ ] args)
                {
                        //variables
                        int empHrs = 0;
                        int empWage = 0;
                        int totalEmpWage = 0, totalWorkingDays=0, totalEmpHrs=0;
                        while(totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS)
                        {
                                totalWorkingDays++;
                                //int empHrs = 0, empWage = 0;
                                int empCheck =(int) Math.floor(Math.random() * 10) % 3;
                                switch (empCheck)
                                {
                                case IS_FULL_TIME:
                                        empHrs = 8;
                                        break;
                                case IS_PART_TIME:
                                        empHrs = 4;
                                        break;
                                default:
                                        empHrs = 0;
                                }
                                totalEmpHrs += empHrs;
                                empWage = empHrs * EMP_RATE_PER_HOUR;
                                totalEmpWage += empWage;
                                System.out.println("Employee Wage : "+empWage);
                        }
                System.out.println("Total Employee Wage: "+totalEmpWage);
                }
}





//compute emp wage code added
public class empComputeWage
{
public static final int IS_PART_TIME = 1;
public static final int IS_FULL_TIME = 2;
public static final int EMP_RATE_PER_HOUR = 20;
public static final int NUM_OF_WORKING_DAYS = 2;
public static final int MAX_HRS_IN_MONTH = 10;

        public static int computeEmpWage()
        {
                //11 Va riables
                int empHrs = 0, totalEmpHrs = 0, totalWorkingDays=0;
                //II Computation
                while(totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS)
                {
                totalWorkingDays++;
                int empCheck = (int) Math .floor(Math.random ()* 10) % 3;
                switch (empCheck)
                {
                        case IS_PART_TIME :
                        empHrs = 4;
                        break;
                        case IS_FULL_TIME:
                        empHrs = 8;
                        break;
                        default:
                        empHrs = 0;
                }
                totalEmpHrs += empHrs;
                System.out.println ("Day:"+totalWorkingDays+" Emp Hr:"+empHrs);
                }
        int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
        System.out.println ("Total Emp Wage: " + totalEmpWage);
        return totalEmpWage;
        }

        public static void main (String[ ] args)
        {
        computeEmpWage();
        }
}





//This is Employee Wage for muiltiple companies
public class empComputeWageCompany
{
         //Constants
        public static final int IS_FULL_TIME=1;
        public static final int IS_PART_TIME=2;
        public static final int EMP_RATE_PER_HOUR=20;
        public static final int NUM_OF_WORKING_DAYS=20;
        public static final int MAX_HRS_IN_MONTH=100;

        public static void calculateEmpWage(String company,int empRate,int numbOfDays,int maxHrs)
        {
                //Variables
                int empHrs=0,totalWorkingDays=0;
                int empWage=0;
                int totalEmpWage=0,totalEmpHrs=0;

                while(totalEmpHrs<=maxHrs &&  totalWorkingDays < numbOfDays)
                {
                        for(int day=0;day<NUM_OF_WORKING_DAYS;day++)
                        {
                           totalWorkingDays++;
                           //COMPUTATION
                           double empCheck=Math.floor(Math.random()*10)%3;
                           switch ((int)empCheck)
                           {

                                case IS_FULL_TIME:
                                empHrs=8;
                                break;

                                case IS_PART_TIME:
                                empHrs=4;
                                break;

                                default:
                                empHrs=0;
                            }
                            empWage=EMP_RATE_PER_HOUR*empHrs;
                            totalEmpHrs+=empHrs;
                            System.out.println(" Employee Wage "+empWage);
                            System.out.println(totalWorkingDays+ " "+empHrs);
                        }
                   //System.out.println(" Total Employee Wage "+totalEmpWage);
                   totalEmpWage=totalEmpHrs*empRate;
                   System.out.println(" Total Employee Wage "+ " " + " Comapny is "+ company+" " +totalEmpWage);
                }
        }

                public static void main(String args[])
                {
                calculateEmpWage("DMart",20,2,10);
                calculateEmpWage("Reliance",30,3,20);
                }
}




//total wage for each company code added
public class totalEmpWageEachCompany
{
         //Constants
        public static final int IS_FULL_TIME=1;
        public static final int IS_PART_TIME=2;
        public static final int EMP_RATE_PER_HOUR=20;
        public static final int NUM_OF_WORKING_DAYS=20;
        public static final int MAX_HRS_IN_MONTH=100;

        public static void calculateEmpWage(String company,int empRate,int numbOfDays,int maxHrs)
        {
                //Variables
                int empHrs=0,totalWorkingDays=0;
                int empWage=0;
                int totalEmpWage=0,totalEmpHrs=0;

                while(totalEmpHrs<=maxHrs &&  totalWorkingDays < numbOfDays)
                {
                        for(int day=0;day<NUM_OF_WORKING_DAYS;day++)
                        {
                           totalWorkingDays++;
                           //COMPUTATION
                           double empCheck=Math.floor(Math.random()*10)%3;
                           switch ((int)empCheck)
                           {

                                case IS_FULL_TIME:
                                empHrs=8;
                                break;

                                case IS_PART_TIME:
                                empHrs=4;
                                break;

                                default:
                                empHrs=0;
                            }
                            empWage=EMP_RATE_PER_HOUR*empHrs;
                            totalEmpHrs+=empHrs;
                            System.out.println(" Employee Wage "+empWage);
                            System.out.println(totalWorkingDays+ " "+empHrs);
                        }
                   //System.out.println(" Total Employee Wage "+totalEmpWage);
                   totalEmpWage=totalEmpHrs*empRate;
                   System.out.println(" Total Employee Wage of Comapny is "+company+" " +totalEmpWage);
                }
        }

                public static void main(String args[])
                {
                calculateEmpWage("DMart",20,2,10);
                calculateEmpWage("Reliance",30,3,20);
                }
}




//emp wage Builder Array code added
public class empWageBuilderArray
{
//II Constants
public static final int IS_PART_TIME = 1;
public static final int IS_FULL_TIME = 2;

private int numOfCompany=0;
private CompanyEmpWage[ ] companyEmpWageArray;

		public empWageBuilderArray()
		{
			companyEmpWageArray = new CompanyEmpWage[5];
		}

		private void addCompanyEmpWage(String company, int empRateParHour, int numOfWorkingDays, int maxHoursPerMonth)
		{
			companyEmpWageArray[numOfCompany]=new CompanyEmpWage(company, empRateParHour, numOfWorkingDays,maxHoursPerMonth);
			numOfCompany++;
		}

		private void computeEmpWage()
		{
			for(int i=0; i<numOfCompany; i++)
			{
	   		   companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
	   		   System.out.println(companyEmpWageArray[i]);
			}
		}

		private int computeEmpWage(CompanyEmpWage companyEmpWage)
		{
			//variables
			int empHrs=0, totalEmpHrs=0, totalWorkingDays=0;
			//computeation
			while(totalEmpHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays)
			{
	   		totalWorkingDays++;
	   		int empCheck=(int)Math.floor(Math.random()*10)%3;
	  			switch(empCheck)
	  			{
					case IS_PART_TIME:
					empHrs=4;
					break;
					case IS_FULL_TIME:
					empHrs=8;
					break;
					default:
					empHrs=0;
	  			}
	 		totalEmpHrs += empHrs ;
         		System.out.println("Day:"+totalWorkingDays+" Emp Hr:"+empHrs);
        		}
        		return totalEmpHrs * companyEmpWage.empRatePerHour;
		}

		public static void main(String[] args)
		{
			empWageBuilderArray empWageBuilder= new empWageBuilderArray();
			empWageBuilder.addCompanyEmpWage("DMart", 29, 2, 19);
			empWageBuilder.addCompanyEmpWage("Reliance", 19, 4, 29);
			empWageBuilder.computeEmpWage();
		}




public class CompanyEmpWage
{
	public final String company;
	public final int empRatePerHour;
	public final int numOfWorkingDays;
	public final int maxHoursPerMonth;
	public int totalEmpWage;


	public CompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth)
	{
	this.company = company;
	this.empRatePerHour = empRatePerHour;
	this.numOfWorkingDays = numOfWorkingDays;
	this.maxHoursPerMonth = maxHoursPerMonth;
	}

	public void setTotalEmpWage(int totalEmpWage)
	{
	 this.totalEmpWage = totalEmpWage;
	}

	public String toString()
	{
	 return "Total EMp Wage for Company: "+company+" is: "+totalEmpWage;
	}

    }
}

