package example;

import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class HelloWorld {

	protected static writeFiles(){
		try {
      			FileWriter myWriter = new FileWriter("file.txt");
      			myWriter.write("Hello world!");
      			myWriter.close();
    		} catch (IOException e) {
      			System.err.println("An error occurred.");
      			e.printStackTrace();
    		}
		try {
                        FileWriter myWriter = new FileWriter("file.xml");
                        myWriter.write("<text>Hello world!</text>");
                        myWriter.close();
                } catch (IOException e) {
                        System.err.println("An error occurred.");
                        e.printStackTrace();
                }
		try {
                        FileWriter myWriter = new FileWriter("file.json");
                        myWriter.write("{ \"text\": \"Hello world!\"}");
                        myWriter.close();
                } catch (IOException e) {
                        System.err.println("An error occurred.");
                        e.printStackTrace();
                }
		try {
                        FileWriter myWriter = new FileWriter("file.csv");
                        myWriter.writeln("row,content");
			myWriter.writeln("1,Hello world!");
                        myWriter.close();
                } catch (IOException e) {
                        System.err.println("An error occurred.");
                        e.printStackTrace();
                }

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");

		writeFiles();
	}

}
