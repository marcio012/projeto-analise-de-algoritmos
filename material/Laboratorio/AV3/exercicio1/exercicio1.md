## N584 – Projeto e Análise de Algoritmos

### Prof. Napoleão Nepomuceno

#### AV3 - Lab01

##### Data do Laboratório: 20/10/2019

##### Márcio Heleno **Matrícula: 1814038**

---

> Entrega do trabalho:
> Data da Entrega: 24/11/2019 (enviar arquivo .odt)

### Exercício 1 - Av3

**Passo 1:** Implementar o seguinte código em Java ou equivalente em outra linguagem de programação.

```Java
import java.util.Random;

public class Exercicio1 {

	static class Aluno {
		public String matricula;
		public String nome;
		public int creditos;

		public Aluno() {
			Random randomGenerator = new Random();
			matricula = "";
			for (int i = 1; i <= 10; i++) {
				matricula += (char) ('0' + randomGenerator.nextInt(10));
			}
			nome = "";
			nome += (char)('A' + randomGenerator.nextInt(26));
			for (int i = 2; i <= 10; i++) {
				nome += (char) ('a' + randomGenerator.nextInt(26));
			}
			creditos = randomGenerator.nextInt(201);
		}
	}

	public static void main(String[] args) {
		int n = 40;
		Aluno[] alunos = new Aluno[n];
		for (int i = 0; i < alunos.length; i++) {
			alunos[i] = new Aluno();
		}
		imprime(alunos);
		alunos = ordenaCreditos(alunos);
		imprime(alunos);
		alunos = ordenaMatricula(alunos);
		imprime(alunos);
		alunos = ordenaNome(alunos);
		imprime(alunos);
	}

	static Aluno[] ordenaCreditos (Aluno[] A) {
		Aluno[] B = new Aluno[A.length];
		// to do
		return B;
	}

	static Aluno[] ordenaMatricula (Aluno[] A) {
		// to do
	}

	static Aluno[] ordenaNome (Aluno[] A) {
		// to do
	}

	static void imprime (Aluno[] A) {
		for (int i = 0; i < A.length; i++) {
			System.out.printf("%-15s%-15s%10d\n", A[i].matricula, A[i].nome, A[i].creditos);
		}
		System.out.print("\n\n\n");
	}
}
```

**Passo 2:** O vetor alunos armazena os dados de n alunos. Cada registro possui um campo matricula, um campo nome e um campo creditos. Faça uma implementação do counting sort para ordenar os registros do vetor pelo campo creditos, sabendo que a quantidade máxima de créditos é 200. Escreva a saída do seu programa antes e após a ordenação do vetor. (40%)

**Obs.1:** A indexação em Java do vetor onde os registros são copiados vai de 0 até n-1.
**Obs.2:** Este passo deve ser realizado obrigatoriamente no laboratório.



**Passo 3:** Faça uma implementação do radix sort para ordenar os registros do vetor pelo campo matricula, sabendo que uma matrícula possui 10 dígitos decimais. Escreva a saída do seu programa antes e após a ordenação do vetor. (30%)

**Obs.1:** A indexação em Java do vetor onde os registros são copiados vai de 0 até n-1.
**Obs.2:** Para encontrar o dígito numérico da posição d = 0 .. 9 da matrícula, use:

```java
int digito = (int) A[j].matricula.charAt(d) – '0';
```

**Passo 4:** Faça uma implementação do radix sort para ordenar os registros do vetor pelo campo nome, assumindo que todo nome começa com um caractere maiúsculo (‘A’...‘Z’) seguido de 9 caracteres minúsculos (‘a’...‘z’). Escreva a saída do seu programa antes e após a ordenação do vetor. (30%)

**Obs.1:** A indexação do vetor C onde se faz a contagem vai de 0 até 25.
**Obs.2:** Para encontrar o índice no vetor C referente ao caractere da posição d = 0 .. 9 do nome, use:

```java
int digito = (int) A[j].nome.charAt(d) – 'A';
```
ou

```java
int digito = (int) A[j].nome.charAt(d) – 'a';
```
de acordo com o caso
