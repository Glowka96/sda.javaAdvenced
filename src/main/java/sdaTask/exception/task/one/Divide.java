package sdaTask.exception.task.one;

public class Divide {
    public static void main(String[] args) throws CannotDivideBy0Exception{
        divide(2, 0);
    }


    public static double divide(int i, int a) throws CannotDivideBy0Exception{
        if(a == 0) {
            throw new CannotDivideBy0Exception();
        }
        return i/a;
    }
}
