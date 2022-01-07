# collection-course
Curso Collection DIO

# java.util.List

* implementação que aprenderemos
  * java.util.ArrayList
  * java.util.Vector
  * Garante ordem de inserção
  * Permite adição, atualização, leitura e remoção sem regras adicionais
  * *Permite ordenação através de comparators

# 								java.util.Set

* Implementações que aprenderemos

  * `java.util.HashSet` : Quando **não é necessário** manter uma ordenação. **Não é ordenado**, e não permite valores repetidos. Passa a ser a implementação **mais performática** por não ter repetição de valores e não ser ordenado.

    

  * `java.util.TreeSet`: Quando é necessário **alterar a ordem através do uso de comparators**. **Matém ordem e pode ser reordenado.** É **performático para leitura**. Para **modificação tem a necessidade de reordenar**, sendo mais lento que o LinkedHashSet.

    

  * `java.util.LinkedHashSet`: Quando **é necessário** manter a ordem de inserção dos elementos. Matém a **ordem de inserção** dos elementos. É a **implementação mais lenta** por ser necessária manter a ordem.

* Por padrão, não garantem ordem.

* Não permite intens repetidos.

* Permite adição e remoção normalmente. Não possui busca por item - por não ser indexada - e atualização. Mas permite a navegação por `for` e `for each` e `Iterator.` Para leitura, apenas navegação.

* Não permite mudança de ordenação. 

____



# java.util.Map

* Implementações
  * java.util.HashMap
  * java.util.TreeMap
  * java.util.HashTable

* Entrada de chave e valor
* Permite valores repetidos, mas não permite repetição de chave.
* Permite adição, busca por chave ou valor, atualização, remoção e navegação.
* Pode ser ordenado.

Obs: Não estende da interface `colletction`.
