public class Lab06_A {
    int salary=100000;
    int allowance=20000;
    int bonus=10000;

    public void salary(){
        System.out.println("The employee's salary is: "+salary);
      }
    }

    class Allowance extends Lab06_A{
    public void allowance(){
        System.out.println("The employee's allowance is: "+allowance);
      }
    }

    class Bonus extends Allowance{
    public void bonus(){
        System.out.println("The employee's bonus is: "+bonus);
    }


    public static void main(String[] args){

        Bonus bonus = new Bonus();

        bonus.salary();
        bonus.allowance();
        bonus.bonus();

    }
}
