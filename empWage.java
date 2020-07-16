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
