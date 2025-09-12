public class Main {
    public static void main(String[] args) {
        Report salesReport = new Report.Builder()
                .setTitle("Sales Report - September")
                .setContent("В сентябре продажи выросли на 20%.")
                .setAuthor("Асем")
                .setDate("12.09.2025")
                .build();

        System.out.println(salesReport);

        Report financeReport = new Report.Builder()
                .setTitle("Finance Report - Q3")
                .setContent("Доход компании увеличился на 15%.")
                .setAuthor("Жанерке")
                .setDate("10.09.2025")
                .build();

        System.out.println(financeReport);
    }
}