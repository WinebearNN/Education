package theory.article;

import java.util.Date;

public class ClassDate {
    //    Date() - создает объект Date для текущего времени
//    Date(elapseTime:long) - создает объект Date для заданного времени в миллисекундах, прошедшего с 01.01.1970
//    toString():String - возвращает строку, представляющуу дату и время
//    getTime():long - возвращает кол-во миллисекунд, прошедших с 01.01.1970
//    setTime(elapseTime:long):void - устанавливает новое время
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.getTime());
        Date date2 = new Date(1690833983555L);
        System.out.println(date2.toString());
        System.out.println(date2.getTime());

    }


}
