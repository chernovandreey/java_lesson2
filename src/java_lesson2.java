import java.util.Scanner;

class java_lesson2 {
    String name;
    int weight;
    int price;
    String color;
    int height;
    static int count = 0;

    public static void main(String[] args) {

        java_lesson2 room =new java_lesson2();

        room.name = "bedroom";
        room.weight = 100000;
        room.price = 5000000;
        room.color = "white";
        room.height = 3;
        count++;


        java_lesson2 giraffe =new java_lesson2();

        giraffe.name = "Karl";
        giraffe.weight = 1500;
        giraffe.price = 5000000;
        giraffe.color = "orange";
        giraffe.height = 6;
        count++;

        java_lesson2 human =new java_lesson2();

        human.name = "Boby";
        human.weight = 300;
        human.price = 9999999;
        human.color = "red";
        human.height = 2;
        count++;


        System.out.println("кого ты хочешь посмотреть?");
        Scanner p = new Scanner(System.in);
        String n = p.nextLine();

        if (n != null && "room".equals(n)) {
            System.out.print("мы создали комнату - " + room.name + ",её грузоподъемность - " + room.weight + ".Примерная стоимость: " + room.price + ", её цвет: "+ room.color + ", метров в высоту:" +room.height);
        }
        if (n != null && "giraffe".equals(n)) {
            System.out.print("мы создали жирафа по имени " + giraffe.name + ", его грузоподъёмность -" + giraffe.weight + ". Примерная стоимость:" + giraffe.price + ", его цвет: "+ giraffe.color + ", метров в высоту:" +giraffe.height);
        }
        if (n != null && "human".equals(n)) {
            System.out.print("мы создали человека робота по имени: " + human.name + ", его грузоподъемность-" + human.weight + ". Примерная стоимость: " + human.price + ", его цвет: "+ human.color + ", метров в высоту:" +human.height);
        }
    }

}

