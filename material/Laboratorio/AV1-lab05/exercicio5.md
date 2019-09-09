## N584 – Projeto e Análise de Algoritmos
### Prof. Napoleão Nepomuceno
#### AV1 - Lab05
##### Data do Laboratório: 04/09/2019
##### Márcio Heleno **Matrícula: 1814038**

---

> Entrega do trabalho:
Data da Entrega: 08/09/2019 (enviar arquivo .odt)

### Exercício 5

- **Passo 1:** Implementar o seguinte código em Java ou equivalente em outra linguagem de programação.

```java
public class Exercicio2 {
	public static void main(String[] args) {
		System.out.println("Imprime1");
		imprime1(4);
		System.out.println("Imprime2");
		imprime2(4);
		System.out.println("Imprime3");
		imprime3(4);
	}

	static void imprime1(int n) {
		if (n != 1) {
			System.out.println(n);
			imprime1(n/2);
		} else {
			System.out.println(1);
		}
	}

	static void imprime2(int n) {
		if (n != 1) {
			System.out.println(n);
			imprime2(n/2);
			imprime2(n/2);
		} else {
			System.out.println(1);
		}
	}

	static void imprime3(int n) {
		if (n != 1) {
			System.out.println(n);
			imprime3(n/2);
			imprime3(n/2);
			imprime3(n/2);
			imprime3(n/2);
		} else {
			System.out.println(1);
		}
	}
}
```

**Passo 2:** Executar o código e escrever a saída abaixo. Para n = 4, qual a quantidade de chamadas recursivas geradas durante a execução completa de cada um dos métodos? (5%)

> Saída do Impreme 1:

| output |
| ------ |
| 4      |
| 2      |
| 1      |

> Saída do Impreme 2:

| output |
| ------ |
| 4      |
| 2      |
| 1      |
| 1      |
| 2      |
| 1      |
| 1      |

> Saída do Impreme 3:

| output |
| ------ |
| 4      |
| 2      |
| 1      |
| 1      |
| 1      |
| 1      |
| 2      |
| 1      |
| 1      |
| 1      |
| 1      |

**Passo 3:** Qual a equação de recorrência do método imprime1? (10%)

$T(n) = T(\frac{n}{2}) + c$ $\Rightarrow$ $T(n) = T(\frac{n}{2}) + 4$

**Passo 4:** Resolva a equação de recorrência do método imprime1 pelo teorema mestre. (15%)

$T(n) = T(\frac{n}{2}) + 4$ $\Rightarrow$ $ a = 1, b = 2, f(n) = 4$

logo, $\Rightarrow$ $n \log_b a = n \log_2 1$ $\Rightarrow$ $n^0 = 1$

aplica-se o **caso 2** $f(n) = \Theta(n^{\log_b a} = \Theta(n)$

solução da recorencia, $\Rightarrow$ $t(n) = \Theta(\lg n)$

**Passo 5:** Qual a equação de recorrência da função imprime2? (10%)

$T(n) = 2T(\frac{n}{2}) + c$ $\Rightarrow$ $T(n) = 2T(\frac{n}{2}) + 4$

**Passo 6:** Resolva a equação de recorrência do método imprime2 pelo teorema mestre. (15%)

$T(n) = 2T(\frac{n}{2}) + 4$ $\Rightarrow$ $ a = 2, b = 2, f(n) = 4$

logo, $\Rightarrow$ $n \log_b a = n \log_2 2$ $\Rightarrow$ $n^1 = n$

aplica-se o **caso 2** $f(n) = \Theta(n^{\log_b a} = \Theta(n)$

solução da recorencia, $\Rightarrow$ $t(n) = \Theta(\lg n)$

**Passo 7:** Qual a equação de recorrência da função imprime3? (10%)

$T(n) = 4T(\frac{n}{2}) + c$ $\Rightarrow$ $T(n) = 4T(\frac{n}{2}) + 4$

**Passo 8:** Resolva a equação de recorrência do método imprime3 pelo teorema mestre. (15%)

$T(n) = 4T(\frac{n}{2}) + 4$ $\Rightarrow$ $ a = 4, b = 2, f(n) = 4$

logo, $\Rightarrow$ $n \log_b a = n \log_4 2$ $\Rightarrow$ $n^{\frac{1}{2}} = n$

aplica-se o **caso 2** $f(n) = \Theta(n^{\log_b a} = \Theta(n)$

solução da recorencia, $\Rightarrow$ $t(n) = \Theta(\lg n^{\frac{1}{2}})$

Passo 9: Sejam T1(n), T2(n) e T3(n) as funções que representam o custo dos métodos imprime1, imprime2 e imprime3 respectivamente. Para cada item abaixo, indicar se a afirmação é falsa ou verdadeira, justificando sua resposta. (20%)

(a) $T1(n) = O(T2(n))$
(b) $T1(n) = \Omega(T2(n))$
(c) $T3(n) = O(T2(n))$
(d) $T3(n) = \Omega(T2(n))$
