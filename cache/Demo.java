package cache;

import catching.BundledStreamingCache;
import streaming.Streaming;

public class Demo {
    public static void main(String[] args) {
        BundledStreamingCache cache = new BundledStreamingCache();

        Streaming Streaming1 = cache.get("Filme de comedia");
        Streaming Streaming2 = cache.get("Serie de terror");
        Streaming Streaming3 = cache.get("Serie de terror");

        if (Streaming1 != Streaming2 && !Streaming1.equals(Streaming2)) {
            System.out.println("Filme de comedia != Serie de terror (yay!)");
        } else {
            System.out.println("Filme de comedia == Serie de terror (booo!)");
        }

        if (Streaming2 != Streaming3) {
            System.out.println("Serie de terror streaming are two different objects (yay!)");
            if (Streaming2.equals(Streaming3)) {
                System.out.println("And they are identical (yay!)");
            } else {
                System.out.println("But they are not identical (booo!)");
            }
        } else {
            System.out.println("Generos de streaming são iguais  (booo!)");
        }
    }
}