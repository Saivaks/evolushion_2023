﻿Отчет по 4 лабораторной работе

ГЕНЕТИЧЕСКИЙ АЛГОРИТМ ДЛЯ РЕШЕНИЯ ЗАДАЧИ

КОММИВОЯЖЁРА

В ходе выполнения данной лабораторной работы необходимо решить задачу оптимизации задачи коммивояжёра. В качестве задачи необходимо реализовать следующее:

1. Установить параметры ген. Алгоритма 
1. Реализовать инициализацию индивида 
1. Реализовать мутацию индивидов 
1. Реализовать кроссовер 
1. Реализовать класс индивида 
1. Реализовать фитнес функцию

Лабораторная работы выполнялась на языке java в IDE IntelliJ

Реализация класса индивида:

Индивид представляет собой список значений с индексами городов с некоторыми методами.

Реализация инициализации индивидов:

Согласно условию, значение индексов городов не должны повторяться. Соответственно инициализируем индивида путем составления списка значениями от 0 до длины проблемы – 1. 

Реализация мутации:

С некой вероятностью, которая зависит от размера популяции и длины проблемы меняем местами 2 индекса (гена). 

Реализация кроссовера:

Реализация кроссовера состоит в том что ребенок получает случайный интервал размера i от одного родителя и остальные значения от другого. Также необходимо учитывать, чтобы индексы были уникальными в ребенке. 

Установка параметров: i = 3, шанс мутации популяции 1./population.size(), шанс мутации индивида 1./(population.get(0).Solution.size()), количество об. Отбора = 10.

|Имя проблемы|Размер|Параметры pop. и gen.|Длина маршрута|Количество итераций до сходимости|Оптимальный маршрут|
| :- | :- | :- | :- | :- | :- |
|xqf131|131|100, 100000|800.17|120000|564|
|xqg237|237|100, 100000|2014.12|150000|1019|
|pma343|343|100, 100000|2366|140000|1368|
|pka379|379|100, 100000|2342|140000|1332|
|bcl380|380|100, 100000|5857|150000|1621|

Ответы на вопросы:

1. Нельзя, но можно оценить, насколько мы приблизились к решению по кривой фитнесс функции.
1. Нет не можем. Если предположим поставить задачу с возможным повторением городов то это приведет к тому что объекты будут содержать лишь 1 тип гена т.е. по задаче коммивояжер останется на месте. 
1. Тогда мы будет вычислять не циклический граф а ацикличный что в свою очередь будет влиять на решение. Скорее всего лучшим решением будет последовательное движение в сторону скопление городов. 
