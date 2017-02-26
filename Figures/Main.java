package com.company;
public class Main {
  public static void main(String[] args) {
     int squareSide = 3, parallelogramSide=2, fig;  //объявляем переменные и присваиваем значения в соответствии с заданием.
     double triangleSide[]= {3, 2.2, 4}, result=0, parallelogramHeight=1.4; //объявляем переменные и присваиваем значения в соответствии с заданием.
           for(fig = 0; fig<3; fig++) {
                 switch (fig) {
                     case 0:
                         result = Math.pow(squareSide, 2);//расчет площади квадрата
                         break;
                     case 1:
                         double p = (triangleSide[0] + triangleSide[1] + triangleSide[2]) / 2; //полупериметр треугольника;
                         result = Math.sqrt(p * (p - triangleSide[0]) * (p - triangleSide[1]) * (p - triangleSide[2]));//вычисление площади треугольника по трем сторонам
                         break;
                     case 2:
                         result = parallelogramSide * parallelogramHeight; //площадь параллелограмма
                         break;
                 }
           Output.data(fig, result); //отправляем на вывод номер фигуры и результат
           }
  }
}
