public class Temp {
    String name;
    int[] a;


    public int[] getA() {
        return a;
    }

    public void setA(int ... args) {
        this.a = args;
    }


    public Temp(String name, int ... args){
        this.name = name;
        setA(args);
    }

    public static void main(String[] args) {


    }



}
