import java.util.InputMismatchException;

public class HelloWorld {

	public static void main(String[] args) {
		try {

			int myInt = 1024572346;
			short myShort = 211;
			long myLong = 7895552;

			String firstString = "Magic";
			
			int whileNumber = 0;
			while (whileNumber < 10)
			{
				System.out.println(whileNumber);
				whileNumber++;
			}

			System.out.println("Hello World");
			System.out.println(myInt);
			System.out.println(myShort);
			System.out.println(myLong);
			System.out.println(firstString);
			int x=0;
			for(;x<5;x++)
			{
				System.out.println("o");
			}
		} catch (InputMismatchException e) {
			System.out.println(e);
		}
	}

}
