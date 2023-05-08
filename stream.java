import java.io.*;
public class stream {
 
	public static void main(String[] args)throws IOException {		// TODO Auto-generated method stub
//      DataInputStream dis=new DataInputStream(System.in);
//      FileOutputStream fout=new FileOutputStream("E:\\java_practise\\stream.txt");
//      System.out.println("Enter the data (@ at the end)");
//      BufferedOutputStream bout=new BufferedOutputStream(fout,1024);
      int ch;
      FileReader fr=null;
      try {
    	  fr=new FileReader("E:\\java_practise\\stream.txt");
      }
      catch(FileNotFoundException fe)
      {
    	  System.err.print("file is not found");
      }
      while((ch=fr.read())!=-1) {
        System.out.print((char)ch);
	  }
		fr.close();
		}


}
