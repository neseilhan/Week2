package AverageofArray;

public class AverageOfArray {
     public static void main(String[] args) {
         double[] numbers = {1, 2, 3, 4, 5};
         double harmonicMean = 0;
         for (int i = 0; i < numbers.length; i++) {
             harmonicMean += 1.0/numbers[i];
         }
//         for(double i=1; i<=n; i++){
//             result = result + (1/i); //harmonik seri formülü

         System.out.println("Dizinin harmonik ortalamasi : "+numbers.length/harmonicMean);

    }

}
