package streaming;

public class Serie extends Streaming {
    public int temporadas;
    public String nome;

    public Serie() {
    }

    public Serie(Serie target) {
        super(target);
        if (target != null) {
            this.temporadas = target.temporadas;
        }
    }

    @Override
    public Streaming clone() {
        return new Serie(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Serie) || !super.equals(object2)) return false;
        Serie Serie2 = (Serie) object2;
        return Serie2.temporadas == temporadas;
    }
}
