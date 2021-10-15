package ex1;



public class alphabet extends Thread{


    public void run(){
          System.out.println("-- je suis le 1er thread :  ");
          for (char i= 'r';i<='z';i++){
              System.out.println("** "+i+"\n");
          }
    }
}

