package principal;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
import principal.modelo.*;

public class Programa{

    public static void main(String[] args) throws FileNotFoundException {
    	
    	Catalogo catalogo = new Catalogo();

        //leitura de arquivos
        String arquivoOrigemLivros = "C:\\_javaws\\Biblioteca\\src\\livros.csv";
		File arquivo = new File(arquivoOrigemLivros);
		Scanner leitor = new Scanner(arquivo);
		String arquivoOrigemClientes = "C:\\_javaws\\Biblioteca\\src\\clientes.csv";
		File arquivoClientes = new File(arquivoOrigemClientes);
		Scanner leitorClientes = new Scanner(arquivoClientes);

        //gravação de arquivos

        String arquivoDestinoLivros = "C:\\_javaws\\Biblioteca\\src\\livros.csv";
		Formatter gravador = new Formatter(arquivoDestinoLivros);
        while(leitor.hasNextLine()) {
			String linha = leitor.nextLine();
			String[] vetor = linha.split(";");
			
			//Imprimir no console/terminal
			System.out.println("Banco: " + linha);
			
			//Gravar no arquivo de destino
			gravador.format("Banco: " + linha + "\n");
			gravador.format("\n");
        }


        

       
        leitor.close();
        gravador.close();
        
            
        
        

    }
}

