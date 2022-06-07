package lab4;
/* В данной работе с помощью методов класса Find считываем файл task.txt , где записанны
строки с арифметическими выражениями, вычленяем выражения , определяем тип операции ,выполняем
и реузьтат выводим на экран
*/
public class Main {
    public static void main(String[] args){
        Find find = new Find();
        find.readFile("task.txt");
    }
}
