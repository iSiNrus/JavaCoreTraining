package com.example.user.javacoretraining.training;

/**
 * Набор тренингов по работе с массивами в java.
 * <p>
 * Задания определены в комментариях методов.
 * <p>
 * Проверка может быть осуществлена запуском тестов.
 * <p>
 * Доступна проверка тестированием @see ArraysTrainingTest.
 */
public class ArraysTraining {

    /**
     * Метод должен сортировать входящий массив
     * по возрастранию пузырьковым методом
     *
     * @param valuesArray массив для сортировки
     * @return отсортированный массив
     */
    public int[] sort(int[] valuesArray) {
        for(int j = 1; j < valuesArray.length; j++){
            boolean f = false;
            for(int i=0; i<valuesArray.length-j; i++){
                if(valuesArray[i]>valuesArray[i+1]){
                    int t = valuesArray[i];
                    valuesArray[i] = valuesArray[i+1];
                    valuesArray[i+1] = t;
                    f = true;
                }
            }
            if(!f) break;
        }
        return valuesArray;
    }

    /**
     * Метод должен возвращать максимальное
     * значение из введенных. Если входящие числа
     * отсутствуют - вернуть 0
     *
     * @param values входящие числа
     * @return максимальное число или 0
     */
    public int maxValue(int... values) {
        if(values.length==0) return 0;
        else {
            int max = values[0];
            for(int v : values)
                if(v > max) max = v;
            return max;
        }
    }

    /**
     * Переставить элементы массива
     * в обратном порядке
     *
     * @param array массив для преобразования
     * @return входящий массив в обратном порядке
     */
    public int[] reverse(int[] array) {
        for(int i=0; i<array.length/2; i++){
            int t = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = t;
        }
        return array;
    }

    /**
     * Метод должен вернуть массив,
     * состоящий из чисел Фибоначчи
     *
     * @param numbersCount количество чисел Фибоначчи,
     *                     требуемое в исходящем массиве.
     *                     Если numbersCount < 1, исходный
     *                     массив должен быть пуст.
     * @return массив из чисел Фибоначчи
     */
    public int[] fibonacciNumbers(int numbersCount) {
        if(numbersCount<1) return new int[]{};
        if(numbersCount==1) return new int[]{1};
        if(numbersCount==2) return new int[]{1,1};
        else {
            int[] array = new int[numbersCount];
            array[0] = 1;
            array[1] = 1;
            for(int i=2; i<array.length; i++){
                array[i] = array[i-1] + array[i-2];
            }
            return array;
        }
    }

    /**
     * В данном массиве найти максимальное
     * количество одинаковых элементов.
     *
     * @param array массив для выборки
     * @return количество максимально встречающихся
     * элементов
     */
    public int maxCountSymbol(int[] array) {
        int maxCount = 0;
        for (int j : array) {
            int count = 0;
            for (int k : array) if (j == k) count++;
            if (maxCount < count) maxCount = count;
        }
        return maxCount;
    }
}
