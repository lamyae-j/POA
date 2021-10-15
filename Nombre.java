package ex1;

public class Nombre implements Runnable {
    public void run(){
        System.out.println(" je suis le 3 ème thread .\n");

        for (int i= 1;i<=60;i++){
            if(i%2==0){
                System.out.println("** "+i+"\n");
            }
        }
    }


}


