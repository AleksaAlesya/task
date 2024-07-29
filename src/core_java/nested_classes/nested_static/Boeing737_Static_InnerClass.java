package core_java.nested_classes.nested_static;


    public class Boeing737_Static_InnerClass {

        private int manufactureYear;
        private static int maxPassengersCount = 300;

        public Boeing737_Static_InnerClass(int manufactureYear) {
            this.manufactureYear = manufactureYear;
        }

        public int getManufactureYear() {
            return manufactureYear;
        }

        //вложенный статический класс.
        // экз. могут созд-ся
        // не имеет доступ к нестатическим даныым
        public static class Drawing {
            private int id;

            public Drawing(int id) {
                this.id = id;
            }

            public static int getPassengersCount() {
                return maxPassengersCount;
            }

            @Override
            public String toString() {
                return "Drawing{" +
                        "id=" + id +
                        '}';
            }


        }
        public static void main(String[] args) {
            // может создаваться без внешнего класса
            Drawing drawing = new Drawing(777);
            System.out.println(drawing);
            for (int i = 1; i < 6; i++) {


                Boeing737_Static_InnerClass.Drawing drawing1 = new Boeing737_Static_InnerClass.Drawing(i);
                System.out.println(drawing1);

            }


        }
    }