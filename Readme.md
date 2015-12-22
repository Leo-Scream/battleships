Морской бой
===========

Коротко обо всем
----------------
Приветствую Вас в репозитории, посвященном моей реализации игры "Морской бой".
Я начал этот проект в рамках самостоятельного изучения программирования.
Создание игры - это отличный способ научиться программировать, подумал я, а игра "Морской бой"
достаточно проста, чтобы начать именно с нее, но в то же время достаточно сложна,
чтобы разработка не была скучной. В ходе создания этой игры было перелопачено немало материала,
который в конце концов превратился в незабываемый опыт. К тому же наличие такого проекта приятно тяжелит
портфолио! Итак, давайте приступим к изложению сути. Если Вы, как и я, самостоятельно изучаете программирование, 
я предлагаю Вам воспользоваться материалами этого проекта как пособием к обучению.
К репозиторию приложены спецификация, прототипирование, а так же все проектирование.
Предлагаю Вам ознакомиться с этими материалами и воспользоваться ими для собственной реализации
этой замечательной игры. Если Вы считаете, что что-то реализовано не лучшим образом,
то я с радостью выслушаю конструктивную критику ([mod.satyr@gmail.com](mailto:mod.satyr@gmail.com)). Приятного прочтения!

Содержание
----------
Спецификация и прототипирование:

* [Игра](engineering/prototyping/Game.md)
* [Сражение](engineering/prototyping/Round.md)

Проектирование:

* [Диаграмма классов](engineering/diagrams/Classes.md)

Правила игры
------------
Игра начинается с расстановки кораблей. Игроки расставляют свои корабли таким образом,
чтобы между кораблями всегда был минимум один сектор. Корабль может занимать только
соседние друг с другом секторы. Секторы, расположенные по диагонали по отношению друг к другу,
соседними не являются.  Когда расставлены все корабли, доступные игрокам, начинается сражение.
Во время сражения игроки обмениваются выстрелами до тех пор, пока у одного из них не будут
потоплены все корабли. Этот игрок считается проигравшим, и сражение заканчивается.

Ссылка для скачивания приложения
--------------------------------
Работоспособный билд отсутствует на данный момент. Когда будет реализован весь описанный в спецификации функционал,
эта версия приложения будет доступна для скачивания и ссылка на нее будет размещеная здесь.
