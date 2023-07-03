package examen;

public class Calcula {
    
    public Calcula(int n1, int n2, int n3) {
        int n;
        n = n1+n2+n3;
        n = n/3;
        return n;
    }

    public Calcula(ArrayList calculoArray) {
        for (int n : calculoArray) {
            n = n+calculoArray;
        }
        return n;
    }

    public Calcula(float n1, float n2) {
        float n;
        n = n1+n2;
        n = n/2;
        return n;
    }
}