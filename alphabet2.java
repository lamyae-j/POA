package ex1;

public class alphabet2 extends Thread {
    public void run(){
        System.out.println("-- je suis le 2 eme thread :  ");
        for (char i= 'A';i<='Q';i++){
            System.out.println("** "+i+"\n");
        }
    }
}
