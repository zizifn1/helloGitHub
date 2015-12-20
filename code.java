package call;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.sql.Time;
import java.util.Date;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

import test.UnitTest;

public class CallUnitTest {

	public static String payloadPath="";
	public static void main(String[] args) {	

		//http://new-restart.iteye.com/blog/1477969
		//http://www.cnblogs.com/kuyijie/archive/2011/08/20/2146463.html
		//http://unmi.cc/maven-generate-executable-jar/
		
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		while (true) {
			String read = null;
			System.out.println("Please input VMpayload will want test, if not,use default");
			payloadPath = scan.nextLine();
			
			System.out.println("-------------------------");
			System.out.println("Please input which option you want?");
			System.out.println("1. DP Transfomer");
			System.out.println("2. Java class");
			System.out.println("3. Both");
			System.out.println("4. Exit");
			System.out.println("-------------------------");

			
			read = scan.nextLine();
			int option = Integer.parseInt(read);
			int loopTimes = 0;
			int recordTimes = 0;
			switch (option) {
			case 1:
				System.out.println("which times you want testing running? Example 1000 times");
				read = scan.nextLine();
				loopTimes = Integer.parseInt(read);

				System.out.println("How many record you want to get? Example 2");
				System.out.println("if you input the \"2\", this mean you will get the 2 performances estimation time.");
				read = scan.nextLine();
				recordTimes = Integer.parseInt(read);

				for (int i = 0; i < recordTimes; i++) {
					runDPTransfomerTest(loopTimes);
				}
				break;

			case 2:
				System.out.println("How many you want testing running? Example 1000 times");
				read = scan.nextLine();
				loopTimes = Integer.parseInt(read);

				System.out.println("How many record you want the test run? Example 2");
				System.out.println("if you input the \"2\", this mean if will get the 2 performances estimation time.");
				read = scan.nextLine();
				recordTimes = Integer.parseInt(read);

				for (int i = 0; i < recordTimes; i++) {
					runJavaTest(loopTimes);
				}
				break;

			case 3:
				System.out.println("which times you want testing running");
				read = scan.nextLine();
				loopTimes = Integer.parseInt(read);

				System.out.println("How many record you want the test run? Example 2");
				System.out.println("if you input the \"2\", this mean if will get the 2 performances estimation time.");
				read = scan.nextLine();
				recordTimes = Integer.parseInt(read);

				for (int i = 0; i < recordTimes; i++) {
					runDPTransfomerTest(loopTimes);
					runJavaTest(loopTimes);
				}
				break;

			default:
				return;
			}
		}
		
	}

	private static void runJavaTest(int loopTimes) {
		// TODO Auto-generated method stub

		System.out.println("Java test running");
		
		String content = "--------------------------\r\n";
		// Test Time:
		content += ("Test Date: " + new Date().toString() + "\r\n");
		// payload path
		content += "Test payload: " +payloadPath + "\r\n";
		// Loop Times
		content += "Loop Times: " + loopTimes + "\r\n";

		System.out.println("Java test" + loopTimes);

		// Total test time(ms)
		content += "Total time(ms): " + 100 + "\r\n";

		// Per-call time(ms)
		content += "Per-call time(ms): " + 1 + "\r\n";
		content += "--------------------------\r\n";

		stringToFile("JavaTestLog.txt", content);
	}

	private static void runDPTransfomerTest(int loopTimes) {
		// TODO Auto-generated method stub

		System.out.println("DPTransfomer test running");
		
		String content = "--------------------------\r\n";
		// Test Time:
		content += ("Test Date: " + new Date().toString() + "\r\n");
		// payload path
		content += "Test payload: " +payloadPath + "\r\n";
		// Loop Times
		content += "Loop Times: " + loopTimes + "\r\n";

		System.out.println("DPTransfomer test" + loopTimes);

		// Total test time(ms)
		content += "Total time(ms): " + 100 + "\r\n";

		// Per-call time(ms)
		content += "Per-call time(ms): " + 1 + "\r\n";

		content += "--------------------------\r\n";

		stringToFile("DPTransfomerTestLog.txt", content);
	}

	public static void stringToFile(String filePath, String content) {
		File txt = new File(filePath);
		try {
			if (!txt.exists()) {

				txt.createNewFile();
			}
			FileOutputStream fos = new FileOutputStream(txt, true);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			/*
			 * String str = "line1"; osw.write("time" + new Date().toString() +
			 * "\r\n"); osw.write(read + "\r\n");
			 */

			osw.write(content);

			osw.close();
			fos.close();
			System.out.println(content);
			System.out.println("test result also output to " + filePath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
