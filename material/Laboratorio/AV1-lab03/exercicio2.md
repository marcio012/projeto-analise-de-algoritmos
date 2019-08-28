## N584 – Projeto e Análise de Algoritmos
### Prof. Napoleão Nepomuceno
#### AV1 - Lab03
##### Data do Laboratório: 21/08/2019
##### Márcio Heleno **Matrícula: 1814038**

---

> Entrega do trabalho:
Data da Entrega: 25/08/2019 (enviar arquivos .odt e .ods)

### Exercício 2


- **Passo 1**: Realizar a análise de complexidade para o método abaixo. (20%)

```java
static void metodo1 (int n) {
System.out.println("inicio");
for (int i = 1; i <= n*n; i++) {
	for (int j = 1; j <= i; j++) {
		System.out.println(j);
	}
}
  System.out.println("fim");
}
```

**Passo 2**: Monte a equação de recorrência do método abaixo. (15%)

```java
static void metodo2 (int n) {
  if (n > 1) {
  	System.out.println(n);
  	metodo2(n/2);
  	metodo2(n/2);
  	metodo2(n/2);
  	metodo2(n/2);
  } else {
  	System.out.println(n);
  }
}
```

**Passo 3**: Resolva a equação de recorrência por uma árvore de recursão. (15%)
