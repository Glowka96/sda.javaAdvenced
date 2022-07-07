package exception.input;

public class ExceptionDemo {
    public static void main(String[] args) {
        FileConnection fileConnection = new FileConnection();
        try {
            fileConnection.connected();
            } catch(FileConnectionException e){
            System.out.println("Error conection");
            }


        }
    }
