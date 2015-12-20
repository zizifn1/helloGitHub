public class CallUnitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//http://new-restart.iteye.com/blog/1477969
		//http://www.cnblogs.com/kuyijie/archive/2011/08/20/2146463.html
		//http://unmi.cc/maven-generate-executable-jar/
		
		UnitTest unitTest=new UnitTest();
		unitTest.mapTest();
		
		  System.out.print("输入");
		  Scanner scan = new Scanner(System.in);
		  String read = scan.nextLine();
		  System.out.println("输入数据："+read); 
		  
		  
		  File txt=new File("output.txt");
		  try {
		  if(!txt.exists()){
		  
			txt.createNewFile();
		  }
		  FileOutputStream fos=new FileOutputStream(txt,true);
		  OutputStreamWriter osw = new OutputStreamWriter(fos); 
		  String str="line1";
		  osw.write("time"+new Date().toString()+"\r\n");
		  osw.write(read+"\r\n");
		  System.out.println("output to output.txt");
		  
		  osw.close(); 
		  fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  }
			  

	}
	


