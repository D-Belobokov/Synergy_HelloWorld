public class PrimeNumber {
    public static void main(String[] args){
        for(int i=2;i<=1000;i++){
            boolean checkNumber=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    checkNumber=false;
                    break;
                }
            }
            if(checkNumber){
                System.out.println(i);
            }
        }
    }
}
