package streaming;

public class Filme extends Streaming {
    public int duração;
    public String nome;

    public Filme() {
    }

    public Filme(Filme target) {
        super(target);
        if (target != null) {
            this.duração = target.duração;
        }
    }

    @Override
    public Streaming clone() {
        return new Filme(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Filme) || !super.equals(object2)) return false;
        Filme Filme2 = (Filme) object2;
        return Filme2.duração == duração;
    }
}
