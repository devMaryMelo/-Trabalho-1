public class Main {
    public static void main(String[] args) throws Exception 
    {
        Filme filme1 = new Filme("Star Wars: Episodio VI - O Retorno do Jedi", 136, 1983);

        System.out.println(filme1.exibirDetalhes());
        filme1.executar();
        filme1.pausar();
        filme1.mudarAudio();
        filme1.mudarLegenda();
        filme1.executar();
        
        Filme filme2 = new Filme("Matrix", 136, 1999);

        System.out.println(filme2.exibirDetalhes());
        filme2.mudarAudio();
        filme2.mudarLegenda();
        filme2.executar();
        
        Serie serie1 = new Serie("Breaking Bad", 5, 62);   
        
        System.out.println(serie1.exibirDetalhes());
        serie1.executar();
        serie1.pausar();
        serie1.mudarAudio();
        serie1.mudarLegenda();  

        Serie serie2 = new Serie("Dark", 3, 26);

        System.out.println(serie2.exibirDetalhes());
        serie2.executar();
        serie2.pausar();
        serie2.mudarAudio();
        serie2.executar();
        serie2.pausar();
        serie2.mudarLegenda();
        serie2.executar();
    }
}
