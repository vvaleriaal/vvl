import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/*Необходимо написать программу, которая определяет
пересекаются ли два отрезка. Координаты отрезков вводятся
вручную во время выполнения программы.*/

public class Zadanie3 {

	public static void main(String[] args) throws Exception{		
		Scanner in = new Scanner(System.in);
		//координаты 1го
		System.out.println("Введите для первой точки первую вершину (х,у) через пробел");
        String[] firstPoint = in.nextLine().trim().split(" ");
        System.out.println("Введите для первой точки вторую вершину (х,у) через пробел");
        String[] secondPoint = in.nextLine().trim().split(" ");

        Zadanie3 point1 = new Zadanie3(
                Double.parseDouble(firstPoint[0]),
                Double.parseDouble(secondPoint[0]),
                Double.parseDouble(firstPoint[1]),
                Double.parseDouble(secondPoint[1]));

        System.out.println("Введите для второй точки первую вершину (х,у) через пробел");
        firstPoint = in.nextLine().trim().split(" ");
        System.out.println("Введите для второй точки вторую вершину (х,у) через пробел");
        secondPoint = in.nextLine().trim().split(" ");

        Zadanie3 point2 = new Zadanie3(
                Double.parseDouble(firstPoint[0]),
                Double.parseDouble(secondPoint[0]),
                Double.parseDouble(firstPoint[1]),
                Double.parseDouble(secondPoint[1]));
        
		String res = task(point1, point2);
		System.out.println(res);
		
	}
	private double x1,x2,y1,y2;

    Zadanie3(double x1,double x2,double y1,double y2)
    {
        if (x1 > x2)
        {
            this.x1 = x2;
            this.x2 = x1;
            this.y1 = y2;
            this.y2 = y1;
        }
        else {
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
        }

    }

   private boolean isVertical(Zadanie3 point)
    {
            if (x1 == point.x1) {

                if (!((Math.max(y1, y2) < Math.min(point.y1, point.y2)) ||
                        (Math.min(y1, y2) > Math.max(point.y1, point.y2)))) {

                    return true;
                }
            }

        return false;
    }

    private boolean isVerticalFirstSegment(Zadanie3 point)
    {
            double x = x1;
            double a = (point.y1 - point.y2) / (point.x1 - point.x2);
            double b = point.y1 - a * point.x1;
            double y = a * x + b;

            if (point.x1 <= x && point.x2 >= x && Math.min(y1, y2) <= y &&
                    Math.max(y1, y2) >= y) {

                return true;
            }
        return false;
    }

    private boolean isVerticalSecondSegment(Zadanie3 point)
    {
            double x = point.x1;
            double a = (y1 - y2) / (x1 - x2);
            double b = y1 - a * x1;
            double y = a * x + b;

            if (x1 <= x && x2 >= x && Math.min(point.y1, point.y2) <= y &&
                    Math.max(point.y1, point.y2) >= y) {

                return true;
            }
        return false;
    }

    private boolean isGeneral(Zadanie3 point)
    {
        double a1 = (x2 - x1)/(y2 - y1);
        double a2 = (point.x2 - point.x1)/(point.y2 - point.y1);
        double b1 = y1 - a1 * x1;
        double b2 = point.y1 - a2 * point.x1;

        double x = (b2 - b1) / (a1 - a2);

        return (!(x < Math.max(x1, point.x1))) && (!(x > Math.min(x2, point.x2)));
    }



    boolean isIntersection(Zadanie3 point)
    {
        if ((x1 - x2 == 0) && (point.x1 - point.x2 == 0)) return isVertical(point);
        if (x1 - x2 == 0) return isVerticalFirstSegment(point);
        if (point.x1 - point.x2 == 0) return isVerticalSecondSegment(point);
        else return isGeneral(point);
    }
    
    static String task(Zadanie3 point1, Zadanie3 point2)
    {
        return point1.isIntersection(point2)?"Да":"Нет";
    }

}

