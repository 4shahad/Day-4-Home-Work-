public class HW_D4 {
    public static void main(String[] args) throws Exception {

            int array[] ={3,0,-9,8,1};
           System.out.println(numbers(array));

            Customer customer1= new Customer(123,"nor",'n');
            System.out.println(customer1);

    }
    static int  numbers(int array[]) throws ArithmeticException{
        int smallest=0;
        for (int i = 0; i <array.length ; i++) {
            if (array[i]<0){
               throw new ArithmeticException("the number is small than 0 you have to write positive number in array ");
            }
            else if (smallest>array[i]){
                smallest=array[i];
            }

        }
   return smallest; }
}
