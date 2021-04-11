//Вывод простых чисел в диапазоне от 0-1000
public class testFor {
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





