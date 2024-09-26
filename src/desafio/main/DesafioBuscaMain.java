package desafio.main;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class DesafioBuscaMain {
    public static void main(String[] args) throws IOException, InterruptedException {
        //executar primeira task - comente para não rodar
        //primeiroTask();
        //executar segundo task - comente para não rodar
        //segundoTask();
        //executar terceiro task - comente para não rodar
        terceiroTask();
    }

    /* TODO - Crie um programa em Java que utilize as classes HttpClient, HttpRequest e HttpResponse
        * para fazer uma consulta à API do Google Books. Solicite ao usuário que insira o título de um livro, 
        * e exiba as informações disponíveis sobre o livro retornado pela API.
    */
    public static void primeiroTask() throws IOException , InterruptedException{
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um nome de um livro que deseja buscar: ");
        String nomeLivro = teclado.nextLine();
        System.out.println("Digite a chave da API: ");
        String chave = teclado.nextLine();
        String uri_final = "https://www.googleapis.com/books/v1/volumes?q=" + nomeLivro + ":keyes&key=" + chave;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(uri_final))
                        .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("Sobre o livro " + nomeLivro + ": "+response.body());
        teclado.close();
    }

    /*TODO - Crie um programa que faça a mesma coisa que o de cima, contudo com a API CoinGecko
         * e exiba a contação atual de uma criptomoeda escolhida pelo usuário
    */
    public static void segundoTask() throws IOException, InterruptedException{
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome da coin que deseja pesquisar: ");
        String coin = teclado.nextLine();
        String uri_final = "https://pro-api.coingecko.com/api/v3/coins/" + coin + "?x_cg_pro_api_key="; // Não criei key pois é pago
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(uri_final))
                        .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("Sobre o Coin " + coin + ": " + response.body());
        teclado.close();
    }

    /*TODO - Crie um programa que faça consulta à API do TheMealDB utilizando as classes acima.
         * Solicite ao usuário que insira o nome de uma receita e exiba as informações disponíveis sobre a mesma.
    */
    public static void terceiroTask() throws IOException, InterruptedException{
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome da receita: ");
        String nomeReceita = teclado.nextLine();
        String uri_final = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + nomeReceita;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                            .uri(URI.create(uri_final))
                            .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("Sobre a receita " + nomeReceita + ": " + response.body());
        teclado.close();
    }
}
