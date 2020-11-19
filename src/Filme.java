public class Filme implements Video 
{
    private int duracao;
    private String nome;
    private int anoLancamento;
    private String idiomaAudio;
    private String idiomaLegenda;
    private boolean estaPausado;

    public Filme(String nome, int duracao, int anoLancamento)
    {
        this.nome = nome;
        this.duracao = duracao;
        this.anoLancamento = anoLancamento;
        this.idiomaAudio = "Portugues (Brasil)";
        this.idiomaLegenda = "Sem legenda";
    }

    @Override
    public void executar() 
    {
        if(estaPausado == true)
        {
            estaPausado = false;
            System.out.println("O filme esta sendo executado novamente.");
        }
        else
        {
            estaPausado = true;
            System.out.println("Voce comecou a assistir o filme " + this.nome);
        }   
    }

    @Override
    public void pausar() 
    {
        estaPausado = true;
        System.out.println("O filme foi pausado.");   
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
       return "\n" + this.nome + " (" + this.anoLancamento + ")" + ". Duracao: " + this.duracao + "min"; 
    }

}