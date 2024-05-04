package catching;

import java.util.HashMap;
import java.util.Map;

import streaming.Filme;
import streaming.Serie;
import streaming.Streaming;

public class BundledStreamingCache {
    private Map<String, Streaming> cache = new HashMap<>();

    public BundledStreamingCache() {
        Filme Filme = new Filme();
        Filme.genero = "comedia";
        Filme.faixaEtaria = "15 anos";
        Filme.avaliacao = "mt bom";
        Filme.nome = "Norbit";

        Serie Serie = new Serie();
        Serie.genero = "terror";
        Serie.faixaEtaria = "15 anos";
        Serie.avaliacao = "Serie boa";
        Serie.nome = "Stranger Things"; 
        Serie.temporadas = 4; 
        
        cache.put("Filme de comedia", Filme);
        cache.put("Serie de terror", Serie);
    }

    public Streaming put(String key, Streaming shape) {
        cache.put(key, shape);
        return shape;
    }

    public Streaming get(String key) {
        return cache.get(key).clone();
    }
}
