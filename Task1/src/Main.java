import com.sun.source.tree.ReturnTree;

public class Main {

    public void methodE (){
        System.out.println("e");
    }

    public void methodeR (){
        System.out.println("r");
    }



    public static void main(String[] args) {

        Task1 task1 = new Task1();
        Task1_4 task1_4 = new Task1_4();
        Main main = new Main ();

        task1.methodJ();
        task1.methodA();
        task1.methodV();
        task1.methodA();
        System.out.println("");
        main.methodE();
        main.methodeR();
        System.out.println("");
        task1_4.methodS();
        task1_4.methodJ();
        task1_4.methodO();
        task1.methodV();
        task1_4.methodT();


    }

}
