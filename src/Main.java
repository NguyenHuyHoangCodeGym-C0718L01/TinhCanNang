import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //input: weight and height
        double weight, height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Weight: ");
        weight = scanner.nextDouble();
        System.out.println("Height: ");
        height = scanner.nextDouble();

        //calculate BMI
        double BMI = calculateBMI(weight, height);
        System.out.println(BMI);

        //output: kind
        String kind = interpretation(BMI);
        System.out.println(kind);
    }

    //Calculate BMI
    //output: BMI
    //input: weight and height
    public static double calculateBMI(double weight, double height){
        return (weight/(height*height));
    }

    //kind for each BMI
    //input: BMI
    //output: kind
    public static String interpretation(double BMI){
       if(BMI < 18.5){
           return "Underweight" ;
       }else if(18.5 <= BMI && BMI < 25){
           return "Normal";
       }else if(25 <= BMI && BMI < 30){
           return "Overweight";
       }else {
           return "Obese";
       }
    }
}
