import java.io.*;
import java.util.*;
class FileWriting{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text: ");
        String text=sc.nextLine();
        try{
            FileWriter writer=new FileWriter("output.txt");
            writer.write(text);
            writer.close();
            System.out.println("Data written to output.txt successfully.");
        }
		catch(IOException e){
            System.out.println("Error writing file.");
        }
    }
}