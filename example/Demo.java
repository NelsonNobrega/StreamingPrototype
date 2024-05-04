package example;

import java.util.ArrayList;
import java.util.List;

import streaming.Serie;
import streaming.Filme;
import streaming.Streaming;

public class Demo {
    public static void main(String[] args) {
        List<Streaming> streaming = new ArrayList<>();
        List<Streaming> streamingCopy = new ArrayList<>();

        Filme Filme = new Filme();
        Filme.genero = "comedia";
        Filme.faixaEtaria = "15 anos";
        Filme.avaliacao = "Otimo filme";
        Filme.nome = "Inatividade Paranormal";
        streaming.add(Filme);

        Filme anotherFilme = (Filme) Filme.clone();
        streaming.add(anotherFilme);

        Serie Serie = new Serie();
        Serie.genero = "terror";
        Serie.faixaEtaria = "15 anos";
        Serie.avaliacao = "Serie boa";
        Serie.nome = "Stranger Things"; 
        Serie.temporadas = 4; 
        streaming.add(Serie);

        cloneAndCompare(streaming, streamingCopy);
    }

    private static void cloneAndCompare(List<Streaming> streaming, List<Streaming> streamingCopy) {
        for (Streaming shape : streaming) {
            streamingCopy.add(shape.clone());
        }

        for (int i = 0; i < streaming.size(); i++) {
            if (streaming.get(i) != streamingCopy.get(i)) {
                System.out.println(i + ": Streamings sao generos diferentes (yay!)");
                if (streaming.get(i).equals(streamingCopy.get(i))) {
                    System.out.println(i + ": e eles sao identicos (yay!)");
                } else {
                    System.out.println(i + ": mas eles nao sao identicos (booo!)");
                }
            } else {
                System.out.println(i + ": Streaming generos sao iguais (booo!)");
            }
        }
    }
}