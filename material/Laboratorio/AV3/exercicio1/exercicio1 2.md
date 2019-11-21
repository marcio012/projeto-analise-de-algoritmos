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

```Java
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
9549494176     Afszrcihal            148
1751687351     Cznwtczvhv            192
1886170853     Biltaqyrtd             53
4963805484     Rzywpwcskt             80
4500027537     Jyvroslajm             44
8755871334     Oabgxbuesr             39
9771690372     Mdbqtawffx            115
1890891988     Hvnsumncnu             49
1210292163     Hrvindtses             28
4680460084     Rzblqmysxq             10
7498724333     Jebbsncbgd            116
4431367405     Reyjmhplmr            163
6395976091     Bguloqfehj            132
7882413749     Mcyxaooqee             43
9624572006     Nufbkyctga            154
3435315425     Imqsmpfvzz            104
1220805867     Xcuxkdiqnq             41
6737551247     Uujhhigbrm            111
5155434092     Krbxfsjfnm            106
4111951831     Fdiawivgca             71
1417866290     Ayvujdwbuz             69
7941439894     Kllefpajyx            148
0619497603     Mnyovtbqsp             33
4613181918     Axrntgjysj            173
3745651808     Egwkfpaddl            160
7218388681     Prjirkcrja             56
7741788432     Knizscsrxp            160
1154859115     Swpawebwru              8
5583535540     Jzyivcmlby             62
0839089325     Ptuunurobm             87
7082241662     Enrsctxycj            121
1456769485     Wwyuckmpov             73
0304433912     Janqaqdguw             87
3929530289     Pmnoztjigk            146
0026325265     Jalriqjqbt             10
4794961948     Liveurpvjh            102
6722266306     Bcxhcmnzxl            138
4673205049     Rvfvaashil             82
4010591382     Hswgbpklkd             49
4779996982     Wftzooyftr            185



1154859115     Swpawebwru              8
4680460084     Rzblqmysxq             10
0026325265     Jalriqjqbt             10
1210292163     Hrvindtses             28
0619497603     Mnyovtbqsp             33
8755871334     Oabgxbuesr             39
1220805867     Xcuxkdiqnq             41
7882413749     Mcyxaooqee             43
4500027537     Jyvroslajm             44
1890891988     Hvnsumncnu             49
4010591382     Hswgbpklkd             49
1886170853     Biltaqyrtd             53
7218388681     Prjirkcrja             56
5583535540     Jzyivcmlby             62
1417866290     Ayvujdwbuz             69
4111951831     Fdiawivgca             71
1456769485     Wwyuckmpov             73
4963805484     Rzywpwcskt             80
4673205049     Rvfvaashil             82
0839089325     Ptuunurobm             87
0304433912     Janqaqdguw             87
4794961948     Liveurpvjh            102
3435315425     Imqsmpfvzz            104
5155434092     Krbxfsjfnm            106
6737551247     Uujhhigbrm            111
9771690372     Mdbqtawffx            115
7498724333     Jebbsncbgd            116
7082241662     Enrsctxycj            121
6395976091     Bguloqfehj            132
6722266306     Bcxhcmnzxl            138
3929530289     Pmnoztjigk            146
9549494176     Afszrcihal            148
7941439894     Kllefpajyx            148
9624572006     Nufbkyctga            154
3745651808     Egwkfpaddl            160
7741788432     Knizscsrxp            160
4431367405     Reyjmhplmr            163
4613181918     Axrntgjysj            173
4779996982     Wftzooyftr            185
1751687351     Cznwtczvhv            192

```

**Passo 3:** Faça uma implementação do radix sort para ordenar os registros do vetor pelo campo matricula, sabendo que uma matrícula possui 10 dígitos decimais. Escreva a saída do seu programa antes e após a ordenação do vetor. (30%)

**Obs.1:** A indexação em Java do vetor onde os registros são copiados vai de 0 até n-1.
**Obs.2:** Para encontrar o dígito numérico da posição d = 0 .. 9 da matrícula, use:

```java
int digito = (int) A[j].matricula.charAt(d) – '0';
```

