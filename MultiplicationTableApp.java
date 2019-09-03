package multiplicationtableapp;

public class MultiplicationTableApp {

    public static void main(String[] args) {
        for(int i = 1; i < 11; i++){
            
            for(int j = 1; j < 11; j++){
                if(i*j < 10){
                    System.out.print(" "+i*j+" ");
                }else{
                    System.out.print(i*j+" ");
                }
            }
            System.out.println("");
        }
    }
    
}
