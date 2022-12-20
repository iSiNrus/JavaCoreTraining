package com.example.user.javacoretraining.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

/**
 * Набор тренингов по работе со строками в java.
 * <p>
 * Задания определены в комментариях методов.
 * <p>
 * Проверка может быть осуществлена запуском тестов.
 * <p>
 * Доступна проверка тестированием @see StringsTrainingTest.
 */
public class StringsTraining {

    /**
     * Метод по созданию строки,
     * состоящей из нечетных символов
     * входной строки в том же порядке
     * (нумерация символов идет с нуля)
     *
     * @param text строка для выборки
     * @return новая строка из нечетных
     * элементов строки text
     */
    public String getOddCharacterString(String text) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<text.length(); i++)
            if(i%2 == 1) sb.append(text.charAt(i));
        return sb.toString();
    }

    /**
     * Метод для определения количества
     * символов, идентичных последнему
     * в данной строке
     *
     * @param text строка для выборки
     * @return массив с номерами символов,
     * идентичных последнему. Если таких нет,
     * вернуть пустой массив
     */
    public int[] getArrayLastSymbol(String text) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<text.length()-1; i++)
            if(text.charAt(i) == text.charAt(text.length()-1))
                list.add(i);
        int[] res = new int[list.size()];
        for(int i=0; i<res.length; i++)
            res[i] = list.get(i);
        return res;
    }

    /**
     * Метод по получению количества
     * цифр в строке
     *
     * @param text строка для выборки
     * @return количество цифр в строке
     */
    public int getNumbersCount(String text) {
        char[] digits = {'0','1','2','3','4','5','6','7','8','9' };
        int amount = 0;
        for(int i=0; i<text.length(); i++)
            for (char digit : digits) if (digit == text.charAt(i)) amount++;

        return amount;
    }

    /**
     * Дан текст. Заменить все цифры
     * соответствующими словами.
     *
     * @param text текст для поиска и замены
     * @return текст, где цифры заменены словами
     */
    public String replaceAllNumbers(String text) {

       text = text.replace("0", "zero");
       text = text.replace("1", "one");
       text = text.replace("2", "two");
       text = text.replace("3", "three");
       text = text.replace("4", "four");
       text = text.replace("5", "five");
       text = text.replace("6", "six");
       text = text.replace("7", "seven");
       text = text.replace("8", "eight");
       text = text.replace("9", "nine");

        return text;
    }

    /**
     * Метод должен заменить заглавные буквы
     * на прописные, а прописные на заглавные
     *
     * @param text строка для изменения
     * @return измененная строка
     */
    public String capitalReverse(String text) {
        StringBuilder sb = new StringBuilder();
        for(char symbol : text.toCharArray()){
            String s = String.valueOf(symbol);
            String sUp = s.toUpperCase();
            if(s.equals(sUp)) sb.append(s.toLowerCase());
            else sb.append(s.toUpperCase());
        }
        return sb.toString();
    }

}
