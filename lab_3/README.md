﻿Отчет по 3 лабораторной работе

ГЕНЕТИЧЕСКИЙ АЛГОРИТМ ДЛЯ ЗАДАЧИ ОПТИМИЗАЦИИ НЕПРЕРЫВНОЙ ФУНКЦИИ

В ходе выполнения данной лабораторной работы необходимо решить задачу оптимизации некой функции. В качестве задачи необходимо реализовать следующее:

1. Установить параметры ген. Алгоритма 
1. Реализовать инициализацию индивида 
1. Реализовать мутацию индивидов 
1. Реализовать кроссовер 

Лабораторная работы выполнялась на языке java в IDE IntelliJ

Реализация инициализации индивидов:

Согласно условию, значение индивида должно быть в рамках от -5 до 5 включительно. В качестве реализации функции рандома использовалось random.nextDouble() который возвращает случайное число от 0 до 1. Сама формула получения значения индивида имеет следующий вид:

solution[ind] = rangeMin + (rangeMax - rangeMin) \* random.nextDouble();

Реализация мутации:

Реализация мутации состоит в том что мы изменяем значение (ген) на значение находящийся в некой окрестности. Формула состоит в следующем:

number = a \* random.nextGaussian() + population.get(parent)[ind]; , где а это параметр который указывает на уровень исследования окрестностей точки. 

Также мы можем взять абсолютно случайное значение в рамках заданной задачи по формуле представленной в инициализации. 

Реализация кроссовера:

Кроссовер состоит в том что один ребенок получает часть значений 1 родителя и часть значений является комбинацией 1 и 2 родителя. Второй ребенок получает значения, наоборот. 

Установка параметра мутации a: в ходе проведенного тестирования было выявлено что поиск в окрестностях не эффективен.   Также есть лишь малая вероятность того, что мутация будет проведена над элементом. 

|Размер проблемы|Размер популяции|Количество итераций|Результат|
| :- | :- | :- | :- |
|2|75|750|9.999|
|10|99|9999|9.9|
|20|99|9999|9.611|
|50|99|9999|8.8|
|100|99|9999|8.43|

