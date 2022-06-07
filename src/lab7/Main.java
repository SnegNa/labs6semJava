package lab7;

import java.util.*;





    /*
    По заданию 1 и 2 этаж помещенны в массив и arraylist соотвественно , 3 я поместил в связанный список. Каждый этаж запоняю случайными команатами со случайными площадями с помощью статических методов
    getRandomType() и getRandomSquare(). На каждом этаже использую итератор, внутри циклов считываю комнату, значение ее площади складываю в переменную для площади всего этажа. Для получения площади в зависимости от
     типа вызываю sumSquareType(). Для получения результата складываю все переменные со значением площадей.


     */
    public class Main {
        public static Iterator<Room> iterator;
        public static int squareFirstFloor;
        public static int squareSecondFloor;
        public static int squareThirdFloor;
        public static int squareBadrooms;
        public static int squareKitchens;
        public static int squareStorage;

        public static void main(String[] args) {
            Room[] floor1 = new Room[11];
            ArrayList<Room> floor2 = new ArrayList<>();
            LinkedList<Room> floor3 = new LinkedList<>();



            for (int i = 0; i < 11; i++) {
                floor1[i] = new Room(getRandomType(), getRandomSquare());
                floor2.add(new Room(getRandomType(), getRandomSquare()));
                floor3.add(new Room(getRandomType(), getRandomSquare()));
            }
            System.out.println(sumSquare(floor1, floor2, floor3));

        }

        public static String sumSquare(Room[] floor1, ArrayList<Room> floor2, LinkedList<Room> floor3) {
            Room room;
            squareFirstFloor = 0;
            squareSecondFloor = 0;
            squareThirdFloor = 0;
            squareBadrooms = 0;
            squareKitchens = 0;
            squareStorage = 0;

            iterator = Arrays.stream(floor1).iterator();
            while (iterator.hasNext()) {
                // Считается площадь в зависимости от типа комнаты.
                room = iterator.next();
                squareFirstFloor += room.getRoomSquare();
                sumSquareTypeRoom(room);
            }

            iterator = floor2.iterator();
            while (iterator.hasNext()) {
                room = iterator.next();
                squareSecondFloor += room.getRoomSquare();
                sumSquareTypeRoom(room);
            }
            iterator = floor3.iterator();
            while (iterator.hasNext()) {
                room = iterator.next();
                squareThirdFloor += room.getRoomSquare();
                sumSquareTypeRoom(room);
            }
            return " Площадь здания: " + (squareFirstFloor + squareSecondFloor + squareThirdFloor) + " м^2\nПлощадь " +
                    "первого этажа: " + squareFirstFloor + " м^2\nПлощадь второго этажа: " + squareSecondFloor +
                    " м^2\nПлощадь третьего этажа: " + squareThirdFloor + " м^2\nПлощадь спален: " + squareBadrooms +
                    " м^2\nПлощадь кухонь: " + squareKitchens + " м^2\nПлощадь кладовых: " + squareStorage + " м^2";
        }

        public static void sumSquareTypeRoom(Room room){
            switch (room.getType()){
                case "Bedroom" -> squareBadrooms += room.getRoomSquare();
                case "Kitchen" -> squareKitchens += room.getRoomSquare();
                case "Storage" -> squareStorage += room.getRoomSquare();
            }
        }

        public static String getRandomType() {
            ArrayList<String> listTypeRoom = new ArrayList<>();
            listTypeRoom.add("Bedroom");
            listTypeRoom.add("Kitchen");
            listTypeRoom.add("Storage");
            return listTypeRoom.get(new Random().nextInt(3));
        }

        public static int getRandomSquare() {
            return new Random().nextInt(5) + 15;
        }
    }

