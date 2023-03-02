public abstract class Figura implements Comparable<Figura> {

    public abstract double area();



    public int compareTo (Figura f) {
        int res;
        res= Double.compare (f.area(),this.area());
        return res;
    }
    public String toString(){
        return getClass().getName();
    }
}
