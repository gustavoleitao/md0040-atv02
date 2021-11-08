## Atividade

Nesta atividade você deverá criar um programa dado um texto (String), o programa deverá retornar a quantidade de vogais existentes. 

Considerar para vogais as seguintes letras e sua variação maiúscula:

* a, á, à, â, ã, e, é, ê, è, i, í, ì, î, o, ó, ò, ô, õ, u, ú, ù, û

```java
public class Vogais {

    /**
     * Método responsável por contar as vogais de um texto
     * @param text Texto de entrada
     * @return quantidade de caracteres vogais incluídos no texto
     */
    public int contarVogais(String text){
        //TODO adicionar texto aqui
        return 0;
    }

}
```

## Exemplos

O resultado deverá ser retornado como inteiro no método contarVogais

### Exemplo 01

Entrada: 
```console
abc
```   
Saída:  
```console
1
```

### Exemplo 02

Entrada:
```console
aeiou
```   
Saída:
```console
5
```

### Exemplo 02

Entrada:
```console
Olá tudo bom?
```   
Saída:
```console
5
```

## Testes

O programa possui testes automatizados implementados. Se quiser testar execute o seguinte comando:

```console
$ ./gradlew test
```