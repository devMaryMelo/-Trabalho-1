public class Serie implements Video 
{
    int duracao;
    String nome;
    int temporadas;
    int episodios;
    String idiomaAudio;
    String idiomaLegenda;
    boolean estaPausado;

    public Serie(String nome, int temporadas, int episodios)
    {
        this.nome = nome;
        this.temporadas = temporadas;
        this.episodios = episodios;
        this.idiomaAudio = "Ingles (Original)";
        this.idiomaLegenda = "Portugues (Brasil)";
    }

    @Override
    public void executar() 
    {
        if(estaPausado == true)
        {
            estaPausado = false;
            System.out.println("A serie esta sendo executada novamente.");
        }
        else
        {
            System.out.println("Voce comecou a assistir a serie " + this.nome);
        }   
    }

    @Override
    public void pausar() 
    {
        estaPausado = true;
        System.out.println("A serie foi pausada."); 
    }

    @Override
    public void mudarAudio() 
    {
        if(idiomaAudio == "Ingles (Original)")
       {
            this.idiomaAudio = "Portugues (Brasil)"; 
            System.out.println("Audio definido como Portugues (Brasil).");
       }
       else if(idiomaAudio == "Portugues (Brasil)")
       {
            this.idiomaAudio = "Ingles (Original)";
            System.out.println("Audio definido como Ingles (Original).");
       }
    }

    @Override
    public void mudarLegenda() 
    {
        if(idiomaLegenda == "Portugues (Brasil)")
        {
            this.idiomaLegenda = "Sem legenda"; 
            System.out.println("Legenda definida como sem legenda.");
        }
        else if(idiomaLegenda == "Sem legenda")
        {
            this.idiomaLegenda = "Portugues (Brasil)";
            System.out.println("Legenda definida como Portugues (Brasil).");
        }
    }

    @Override
    public String exibirDetalhes() 
    {  
        return "\n" + this.nome + " (" + this.temporadas + " temporadas). " + this.episodios + " episodios.";
    }
    
}
