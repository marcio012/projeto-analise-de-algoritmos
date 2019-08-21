## N584 – Projeto e Análise de Algoritmos
#### Prof. Napoleão Nepomuceno
#### AV1 - Lab02
##### Data do Laboratório: 14/08/2019
##### Data da Entrega: 18/08/2019 (enviar arquivos .odt e .ods)

---

### Exercício 1

Passo 1: Implementar o seguinte código em Java ou
equivalente em outra linguagem de programação.

```java
import java.util.concurrent.TimeUnit;
public class Exercicio1 {
	public static void main(String[] args) {
		System.out.printf("Soma 1\n");
		System.out.printf("%10s%20s%10s\n","n", "solucao", "tempo");
		for (int n = 0; n <= 100; n+=10) {
			soma1(n);
		}
		System.out.printf("Soma 2\n");
		System.out.printf("%10s%20s%10s\n","n", "solucao", "tempo");
		for (int n = 0; n <= 100; n+=10) {
			soma2(n);
		}
		System.out.printf("Soma 3\n");
		System.out.printf("%10s%20s%10s\n","n", "solucao", "tempo");
		for (int n = 0; n <= 100; n+=10) {
			soma3(n);
		}
	}
	static void soma1 (long n) {
		double inicio = System.currentTimeMillis();
		long soma = 0;
		for (long i = 1; i <= n; i++) {
			long termo = 0;
			for (long j = 1; j <= i; j++) {
				try {
					TimeUnit.MILLISECONDS.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				termo = termo + j;
			}
			soma = soma + termo;
		}
		double fim = System.currentTimeMillis();
		double tempo = fim - inicio;
		System.out.printf("%10d%20d%10.0f\n", n, soma, tempo);
	}
	static void soma2 (long n) {
		double inicio = System.currentTimeMillis();
		long soma = 0;
		for (long i = 1; i <= n; i++) {
			long termo = ((1 + i) * i) / 2;
			try {
				TimeUnit.MILLISECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			soma = soma + termo;
		}
		double fim = System.currentTimeMillis();
		double tempo = fim - inicio;
		System.out.printf("%10d%20d%10.0f\n", n, soma, tempo);
	}
	static void soma3 (long n) {
		double inicio = System.currentTimeMillis();
		try {
			TimeUnit.MILLISECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long soma = n * (n+1) * (n+2) / 6;
		double fim = System.currentTimeMillis();
		double tempo = fim - inicio;
		System.out.printf("%10d%20d%10.0f\n", n, soma, tempo);
	}
}
```

* Passo 2: Executar o código e preencher o resultado na
planilha disponibilizada. Obs.: este passo deve ser
realizado obrigatoriamente no laboratório. (10%)

> Resultado:

Feito.

---

* Passo 3: Realizar a análise de complexidade para
cada um dos métodos. Desconsiderar na análise as
instruções do try catch (utilizadas apenas para
simular uma máquina mais lenta) e as de rastreamento
do tempo de execução. As curvas obtidas na planilha
estão de acordo com a complexidade de cada um dos
métodos? Obs.: este passo deve ser realizado
obrigatoriamente no laboratório. (30%)

> Resultado:

---

### Exercício 2

* Passo 1: Implementar o seguinte código em Java ou
equivalente em outra linguagem de programação.

```java
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Exercicio2{
	public static void main(String[] args) {
		int n = 1000;
		int[] A;
		A = criaVetorAleatorio(n);
		double inicio, fim, tempo;
		inicio = System.currentTimeMillis();
		metodo(A, n);
		fim = System.currentTimeMillis();
		tempo = fim - inicio;
		System.out.printf("Tempo: %1.0f", tempo);
	}

	static double metodo (int[] vetor, int n) {
		double v = 1;
		for (int i = 0; i < n; i++) {
			try {
				TimeUnit.MILLISECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			v = v * vetor[i];
			if (v == 0) {
				return 0;
			}
		}
		return v;
	}

	static int[] criaVetorAleatorio (int n) {
		Random randomGenerator = new Random();
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = randomGenerator.nextInt(100);
		}
		return A;
	}
}

```


* Passo 2: O que exatamente a função metodo está
computando? (10%)

> Resultado:


---

* Passo 3: Executar o código 10 vezes e copiar a
saída de cada execução do programa aqui abaixo.
Visto que o tamanho do problema não se modifica,
o que justifica a grande variação do tempo de uma
execução para outra? (20%)

> Resultado:


---

* Passo 4: Realizar a análise de complexidade de
melhor e pior casos para o método. Obs.: Desconsiderar
na análise as instruções do try catch (utilizadas
apenas para simular uma máquina mais lenta) e as de
rastreamento do tempo de execução. (20%)

> Resultado:


---

* Passo 5: Se o vetor A, ao invés de 1000 elementos,
tivesse 1.000.000 elementos, sua complexidade de
tempo aumentaria? (10%)

