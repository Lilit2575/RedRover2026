package HomeWork_7;

public class Main7_homeWork2 {
    public static int doubleInteger(int i) {
//         Double the integer and return it! / удвоить число и вернуть его
        return i * 2;
    }

//    static void main() {
//        System.out.println(doubleInteger(5));
//        System.out.println(doubleInteger(12));
//        System.out.println(doubleInteger(16));
//
//    }

    //    № 2
    public static boolean isLove(final int flower1, final int flower2) {
        if ((flower1 % 2 == 0 && flower2 % 2 != 0)
                || (flower1 % 2 != 0 && flower2 % 2 == 0)) {

            return true;
        } else {
            return false;
        }
    }

//    static void main() {
//        System.out.println(isLove(2, 2));
//    }

    //    #3
    public static String numberToString(int num) {
        return String.valueOf(num); // Return a string of the number here!
    }

//    static void main() {
//        System.out.println(numberToString(8));
//    }

    //    # 4
    public static int findSmallestInt(int[] args) {
        int min = args[0];
        for (int i = 1; i < args.length; i++) {
            if (min > args[i]) {
                min = args[i];
            }
        }
        return min;
    }

//    static void main() {
//        int[] args1 = new int[]{-2500, 168, 2, 1024, 216, 800};
//        System.out.println(findSmallestInt(args1));
//    }
    // #5


    public static String countingSheep(int nu) {
        String s = "";
        for (int i= 1; i <= nu; i= i +1){
            s =  s + i+ " sheep...";

        }
        //Add your code here
      return s;

    }

    static void main() {
        System.out.println(countingSheep(5));

    }
}