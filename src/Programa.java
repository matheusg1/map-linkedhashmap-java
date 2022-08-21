import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class Programa {
    public static void main(String[] args) throws Exception{
        String diretorio = "C:\\temp\\votos.csv";

        Map<String, Integer> registroVotacao = new LinkedHashMap<>();

        try(BufferedReader br = new BufferedReader(new FileReader(diretorio))){
            String leitorLinha = br.readLine();

            while(leitorLinha != null){
                String[] linhas = leitorLinha.split("\n");

                for (String linha : linhas) {
                    String[] nomeVotos = linha.split(",");

                    String nome = nomeVotos[0];
                    Integer votos = Integer.parseInt(nomeVotos[1]);

                    if(registroVotacao.containsKey(nome))
                        registroVotacao.put(nome, registroVotacao.get(nome) + votos);
                    else
                        registroVotacao.put(nome, votos);
                }   
                leitorLinha = br.readLine();
            }
        }
        catch(IOException e){
            System.out.println("Erro!");
            System.out.println(e.getMessage());
        }
        finally{
            for (String nome : registroVotacao.keySet()) {
                System.out.println("Nome: " + nome + ", total de votos: " + registroVotacao.get(nome));
            }
        }
    }
}