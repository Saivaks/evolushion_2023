# Описание 
Топологическая сортировка может применяться для ориентированного ациклического графа (DAG). Ее суть состоит в упорядочивании вершин по следующемы условию:
Узел или вершина a должны посещать перед узлом или вершиной b для каждого направленного ребра ab. Соотвественно если граф не DAG то применить сортировку невозможно. 
Алгоретмическая сложность этого алгоритма составляет O(V + E), где V это количество вершин, а E это количество ребер. 
Например для следующего графа вывод топологическо сортировки будет следующий:

![image](https://user-images.githubusercontent.com/58116790/218829816-7180bdc1-b5f7-4d1f-87b9-856a9ac9d19f.png)

Результат: [B, E, A, F, C, D] 
# Реализация на python 

Реализация алгоритма на языке python представлена в файле под именем python_lab_1. 
В результате для полного графа DAG размером 1500 тополгическая сортировка заняла 0.055 секунд времени или 0.43 если не использовать профилировщик

# Реализация на с++
Реализация кода на с++ представлена в файле lab_1. В среднем на выполнее команды было затраченно 0.023 секунды что в 2 раза меньше чем на python.
Для теста также применялся полный граф DAG с 1500 вершин. 
