import java.io.*;
class file
{
	public static void main(String[] args)throws IOException
	{
		String o="21 guns.rtf";
		String line=null;
		FileReader f=new FileReader(o);
		BufferedReader ob=new BufferedReader(f);
		while((line=ob.readLine())!=null)
		{
			System.out.print(line);
			System.out.println();
		}
		ob.close();
	}
}