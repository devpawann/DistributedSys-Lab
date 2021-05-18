import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        int number,temp;
        Scanner scanner=new Scanner(System.in);
        Socket s=new Socket("127.0.0.1",1200);
        Scanner ssc=new Scanner(s.getInputStream());
        PrintStream p=new PrintStream(s.getOutputStream());
        System.out.println("Enter a number");
        number=scanner.nextInt();
        p.println(number);
        temp=ssc.nextInt();
        System.out.println(temp);

    }
}
