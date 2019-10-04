## N584 – Projeto e Análise de Algoritmos

### Prof. Napoleão Nepomuceno

#### AV2 - Lab02

##### Data do Laboratório: 02/10/2019

##### Márcio Heleno **Matrícula: 1814038**

---

> Entrega do trabalho:
> Data da Entrega: 06/10/2019 (enviar arquivo .odt)

### Exercício 2 - Av2

- **Passo 1:** Implementar o seguinte código em Java ou equivalente em outra linguagem de programação.

```java
import java.util.Random;

public class Exercicio1 {

	static class Crianca {
		public String nome;
		public int idade;
		public char sexo;

		public Crianca() {
			Random randomGenerator = new Random();
			nome = "";
			nome += (char)('A' + randomGenerator.nextInt(26));
			for (int i = 2; i <= 10; i++) {
				nome += (char) ('a' + randomGenerator.nextInt(26));
			}
			idade = 6 + randomGenerator.nextInt(11);
			sexo = (randomGenerator.nextInt(2) == 0) ? 'M' : 'F';
		}
	}

	public static void main(String[] args) {
		int n = 20;
		Crianca[] criancas = new Crianca[n];
		for (int i = 0; i < criancas.length; i++) {
			criancas[i] = new Crianca();
		}
		imprime(criancas);
		//organizaSexo (criancas);
		//organizaIdadeLocal (criancas);
		//organizaIdadeNaoLocal (criancas);
		imprime(criancas);
	}

	static void organizaSexo (Crianca[] A) {
		//to do
	}

	static void organizaIdadeLocal (Crianca[] A) {
		//to do
	}

	static void organizaIdadeNaoLocal (Crianca[] A) {
		//to do
		Crianca[] B = A.clone();
	}

	static void imprime (Crianca[] A) {
		for (int i = 0; i < A.length; i++) {
			System.out.printf("%15s%7d%7c\n", A[i].nome, A[i].idade, A[i].sexo);
		}
		System.out.print("\n\n\n");
	}
}

```

**Passo 2:** O vetor criancas armazena os dados de n crianças de faixa etária de 6 a 16 anos. Cada registro possui um campo nome, um campo idade e um campo sexo. Escreva um algoritmo de reorganização desse vetor de tal forma que todas as crianças do sexo feminino venham antes das crianças do sexo masculino. Seu algoritmo de reorganização deve executar em tempo O(n) e ser local. Escreva a saída do seu programa após a reorganização do vetor. Realize a análise de complexidade do seu algoritmo. Obs.: esta questão deve ser obrigatoriamente realizada em laboratório. (30%)

> implementação:

```java

1. static void organizaSexo (Crianca[] A) {
2.   char pivo = 'F'; // pivo
3.   int x = -1;
4.   for (int i = 0; i < A.length; i++) {
5.       if (A[i].sexo == pivo) {
6.           x++;
7.           troca(A, x, i);
8.       }
9.   }
10. }

------

1. private static void troca(Crianca[] A, int j, int k) {
2.   Crianca temp = A[j];
3.   A[j] = A[k];
4.   A[k] = temp;
5. }

```

> saída:

| nome       | idade | sexo |
| :--------- | :---: | ---: |
| Qbbjerjeoc |  15   |    F |
| Bsletohpdp |   8   |    F |
| Vgrcywrvpl |  15   |    F |
| Ldlitvfduq |  14   |    F |
| Kmgsxnheqz |   8   |    F |
| Xvwxjmsjyw |  13   |    F |
| Aurphgpwly |  12   |    F |
| Ifgosucdqy |   7   |    F |
| Bhxcoxghxn |   6   |    M |
| Dthaaxuunz |   7   |    M |
| Sunfmljpsq |   8   |    M |
| Iwyalvdfjb |  11   |    M |
| Ucjfornyiv |  14   |    M |
| Dhythoqqpt |  11   |    M |
| Jagmydiawc |   8   |    M |
| Btzwoigqaf |  12   |    M |
| Dyzjmvfyep |  16   |    M |
| Phdvamseax |   9   |    M |
| Bwjttnzlii |  14   |    M |
| Vnafeqrdyf |   6   |    M |

> análise:

| linha    | tempo |           vezes |
| :------- | :---: | --------------: |
| 1 função |       |                 |
| 2        |  c1   |               1 |
| 3        |  c2   |               1 |
| 4        |  c3   |           n + 1 |
| 5        |  c4   |               n |
| 6        |  c5   |               n |
| 7 função |  c6   | n = $\Theta(1)$ |

T(n) = $c1 + c2 + c3(n + 1) + c4n + c5n + c6n$ =
T(n) = $4n + 3$ => **linear** T(n) = $\Theta(n)$

**Passo 3:** Escreva um algoritmo de reorganização desse vetor obedecendo a ordem: crianças de 6 a 10 anos; crianças de 11 a 14 anos; e crianças de 15 a 16 anos. Seu algoritmo de reorganização deve executar em tempo O(n) e ser local. Escreva a saída do seu programa após a reorganização do vetor. Realize a análise de complexidade do seu algoritmo. (40%)

**Passo 4:** Escreva um algoritmo de reorganização desse vetor obedecendo a ordem: crianças de 6 a 10 anos; crianças de 11 a 14 anos; e crianças de 15 a 16 anos. Em cada grupo, a ordenação relativa original deve ser preservada. Seu algoritmo de reorganização deve executar em tempo O(n), mas pode ser não local. Escreva a saída do seu programa após a reorganização do vetor. Realize a análise de complexidade do seu algoritmo. (30%)
