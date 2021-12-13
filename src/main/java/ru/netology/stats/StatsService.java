package ru.netology.stats;


public class StatsService {
    // сумма всех продаж
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    // средняя сумма продаж в месяц
    public int calculateAverage(int[] sales) {

        return calculateSum(sales) / sales.length;
    }

    //Номер месяца, в котором был пик продаж
    public int maxSaleMonth(int[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month += 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }
        //Номер месяца, в котором был пик продаж
        public int minSaleMonth(int[] sales) {
            int minMonth = 0;
            int month = 0; // переменная для индекса рассматриваемого месяца в массиве
            for (int sale : sales) {
                // sales[minMonth] - продажи в месяце minMonth
                // sale - продажи в рассматриваемом месяце
                if (sale <= sales[minMonth]) {
                    minMonth = month;
                }
                month += 1; // следующий рассматриваемый месяц имеет номер на 1 больше
            }
            return minMonth + 1;
        }
    //Кол-во месяцев, в которых продажи были ниже среднего
    public int saleBelowAverage(int[] sales) {
        int number = 0;
        int average = calculateAverage(sales);
        for (int sale : sales){
            if (sale < average){
                number ++;
            }
        }
        return number;
    }
    //Кол-во месяцев, в которых продажи были выше среднего
    public int saleAboveAverage(int[] sales) {
        int number = 0;
        int average = calculateAverage(sales);
        for (int sale : sales){
            if (sale > average){
                number ++;
            }
        }
        return number;
    }
    }

