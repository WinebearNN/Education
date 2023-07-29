package theory.article;

import java.security.SecureRandom;
import java.util.Random;

public class ClassRandom {
//    java.util.Random - generate random value of type int,float,boolean,long,double
//    +Random - создает объект типа Random с текущим временем в качестве случайного значения
//    +Random(seed:long) - создает объект типа Random с заданным случайным значением
//    +nextInt():int - создает случайное значение типа int
//    +nextInt(n:int):int - создает случайное значение от 0 до n типо int не включая n
//    ...
//    Можно создавать случайные значения не только классом Random, но и классом java.security.SecureRandom
//    Числа в классе Random являются детерминированными и предсказуемыми, яего нельзя сказать о втором классе
public static void main(String[] args) {
    SecureRandom generate = new SecureRandom();
    System.out.println(generate.nextInt());
}





}