```Java
static Aluno[] ordenaMatricula (Aluno[] A) {
  // to do
  int tamanhoMatricula = 10;
  for (int d = tamanhoMatricula -1; d >= 0; d--) {
      Aluno[] B = new Aluno[A.length];
      int[] C = new int[10];


      for (int j = 0; j < A.length; j++){
          int digito = (int) A[j].matricula.charAt(d) - '0';
          C[digito] += 1;
      }

      for (int i = 1; i < C.length; i++)
          C[i] = C[i] + C[i - 1];

      for (int j = A.length - 1; j >= 0; j--) {
          Aluno aluno = A[j];
          int digito = (int) A[j].matricula.charAt(d) - '0';
          int posicao = C[digito] - 1;

          B[posicao] = aluno;
          C[digito] = C[digito] - 1;
      }
      A = B;
  }
  return A;

}
```

```
2289742058     Jqknhnsmvr            165
6464507715     Hbpsgzzila            176
8654810967     Ehfcoyznta              3
5523178452     Xcjasvjxjg             16
9968920075     Efuybmkfos             58
9414828129     Lmdsyhtklq            195
2774579365     Vylenwikpq            127
1870448120     Fkjvybekjp             81
5867798937     Zahnzoxduh            148
4238087347     Bueomzmqeu            178
0652340859     Gnhckqjixm            170
4625451688     Khtasedvzt            182
1870907251     Ijpuoblubc             62
4722553305     Wcotsebnur             36
8558508395     Wyvtrcyxny             52
3260754555     Raxxkrlccw            120
2282243388     Kcamnegusd            100
5996061386     Bwyveogzzh            167
5445351418     Rwbhkryazd            149
1053540106     Tpudmdwkah            165
9288531308     Oiuimsnjqz              9
3206128581     Qtzhooapcf             17
7253946000     Mbjkcuuehu            151
2944726892     Vstruqgqzj            189
7386567607     Wdqyeidtgf            166
6995420829     Fkrdhcykjz            148
9092833953     Kyspnpgheh            107
8100500147     Quqztoonst            140
9352372944     Rbdlmkcend             41
1857873667     Ozqkteoxmb             87
6154211331     Aumponfjpc             22
1529318509     Dqnzmodriw             76
4570859621     Kesvymkeeh            197
5377518511     Fczhelqfts            192
4174722369     Nsfdbvokne              0
7291804509     Dvkgnxnevn              0
5248602176     Fbfdozndcq             48
1164976600     Lxxrogsxkl             92
1368557327     Tmsxvjfpti            183
2149201277     Rmlzvzqjsi             59



0652340859     Gnhckqjixm            170
1053540106     Tpudmdwkah            165
1164976600     Lxxrogsxkl             92
1368557327     Tmsxvjfpti            183
1529318509     Dqnzmodriw             76
1857873667     Ozqkteoxmb             87
1870448120     Fkjvybekjp             81
1870907251     Ijpuoblubc             62
2149201277     Rmlzvzqjsi             59
2282243388     Kcamnegusd            100
2289742058     Jqknhnsmvr            165
2774579365     Vylenwikpq            127
2944726892     Vstruqgqzj            189
3206128581     Qtzhooapcf             17
3260754555     Raxxkrlccw            120
4174722369     Nsfdbvokne              0
4238087347     Bueomzmqeu            178
4570859621     Kesvymkeeh            197
4625451688     Khtasedvzt            182
4722553305     Wcotsebnur             36
5248602176     Fbfdozndcq             48
5377518511     Fczhelqfts            192
5445351418     Rwbhkryazd            149
5523178452     Xcjasvjxjg             16
5867798937     Zahnzoxduh            148
5996061386     Bwyveogzzh            167
6154211331     Aumponfjpc             22
6464507715     Hbpsgzzila            176
6995420829     Fkrdhcykjz            148
7253946000     Mbjkcuuehu            151
7291804509     Dvkgnxnevn              0
7386567607     Wdqyeidtgf            166
8100500147     Quqztoonst            140
8558508395     Wyvtrcyxny             52
8654810967     Ehfcoyznta              3
9092833953     Kyspnpgheh            107
9288531308     Oiuimsnjqz              9
9352372944     Rbdlmkcend             41
9414828129     Lmdsyhtklq            195
9968920075     Efuybmkfos             58
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
