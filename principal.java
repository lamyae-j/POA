package ex1;
public class principal {
    public static void main(String[] args) {
        alphabet TA = new alphabet();
        alphabet2 TB = new alphabet2();
        Nombre T = new Nombre();
        Thread TC = new Thread(T);
        TA.start();
        TB.start();
        TC.start();

    }
}

// on remarque que tous les threads  travaillenet en parallele , ils se lancent tous au debut et puis commencent le fonctionnement
// on peut remarquer que les resultats des 3 threads aparaissent comme chevaucher