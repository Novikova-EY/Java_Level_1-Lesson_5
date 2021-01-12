public class Main {

    public static void main(String[] args) {

        /** Массив объектов */
        Workman[] workmanArray = new Workman[5];
        workmanArray[0] = new Workman("Сидоров Иван Сергеевич", "директор", "sidorov-is@sitename.ru", "89261461520", 130000, 46);
        workmanArray[1] = new Workman("Петрова Аглая Федоровна", "бухгалтер", "petrova-af@sitename.ru", "89261461535", 100000, 62);
        workmanArray[2] = new Workman("Иващенко Петр Сергеевич", "эксперт", "ivashenko-ps@sitename.ru", "89261461520", 80000, 48);
        workmanArray[3] = new Workman("Симонов Валерий Степанович", "специалист", "simonov-vs@sitename.ru", "89261461520", 60000, 34);
        workmanArray[4] = new Workman("Иванова Татьяна Ивановна", "специалист", "ivanova-ti@sitename.ru", "89261461520", 60000, 25);

        /** Вывод информации о сотрудниках старше 40 лет в консоль */
        System.out.println("Работники старше 40 лет:");
        for (int i = 0; i < workmanArray.length; i++) {
            if (workmanArray[i].getAge() > 40) {
                workmanArray[i].print();
            }
        }
    }
}
