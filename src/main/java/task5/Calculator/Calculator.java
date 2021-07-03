package task5.Calculator;

public interface Calculator{
    /**
     * Расчет факториала числа.
     * @param number аргумент фаокториала
     */
    @Cache
    int calc (int number);
}
