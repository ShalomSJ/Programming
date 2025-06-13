public class Lab05_D {

    public static void main(String[] args) {
        int[] numbers = {19,20,17,18};

        int sum=0;
        for (int i=0;i< numbers.length;i++){
            sum += numbers[i];
        }

        double average;
        average=sum/(double)numbers.length;

        System.out.println("Sum = "+sum);
        System.out.println("Average = "+average);

    }



}
