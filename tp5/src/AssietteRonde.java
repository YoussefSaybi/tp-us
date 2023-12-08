public class AssietteRonde extends Assiette {
    private double rayon;
    public AssietteRonde(int annee, double rayon) {
        super(annee);
        this.rayon = rayon;
    }
    public double calculerSurface() {
        return (3.14 * getRayon() * getRayon());
    }
    public double getRayon() {
        return rayon;
    }
}
