package geometria;

public abstract class Forma {
    private String cor;
    private boolean preenchido;

    public Forma(){
        cor = "Vermelho";
        preenchido = true;
    }

    public Forma(String cor, boolean preenchido){
        this.cor = cor;
        this.preenchido = preenchido;
    }

    public String getCor(){
        return cor;
    }
    public void steCor(String cor){
        this.cor = cor;
    }

    public boolean isPreenchido(){
        return preenchido;
    }

    public void setPreenchido(boolean preenchido) {
        this.preenchido = preenchido;
    }

    public abstract double getArea();
    public abstract double getPerimetro();

    @Override
    public String toString() {
        return "Forma[" +
                "cor='" + cor + '\'' +
                ", preenchido=" + preenchido +
                ']';
    }
}
