## N584 – Projeto e Análise de Algoritmos

### Prof. Napoleão Nepomuceno

#### AV2 - Lab02

##### Data do Laboratório: 09/10/2019

##### Márcio Heleno **Matrícula: 1814038**

> Entrega do trabalho:
> Data da Entrega: 13/10/2019 (enviar arquivo .odt)

### Exercício 3 - Av2

- **Passo 1:** Implementar o seguinte código em Java ou equivalente em outra linguagem de programação.

```java
package website.marcioheleno.av2.exercicio3;

public class Exercicio1 {

    static int[] qtde;

    public static void main(String[] args) {
        int troco = 33;
        int[] padrao = {1, 7, 17, 25};
        double inicio, fim, tempo;
        int q;

        inicio = System.currentTimeMillis();
        q = trocoDinamico(troco, padrao);
        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        if (q == Integer.MAX_VALUE) {q = -1;}
        System.out.printf("%-15s%10s%10s\n", "Método", "Qtde", "Tempo");
        System.out.printf("%-15s%10d%10.2f\n\n", "Dinâmico", q, tempo);

        inicio = System.currentTimeMillis();
        qtde = new int[troco+1];
        for (int t = 0; t <= troco; t++) {
            qtde[t] = -1;
        }
        q = trocoMemoization(troco, padrao);
        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        if (q == Integer.MAX_VALUE) {q = -1;}
        System.out.printf("%-15s%10s%10s\n", "Método", "Qtde", "Tempo");
        System.out.printf("%-15s%10d%10.2f\n\n", "Memoization", q, tempo);

        inicio = System.currentTimeMillis();
        q = trocoRecursivo(troco, padrao);
        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        if (q == Integer.MAX_VALUE) {q = -1;}
        System.out.printf("%-15s%10s%10s\n", "Método", "Qtde", "Tempo");
        System.out.printf("%-15s%10d%10.2f\n\n", "Recursivo", q, tempo);
    }

    static int trocoRecursivo(int troco, int[] padrao) {
        if (troco != 0) {
            int qMin = Integer.MAX_VALUE;
            for (int i = 0; i < padrao.length; i++) {
                if (troco - padrao[i] >= 0) {
                    int q = trocoRecursivo(troco - padrao[i], padrao) + 1;
                    if (q < 0) {q = Integer.MAX_VALUE;}
                    if (q < qMin) {qMin = q;}
                }
            }
            return qMin;
        }
        return 0;
    }

    static int trocoMemoization(int troco, int[] padrao) {
        // to do
        return 0;
    }

    static int trocoDinamico(int troco, int[] padrao) {
        int[] q = new int[troco + 1];
        int[] c = new int[troco + 1];
        for (int t = 1; t <= troco; t++) {
            q[t] = Integer.MAX_VALUE;
            for (int p = 0; p < padrao.length; p++) {
                // to do
            }
        }
        // imprimeTroco(c, troco);
        System.out.println();
        return q[troco];
    }

    static void imprimeTroco(int[] c, int troco) {
        // to do
    }

}
```

**Passo 2:** Considere o problema do troco que, dados um padrão de cédulas P e um valor de troco t, deseja-se determinar a quantidade mínima de cédulas necessárias para perfazer o troco. Seja q[t] a quantidade mínima de cédulas necessárias para satisfazer o troco t no padrão de cédulas P. Dada a definição recursiva de q[t] abaixo e sua implementação na função trocoRecursivo, explique:

a) O que significa $p_i \in P:p_i≤t$ ? (5%)
Faz a verifica $p_i$ pertence ao vetor P e se ele e maior que o troco.
b) O que significa $q[t-p_i]+1$? (5%)
c) Para que serve o teste `if (q < 0) q = Integer.MAX_VALUE;` ? (5%)
d) Para que serve o teste `if (q < qMin) qMin = q;` ? (5%)

<!-- Todo: continuar com a formula.  -->
<!-- \$q[t]={■(0,&"se" t=0;@█(min@p_i∈P:p_i≤t){q[t-p_i]+1},&"caso contrário." ) -->

```Java
static int trocoRecursivo(int troco, int[] padrao) {
	if (troco != 0) {
		int qMin = Integer.MAX_VALUE;
		for (int i = 0; i < padrao.length; i++) {
			if (troco - padrao[i] >= 0) {
				int q = trocoRecursivo(troco - padrao[i], padrao) + 1;
				if (q < 0) q = Integer.MAX_VALUE;
				if (q < qMin) qMin = q;
			}
		}
		return qMin;
	}
	return 0;
}
```

**Passo 3:** Faça uma implementação recursiva para o problema utilizando memoization. (15%)

**Passo 4:** Faça uma implementação em programação dinâmica para o problema, onde os vetores q[t] e c[t] são utilizados, respectivamente, para armazenar a quantidade de cédulas e o valor da última cédula escolhida para perfazer um troco de valor t. (30%)

**Passo 5:** Faça uma implementação do método imprimirTroco para imprimir as cédulas utilizadas para perfazer o troco t do algoritmo de programação dinâmica. (15%)

**Passo 6:** Realize a análise de complexidade da função trocoDinamico, assumindo como parâmetro de tamanho do problema o valor do troco (já que, na prática, a quantidade de cédulas do padrão geralmente é constante). (10%)

**Passo 7:** Modifique o padrão de cédulas para {7, 17, 25}. Exiba a saída do programa para valor de troco igual a 33. O que quer dizer esta saída? (5%)

**Passo 8:** O que acontece com a execução do programa, utilizando o padrão de cédulas {1, 7, 17, 25}, caso o valor do troco seja mudado para 100? Explique porque o programa se comporta desta maneira. (5%)
