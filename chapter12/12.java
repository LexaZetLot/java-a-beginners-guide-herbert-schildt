class Alpha{}
class Beta extends  Alpha{}
class Gamma extends  Alpha{}

public class Main {
    public static void main(String[] args) {
        Alpha alpha = new Alpha();
        Beta beta = new Beta();
        Gamma gamma = new Gamma();

        if(alpha instanceof Alpha)
            System.out.println("&alpha = Alpha");
        if(beta instanceof Beta)
            System.out.println("&beta = Beta");
        if(gamma instanceof Gamma)
            System.out.println("&gamma = Gamma");

        if(beta instanceof Alpha)
            System.out.println("&beta = Alpha");
        if(gamma instanceof Alpha)
            System.out.println("&gamma = Alpha");
        //if(gamma instanceof Beta)
        //    System.out.println("Error");

        alpha = beta;
        if(alpha instanceof Beta) {
            System.out.println("&beta = Alpha");
            beta = (Beta) alpha;
        }
        if(alpha instanceof Gamma){
            gamma = (Gamma) alpha;
        }
    }
}
