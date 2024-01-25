# Написать программу на языке Prolog для вычисления суммы
# элементов списка. На вход подаётся целочисленный массив.
# На выходе - сумма элементов массива.


% Rules
list_sum([],0).
list_sum([Head|Tail], TotalSum):-
    list_sum(Tail, Sum1), TotalSum is Head+Sum1.

% Query
?- list_sum([1,2,3,4], TotalSum).