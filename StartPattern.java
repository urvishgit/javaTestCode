public class StartPattern {

    public static void main (String[] args) {
        System.out.println("Print * 90 Degree Shape");
        TopNinetyDegreeShape(5);
        BottomNinetyDegreeShape(5);
        TriangleShape(5);
        DimondShape(5);
    }
    public static void TopNinetyDegreeShape(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void BottomNinetyDegreeShape(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void TriangleShape(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i ; k++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void DimondShape(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i ; k++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = rows-1; i >= 1; i--) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i ; k++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}
