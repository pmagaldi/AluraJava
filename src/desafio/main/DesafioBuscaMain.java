package desafio.main;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class DesafioBuscaMain {
    public static void main(String[] args) throws IOException, InterruptedException {
        /* TODO - Crie um programa em Java que utilize as classes HttpClient, HttpRequest e HttpResponse
         * para fazer uma consulta à API do Google Books. Solicite ao usuário que insira o título de um livro, 
         * e exiba as informações disponíveis sobre o livro retornado pela API.
        */
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
        /*TODO - Crie um programa que faça a mesma coisa que o de cima, contudo com a API CoinGecko
         * e exiba a contação atual de uma criptomoeda escolhida pelo usuário
        */

        /*TODO - Crie um programa que faça consulta à API do TheMealDB utilizando as classes acima.
         * Solicite ao usuário que insira o nome de uma receita e exiba as informações disponíveis sobre a mesma.
         */
    }
}
