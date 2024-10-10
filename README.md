# Java Stream API - Métodos Explicados

Este documento explica de forma simples os principais métodos da **Stream API** do Java, o que cada um deles faz e o que é necessário para utilizá-los.

## Métodos e Descrições

| **Modificador e Tipo**                  | **Método**                      | **O que é necessário**                                                    | **Descrição Simples**                                                                 |
|-----------------------------------------|----------------------------------|---------------------------------------------------------------------------|---------------------------------------------------------------------------------------|
| `boolean`                               | `allMatch(Predicate<? super T> predicate)`  | Precisa de um `Predicate` (função que recebe um tipo `T` e retorna `boolean`). | Verifica se todos os elementos atendem ao critério fornecido.                         |
| `boolean`                               | `anyMatch(Predicate<? super T> predicate)`  | Precisa de um `Predicate` (função que recebe um tipo `T` e retorna `boolean`). | Verifica se algum elemento atende ao critério fornecido.                              |
| `static <T> Stream.Builder<T>`          | `builder()`                      | Não precisa de parâmetros.                                                 | Cria um construtor para um Stream.                                                    |
| `<R> R`                                 | `collect(Supplier<R> supplier, BiConsumer<R,​? super T> accumulator, BiConsumer<R,​R> combiner)` | Precisa de um `Supplier`, um `BiConsumer` para adicionar elementos, e outro `BiConsumer` para combinar resultados. | Executa uma operação de redução mutável nos elementos.                               |
| `<R,​A> R`                              | `collect(Collector<? super T,​A,​R> collector)` | Precisa de um `Collector`.                                                | Executa uma operação de redução mutável com um `Collector`.                          |
| `static <T> Stream<T>`                  | `concat(Stream<? extends T> a, Stream<? extends T> b)`  | Precisa de dois `Stream` para concatenar.                                  | Combina dois streams em um só.                                                        |
| `long`                                  | `count()`                       | Não precisa de parâmetros.                                                 | Retorna o número de elementos no stream.                                              |
| `Stream<T>`                             | `distinct()`                    | Não precisa de parâmetros.                                                 | Remove duplicatas do stream.                                                          |
| `default Stream<T>`                     | `dropWhile(Predicate<? super T> predicate)` | Precisa de um `Predicate` para decidir quando parar de "dropar" elementos. | Remove elementos enquanto o critério for verdadeiro e retorna o resto.                 |
| `static <T> Stream<T>`                  | `empty()`                       | Não precisa de parâmetros.                                                 | Cria um stream vazio.                                                                 |
| `Stream<T>`                             | `filter(Predicate<? super T> predicate)`   | Precisa de um `Predicate`.                                                 | Filtra elementos com base em um critério.                                             |
| `Optional<T>`                           | `findAny()`                     | Não precisa de parâmetros.                                                 | Retorna algum elemento, se presente.                                                  |
| `Optional<T>`                           | `findFirst()`                   | Não precisa de parâmetros.                                                 | Retorna o primeiro elemento, se presente.                                             |
| `<R> Stream<R>`                         | `flatMap(Function<? super T,​? extends Stream<? extends R>> mapper)` | Precisa de uma função que transforma um elemento `T` em um `Stream<R>`.     | Mapeia cada elemento para um novo stream e combina os resultados.                     |
| `DoubleStream`                          | `flatMapToDouble(Function<? super T,​? extends DoubleStream> mapper)` | Precisa de uma função que mapeia para um `DoubleStream`.                    | Mapeia elementos para um `DoubleStream`.                                              |
| `IntStream`                             | `flatMapToInt(Function<? super T,​? extends IntStream> mapper)`   | Precisa de uma função que mapeia para um `IntStream`.                       | Mapeia elementos para um `IntStream`.                                                 |
| `LongStream`                            | `flatMapToLong(Function<? super T,​? extends LongStream> mapper)` | Precisa de uma função que mapeia para um `LongStream`.                      | Mapeia elementos para um `LongStream`.                                                |
| `void`                                  | `forEach(Consumer<? super T> action)`   | Precisa de um `Consumer` para processar cada elemento.                     | Executa uma ação para cada elemento.                                                  |
| `void`                                  | `forEachOrdered(Consumer<? super T> action)` | Precisa de um `Consumer`.                                                  | Executa uma ação para cada elemento na ordem, se houver ordem definida.               |
| `static <T> Stream<T>`                  | `generate(Supplier<? extends T> s)` | Precisa de um `Supplier`.                                                  | Cria um stream infinito com elementos gerados pelo `Supplier`.                        |
| `static <T> Stream<T>`                  | `iterate(T seed, Predicate<? super T> hasNext, UnaryOperator<T> next)` | Precisa de um valor inicial, um `Predicate` para definir quando parar e uma função para gerar o próximo valor. | Gera um stream com valores iterados enquanto o critério for verdadeiro.              |
| `Stream<T>`                             | `limit(long maxSize)`           | Precisa de um número `maxSize` que define quantos elementos manter no stream. | Limita o stream a um número máximo de elementos.                                      |
| `<R> Stream<R>`                         | `map(Function<? super T,​? extends R> mapper)`   | Precisa de uma função que transforma elementos `T` em `R`.                  | Aplica uma função a cada elemento e retorna os resultados como um novo stream.        |
| `Optional<T>`                           | `max(Comparator<? super T> comparator)`   | Precisa de um `Comparator` para comparar elementos.                        | Retorna o maior elemento com base em um comparador.                                   |
| `Optional<T>`                           | `min(Comparator<? super T> comparator)`   | Precisa de um `Comparator`.                                                | Retorna o menor elemento com base em um comparador.                                   |
| `boolean`                               | `noneMatch(Predicate<? super T> predicate)` | Precisa de um `Predicate`.                                                 | Verifica se nenhum elemento atende ao critério fornecido.                             |
| `static <T> Stream<T>`                  | `of(T t)`                      | Precisa de um único elemento `t`.                                           | Cria um stream com um único elemento.                                                 |
| `static <T> Stream<T>`                  | `of(T... values)`               | Precisa de vários valores para criar o stream.                              | Cria um stream com os elementos especificados.                                        |
| `Stream<T>`                             | `peek(Consumer<? super T> action)`   | Precisa de um `Consumer`.                                                  | Executa uma ação para cada elemento, sem modificar o stream.                          |
| `Optional<T>`                           | `reduce(BinaryOperator<T> accumulator)`   | Precisa de uma função para combinar dois elementos `T`.                     | Reduz os elementos do stream para um único valor, se possível.                        |
| `Stream<T>`                             | `sorted()`                      | Não precisa de parâmetros.                                                 | Ordena os elementos de acordo com a ordem natural.                                    |

## Como Utilizar

A **Stream API** é uma poderosa ferramenta para trabalhar com coleções de dados de maneira funcional e fluente. Para usar esses métodos, você deve entender que a maioria deles recebe funções como parâmetros, que podem ser `Predicate` (para verificar condições), `Function` (para mapear elementos) ou `Consumer` (para executar ações).

Exemplo básico:
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
boolean allEven = numbers.stream().allMatch(n -> n % 2 == 0);
