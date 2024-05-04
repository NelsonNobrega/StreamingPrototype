package streaming;

import java.util.Objects;

public abstract class Streaming {
    public String genero;
    public String faixaEtaria;
    public String avaliacao;

    public Streaming() {
    }

    public Streaming(Streaming target) {
        if (target != null) {
            this.genero = target.genero;
            this.faixaEtaria = target.faixaEtaria;
            this.avaliacao = target.avaliacao;
        }
    }

    public abstract Streaming clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Streaming)) return false;
        Streaming stream2 = (Streaming) object2;
        return Objects.equals(stream2.genero, genero) &&
                Objects.equals(stream2.faixaEtaria, faixaEtaria) &&
                Objects.equals(stream2.avaliacao, avaliacao);
    }
}
