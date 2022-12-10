package System.GFoce.br.CsobreCargaMetodos.Test;

import System.GFoce.br.CsobreCargaMetodos.Dominio.Anime;

public class AnimeTest {


    public static void main(String[] args) {

        Anime anime = new Anime();

        anime.init("youg you", 55, "magia");
        anime.init("youg you", 55, "magia", "luta");

        anime.impreAnime();
    }

}
