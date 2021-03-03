import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cargoCapacity = 12;
        int caseCapacity = 27;
        int truck = 1;
        int container = 1;
        System.out.println(" Введите колличество ящиков");
        Scanner scanner = new Scanner(System.in);
        int box = scanner.nextInt();
        if (box> 0) {
            System.out.println("Грузовик " + truck + ":");
            System.out.println("\t Контейнер " + container + ":");
            for (int i = 1; i <= box; i++) {
                System.out.println("\t  \t Ящик " + i);
                if (i % (cargoCapacity * caseCapacity) == 0) {
                    truck += 1;
                    System.out.println("Грузовик: " + truck);
                }
                if (i % caseCapacity == 0) {
                    container += 1;
                    System.out.println("\t Контейнер " + container + ":");
                }
            }
            System.out.println("Необходимо: \n грузовиков - " + truck + " шт. \n контейнеров -" + container + "шт.");
        }
        else  {
            System.out.println("Нет ящиковю.");
        }
//        System.out.println(box);
//for (int i = 1; i <= box; i++)
//{
//    System.out.println("Ящик " + i);
//}

    }
}
