## N584 – Projeto e Análise de Algoritmos
### Prof. Napoleão Nepomuceno
#### AV1 - Lab05
##### Data do Laboratório: 04/09/2019
##### Márcio Heleno **Matrícula: 1814038**

---

> Entrega do trabalho:
Data da Entrega: 29/09/2019 (enviar arquivo .odt)

### Exercício 1 - Av2

- **Passo 1:** Implementar o seguinte código em Java ou equivalente em outra linguagem de programação.

```java
import java.util.Random;
public class HeapSort {
	public static void main(String[] args) {
		int[] A = {86, 78, 36, 61, 67, 34, 58, 42, 35, 59, 62, 28, 60, 37, 12};
		System.out.println("Vetor A:");
		imprimeVetor(A);
		System.out.println("Heap A:");
		imprimeHeap(A);
		//int[] B = criaVetorAleatorio(15);
		//System.out.println("------------------------------------------------------------------------------------------");
		//System.out.println("Vetor B:");
		//imprimeVetor(B);
		//imprimeHeap(B);
	}

	static int left (int i) {
		// to do
	}

	static int right (int i) {
		// to do
	}

	static void maxheapfy (int[] V, int i) {
		int l = left(i);
		int r = right(i);
		int m = i;
		// to do
	}

	static void buildmaxheap (int[] V) {
		// to do
	}

	static int[] criaVetorAleatorio (int n) {
		Random randomGenerator = new Random();
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = randomGenerator.nextInt(10 * n);
		}
		return A;
	}

	static void imprimeVetor (int[] A) {
		for (int i = 0; i < A.length; i++) {
			System.out.printf("%6d", A[i]);
		}
		System.out.print("\n\n\n");
	}

	static void imprimeHeap (int[] A) {
		int h = (int) (Math.log(A.length) / Math.log(2));
		int espacos = calculaEspacos(h);
		for (int i = 0; i <= h; i++) {
			for (int j = 1; j <= Math.pow(2, i); j++) {
				if ((int) (Math.pow(2, i)) - 1 + (j-1) >= A.length) break;
				imprimeEspacos(espacos);
				System.out.printf("%3d", A[(int) (Math.pow(2, i)) - 1 + (j-1)]);
				imprimeEspacos(espacos);
				if (j < Math.pow(2, i)) {
					System.out.printf("%3s", "");
				}
			}
			espacos = (espacos - 3) / 2;
			System.out.println();
		}
	}

	static int calculaEspacos (int h) {
		int espacos = 3;
		for (int i = 1; i <= h; i++) {
			espacos = 2 * espacos + 3;
		}
		return espacos;
	}

	static void imprimeEspacos (int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print(" ");
		}
	}

}

```

**Passo 2:** Execute o código e escreva a saída do programa aqui. O vetor A é um heap máximo? Justifique sua resposta. (5%)

> Saída:

```

Vetor A:
    86    78    36    61    67    34    58    42    35    59    62    28    60    37    12


Heap A:
                                              86
                      78                                              36
          61                      67                      34                      58
    42          35          59          62          28          60          37          12

```


**Passo 3:**  Implemente as funções left e right que retornam, respectivamente, o índice do filho da esquerda e o índice do filho da direita de um nó de índice i. Imprima os elementos A[left(2)] e A[right(4)]. (10%)

> Saída:

```
Left A(2):
34
Right A(4):
62
```

**Passo 4:** Implemente a função maxheapfy. (15%)



**Passo 5:** Antes de imprimir o vetor, aplique o procedimento maxheapfy ao índice 0 do vetor A e escreva a saída do programa aqui. Houve modificação no vetor A? Por que isso aconteceu? (10%)


**Passo 6:** Antes de imprimir o vetor, aplique o procedimento maxheapfy ao índice 2 do vetor A e escreva a saída do programa aqui. O vetor A passou a ser um heap máximo? Por que isso aconteceu? (10%)



**Passo 7:** Antes de imprimir o vetor, aplique o procedimento maxheapfy ao índice 2 do vetor A e, em seguida, ao índice 5. O vetor A passou a ser um heap máximo? Por que isso aconteceu? (10%)



**Passo 8:** Antes de imprimir o vetor, aplique o procedimento maxheapfy ao índice 5 do vetor A e, em seguida, ao índice 2. O vetor A passou a ser um heap máximo? Por que isso aconteceu? (10%)



**Passo 9:** Crie um vetor B aleatório, imprima cada um de seus elementos e sua representação em heap (Obs.: código comentado no método main). O vetor B é um heap máximo? (10%)


**Passo 10:** Implemente o procedimento buildmaxheap que, dado um vetor qualquer, reorganiza os elementos do vetor para que ele possua a propriedade de maxheap. Apresente seu código aqui. (15%)


**Passo 11:** Crie um vetor B aleatório, aplique o procedimento buildmaxheap, imprima cada um de seus elementos e sua representação em heap. O vetor B é um heap máximo? (5%)
