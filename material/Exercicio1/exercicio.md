## N584 – Projeto e Análise de Algoritmos
### Prof. Napoleão Nepomuceno
#### AV1 - Lab01
##### Data do Laboratório: 07/08/2019

> Entrega do trabalho:
Data da Entrega: 11/08/2019 (enviar arquivo.odt)

### Exercício 1

- **Passo 1**: Implementar o seguinte código em
Java ou equivalente em outra linguagem de
programação.

```java
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe o valor de n: ");
		long n = scanner.nextLong();
		scanner.close();
		soma1(n);
		//soma2(n);
		//soma3(n);
	}

	static void soma1 (long n) {
		System.out.println("soma1");
		System.out.printf("%10s%20s%10s\n","n", "solucao", "tempo");
		double inicio = System.currentTimeMillis();
		long soma = 0;
		for (long i = 1; i <= n; i++) {
			long termo = 0;
			for (long j = 1; j <= i; j++) {
				termo = termo + j;
			}
			soma = soma + termo;
		}
		double fim = System.currentTimeMillis();
		double tempo = fim - inicio;
		System.out.printf("%10d%20d%10.0f\n", n, soma, tempo);
	}

	static void soma2 (long n) {
		System.out.println("soma2");
		System.out.printf("%10s%20s%10s\n","n", "solucao", "tempo");
		double inicio = System.currentTimeMillis();
		long soma = 0;
		for (long i = 1; i <= n; i++) {
			long termo = ((1 + i) * i) / 2;
			soma = soma + termo;
		}
		double fim = System.currentTimeMillis();
		double tempo = fim - inicio;
		System.out.printf("%10d%20d%10.0f\n", n, soma, tempo);
	}

	static void soma3 (long n) {
		System.out.println("soma3");
		System.out.printf("%10s%20s%10s\n","n", "solucao", "tempo");
		double inicio = System.currentTimeMillis();
		long soma = n * (n+1) * (n+2) / 6;
		double fim = System.currentTimeMillis();
		double tempo = fim - inicio;
		System.out.printf("%10d%20d%10.0f\n", n, soma, tempo);
	}

}
```

---

- **Passo 2:** Executar o código para cada valor de
n = 1.000, 10.000, 100.000 (método soma1).

Para cada execução, copiar abaixo a saída do programa.
Explicar porque o tempo de execução cresce à medida que
o valor de n cresce. Obs.: este passo deve ser realizado
obrigatoriamente no laboratório. (20%)

> Soma 1 instancia 1000:

| n    |  solução  | tempo |
| :--- | :-------: | ----: |
| 1000 | 167167000 |    12 |

> Soma 1 instancia 10.000:

| n     |   solução    | tempo |
| :---- | :----------: | ----: |
| 10000 | 166716670000 |    32 |

> Soma 1 instancia 100.000:

| n      |     solução     | tempo |
| :----- | :-------------: | ----: |
| 100000 | 166671666700000 |  3353 |

> Explicação:

De acordo com o tamanho da instancia eleva-se o tempo isso eleva o aumento das interações do laço levando mais tempo de execurção isso conclui-se pois
e uma função Quadrática **O(nˆ2)**

---

- **Passo 3:** Executar o código 3 vezes para o valor de n = 100.000 (método soma1).

Para cada execução, copiar abaixo a saída do programa.
Explicar porque o tempo de execução varia mesmo para valores iguais de n?
Obs.: este passo deve ser realizado obrigatoriamente no laboratório. (20%)

> Soma 1 instancia 100.000 x 3:

| n      |     solução     | tempo |
| :----- | :-------------: | ----: |
| 100000 | 166671666700000 |  2484 |

> Soma 1 instancia 100.000 x 3:

| n      |     solução     | tempo |
| :----- | :-------------: | ----: |
| 100000 | 166671666700000 |  2524 |

> Soma 1 instancia 100.000 x 3:

| n      |     solução     | tempo |
| :----- | :-------------: | ----: |
| 100000 | 166671666700000 |  2608 |

> Explicação

A única coisa que se altera e o tempo de processamento, como a máquina tem outros processos ela não dar uma constância no tempo de execurção, isso pode ser devido a muito fatores relacionando a maquina que estar sendo executado o algoritmo, pois ele pode ter varios processo sendo executados paralelamente.

---

- **Passo 4:** Descomentar o método soma2.

Executar o código para n = 100.000 (métodos soma1 e soma2). Copiar abaixo a saída do programa. Explicar porque o método soma2 possui tempo de execução inferior ao método soma1, embora o problema a ser resolvido, o tamanho da instância (valor de n), a máquina e a linguagem de programação sejam todos os mesmos? Obs.: este passo deve ser realizado obrigatoriamente no laboratório. (20%)

> Soma 1 e 2 instancia 1000 :

- soma 1:

| n      |     solução     | tempo |
| :----- | :-------------: | ----: |
| 100000 | 166671666700000 |  4155 |

- soma 2

| n      |     solução     | tempo |
| :----- | :-------------: | ----: |
| 100000 | 166671666700000 |     5 |

---

> Explicação :

Ha uma diferença entre as duas implementações estar na complexidade dos
algoritmos onde eles transformados em funções matematicas usam de uma funções
quadratica e o outro em uma função logaritmica, ou seja um e **O(n^2)**,
**O(log n)** e o outro e uma.

---

- **Passo 5:** Comentar o método soma1 e descomentar o método soma3.

Executar o código para n = 100.000, 1.000.000, 10.000.000
(métodos soma2 e soma3). Copiar abaixo a saída do programa.
Explicar porque o tempo de execução do método soma3 não
cresce embora o valor de n esteja crescendo? Obs.:
este passo deve ser realizado obrigatoriamente no
laboratório. (20%)

> Soma 2 e 3, instancia 100000:

- Soma 2

| n      |     solução     | tempo |
| :----- | :-------------: | ----: |
| 100000 | 166671666700000 |     6 |

- Soma 3

| n      |     solução     | tempo |
| :----- | :-------------: | ----: |
| 100000 | 166671666700000 |     0 |

> Soma instancia 1.000.000:

- Soma 2

| n       |     solução     | tempo |
| :------ | :-------------: | ----: |
| 1000000 | 166671666700000 |     8 |

- Soma 3

| n       |     solução     | tempo |
| :------ | :-------------: | ----: |
| 1000000 | 166671666700000 |     0 |

> Soma instancia 10.000.000:

- Soma 2

| n        |     solução     | tempo |
| :------- | :-------------: | ----: |
| 10000000 | 166671666700000 |    19 |

- Soma 3

| n        |     solução     | tempo |
| :------- | :-------------: | ----: |
| 10000000 | 166671666700000 |     0 |

> Explicação :

Trata-se de uma função constante ou seja **O(1)**.

---

- **Passo 6:** Comentar de forma crítica a seguinte afirmativa:

“a complexidade de um algoritmo depende de diversos fatores como
tecnologia, hardware e tamanho do problema”. (20%)

> Explicação :

Sim isso e uma verdade, mas a complexidade se divide em espacial e temporal,
pois.
