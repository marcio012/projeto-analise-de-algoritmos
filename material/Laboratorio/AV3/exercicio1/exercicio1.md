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

```java
static Aluno[] ordenaCreditos (Aluno[] A) {
  // to do
  // credito maximo 200
  int creditoMaximo = 200;
  Aluno[] B = new Aluno[A.length];
  int[] C = new int[creditoMaximo + 1];

  for (int j = 0; j < A.length; j++){
      int creditosCorrente = A[j].creditos;
      C[creditosCorrente] += 1;
  }

  for (int i = 1; i < C.length; i++)
      C[i] = C[i] + C[i - 1];

  for (int j = A.length - 1; j >= 0; j--) {
      Aluno aluno = A[j];
      int creditos = aluno.creditos;
      int posicao = C[creditos] - 1;

      B[posicao] = aluno;
      C[creditos] = C[creditos] - 1;
  }

  return B;
}
```
```
7865236742     Jmzvcawopv              2
4629189891     Ynlmtqxvap              3
8482848870     Rapxrjwrlh            137
2364939529     Amgswdpvkw            173
9302649241     Izdigcqzdt             43
5710322292     Cjzmlxiyvj             74
2644627614     Kaykogxkgl            117
9605879249     Eaqfjqwujs             27
5609233811     Vktxtlwkrw            167
3967791993     Oypqogbeam             71
7596302139     Lwbvbphcvc            106
8826651988     Pjpujvtcoq            138
0170416276     Eorvzpwrom            191
0113015799     Rjrrlzapog            113
5262930864     Suxvgrevre            118
5276016781     Mezdynpxoh            173
3825606830     Owgukrbabh            114
0642762917     Fahfbofwmq             30
3892474930     Ekfntricsq             13
0405040398     Bhegegodgn             55
9535124566     Hobilmnkrb            194
6393929397     Ndksmomeql            197
5993437661     Lwfjbiwqjb             13
0696608169     Dxifvrttut            121
2228300160     Hyoecwlslj             56
7502983726     Ghfgbfwnoz             41
6251162882     Fzznmzdpby            111
0690156889     Vxvurxuzlg             45
5259141009     Anqihljbwu            150
6145121570     Dutqugkyby            142
6143551923     Amnlcujblj            103
5245200918     Leamyckmbo              0
0189596765     Vqwnhmnwvg             42
5326951172     Dsbrkfancs             75
8477757731     Upwhlzpefk            114
1408021367     Kpdghvqsuc             22
4371083543     Irgmtdolwm            172
5711021131     Gkcpholamx            139
3681005273     Ezorkcenwe             15
7159957719     Ohnovvvnvl             12



5245200918     Leamyckmbo              0
7865236742     Jmzvcawopv              2
4629189891     Ynlmtqxvap              3
7159957719     Ohnovvvnvl             12
3892474930     Ekfntricsq             13
5993437661     Lwfjbiwqjb             13
3681005273     Ezorkcenwe             15
1408021367     Kpdghvqsuc             22
9605879249     Eaqfjqwujs             27
0642762917     Fahfbofwmq             30
7502983726     Ghfgbfwnoz             41
0189596765     Vqwnhmnwvg             42
9302649241     Izdigcqzdt             43
0690156889     Vxvurxuzlg             45
0405040398     Bhegegodgn             55
2228300160     Hyoecwlslj             56
3967791993     Oypqogbeam             71
5710322292     Cjzmlxiyvj             74
5326951172     Dsbrkfancs             75
6143551923     Amnlcujblj            103
7596302139     Lwbvbphcvc            106
6251162882     Fzznmzdpby            111
0113015799     Rjrrlzapog            113
3825606830     Owgukrbabh            114
8477757731     Upwhlzpefk            114
2644627614     Kaykogxkgl            117
5262930864     Suxvgrevre            118
0696608169     Dxifvrttut            121
8482848870     Rapxrjwrlh            137
8826651988     Pjpujvtcoq            138
5711021131     Gkcpholamx            139
6145121570     Dutqugkyby            142
5259141009     Anqihljbwu            150
5609233811     Vktxtlwkrw            167
4371083543     Irgmtdolwm            172
2364939529     Amgswdpvkw            173
5276016781     Mezdynpxoh            173
0170416276     Eorvzpwrom            191
9535124566     Hobilmnkrb            194
6393929397     Ndksmomeql            197
```


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
