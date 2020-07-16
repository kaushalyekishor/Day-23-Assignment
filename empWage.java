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
