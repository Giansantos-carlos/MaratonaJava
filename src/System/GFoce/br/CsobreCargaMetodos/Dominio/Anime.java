package System.GFoce.br.CsobreCargaMetodos.Dominio;

public class Anime {
    private String nome;
    private int episodios;
    private String genero;

    private String categoria;

    public void impreAnime(){
        System.out.println(nome);
        System.out.println(episodios);
        System.out.println(genero);
        System.out.println(categoria);
    }

    public void init(String nome, int episodios, String  genero){
        this.nome = nome;
        this.episodios = episodios;
        this.genero =  genero;
    }

    public void init(String nome, int episodios, String  genero, String categoria){
        this.nome = nome;
        this.episodios = episodios;
        this.genero =  genero;
        this.categoria = categoria;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
}
