


#  Map/ LinkedHashMap - Java

> Na contagem de votos de uma eleição, são gerados vários registros de votação contendo o nome do candidato e a quantidade de votos (formato .csv) que ele obteve em uma urna de votação. Você deve fazer um programa para ler os registros de votação a partir de um arquivo, e daí gerar um relatório consolidado com os totais de cada candidato.

Exercício do curso "**Java COMPLETO Programação Orientada a Objetos + Projetos**" pela Udemy, com o professor **Nélio Alves**.

**Exemplo do arquivo .csv origem:**

	Alex Blue,15
	Maria Green,22
	Bob Brown,21
	Alex Blue,30
	Bob Brown,15
	Maria Green,27
	Maria Green,22
	Bob Brown,25
	Alex Blue,31

**Resultado esperado:**

    Enter file full path: c:\temp\in.txt
    Alex Blue: 76
    Maria Green: 71
    Bob Brown: 61

*Criei o Map "registroVotacao" para gravar os registros, usei o FileReader para ler os arquivos, fiz a separação por linhas, depois por vírgulas. Adicionei os valores em variáveis "nome" e "votos". Após isso usei o método ".containsKey" para checar se já existe a chave no Map com os registros de votação. Caso a chave já exista, o valor lido será somado ao valor existente no Map. Usei o LinkedHashMap para manter a ordem de inserção, como foi dado no exemplo. A minha versão recebe o diretório no código ao invés de recebê-lo por uma entrada.*


### Resultado:

	Nome: Alex Blue, total de votos: 76
	Nome: Maria Green, total de votos: 71
	Nome: Bob Brown, total de votos: 61
---
Ferramentas utilizadas: 
<p align="left">
<a href="https://www.java.com" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> </a>
<a href="https://www.w3.org/html/" target="_blank" rel="noreferrer"> 
 <a href="https://git-scm.com/" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/git-scm/git-scm-icon.svg" alt="git" width="40" height="40"/>