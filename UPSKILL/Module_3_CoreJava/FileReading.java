import java.io.*;
class FileReading{
    public static void main(String[] args) {
        try{
            BufferedReader reader=new BufferedReader(new FileReader("output.txt"));
            String li;
            while ((li=reader.readLine())!=null){
                System.out.println(li);
            }
            reader.close();
        }
		catch(IOException e){
            System.out.println("Error:File is not found");
        }
    }
}