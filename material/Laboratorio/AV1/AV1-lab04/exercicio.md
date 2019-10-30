## N584 – Projeto e Análise de Algoritmos
### Prof. Napoleão Nepomuceno
#### AV1 - Lab04
##### Data do Laboratório: 28/08/2019

> Data da Entrega: 01/09/2019 (enviar arquivos .odt)

### Exercício 1

- **Passo 1:** Implementar o seguinte código em Java ou equivalente em outra linguagem de programação.

```java
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Exercicio1 {
	public static void main(String[] args) {

		int[] A;
		double inicio1, fim1, tempo1;
		double inicio2, fim2, tempo2;

		System.out.printf("%5s%10s%10s%10s%10s\n","n", "soma1", "tempo1", "soma2", "tempo2");
		System.out.println("-------------------------");
		for (int n = 1; n <= 50; n++) {
			A = criaVetorAleatorio(n);
			inicio1 = System.currentTimeMillis();
			int soma1 = soma1(A, n);
			fim1 = System.currentTimeMillis();
			tempo1 = fim1 - inicio1;
			inicio2 = System.currentTimeMillis();
			int soma2 = soma2(A, 0, n-1);
			fim2 = System.currentTimeMillis();
			tempo2 = fim2 - inicio2;
			System.out.printf("%5d%10d%10.0f%10d%10.0f\n", n, soma1, tempo1, soma2, tempo2);
		}
	}

	static int soma1 (int[] vetor, int n) {
		int total = 0;
		for (int i = 0; i < n; i++) {
			try {
				TimeUnit.MILLISECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			total = total + vetor[i];
		}
		return total;
	}

	static int soma2 (int[] vetor, int i, int f) {
		//to do
	}
	static int[] criaVetorAleatorio (int n) {
		Random randomGenerator = new Random();
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = randomGenerator.nextInt(100*n);
		}
		return A;
	}

}
```

- **Passo 2:** Implementar o código para a função soma2 utilizando a abordagem de divisão e conquista, onde o problema é dividido em 3 subproblemas recursivamente. O cálculo dos pontos médios m1 e m2 deve ser realizado como: m1 = (2*i + f) / 3 e m2 = (i + 2*f) / 3. Inclua o sleep(1) antes da combinação dos resultados dos subproblemas. Apresentar aqui o seu código e a saída do programa. (15%)

- **Passo 3:** Realizar a análise de complexidade da função soma1. (10%)

- **Passo 4:** Montar a equação de recorrência para a função soma2? (10%)

- **Passo 5:** Resolver a equação de recorrência por uma árvore de recursão. (15%)

- **Passo 6:** Sejam T1(n) e T2(n) as funções que representam o custo dos algoritmos soma1 e soma2 respectivamente. Para cada item abaixo, indicar se a afirmação é falsa ou verdadeira, justificando sua resposta. (10%)

(a) T1(n) = Θ(n)
(b) T1(n) = Ο(n2)
(c) T1(n) = Ω(n2 lg n)
(d) T1(n) = Ο(T2(n))
(e) T1(n) = Ω(T2(n))
