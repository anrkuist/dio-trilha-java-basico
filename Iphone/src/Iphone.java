public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private String musicaAtual;
    private boolean tocando;
    private boolean chamadaAtiva;
    private String paginaAtual;
    private int numeroAbas;

    public Iphone() {
        this.musicaAtual = "";
        this.tocando = false;
        this.chamadaAtiva = false;
        this.paginaAtual = "";
        this.numeroAbas = 0;
    }

    @Override
    public void tocar() {
        if (!musicaAtual.isEmpty()) {
            tocando = true;
            System.out.println("Tocando música: " + musicaAtual);
        } else {
            System.out.println("Nenhuma música selecionada");
        }
    }

    @Override
    public void pausar() {
        if (tocando) {
            tocando = false;
            System.out.println("Música pausada");
        } else {
            System.out.println("Nenhuma música está tocando");
        }
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Música selecionada: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
        chamadaAtiva = true;
    }

    @Override
    public void atender() {
        if (chamadaAtiva) {
            System.out.println("Chamada atendida");
        } else {
            System.out.println("Nenhuma chamada para atender");
        }
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        this.paginaAtual = url;
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        numeroAbas++;
        System.out.println("Nova aba adicionada. Total de abas: " + numeroAbas);
    }

    @Override
    public void atualizarPagina() {
        if (!paginaAtual.isEmpty()) {
            System.out.println("Atualizando página: " + paginaAtual);
        } else {
            System.out.println("Nenhuma página para atualizar");
        }
    }
}