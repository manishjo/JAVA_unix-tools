package manishjo.unixtools;
import java.io.BufferedReader;
import java.io.FileReader;

public class WC{ 
	public static void main(String[] args) {
		String msg = "";
		try {
			String sCurrentLine;
			if(args.length == 0){
				System.out.println("filename is not given");
				return;
			}
			BufferedReader br = new BufferedReader(new FileReader(args[0]));
			while ((sCurrentLine = br.readLine()) != null)
				msg = msg+"\n"+sCurrentLine;
			int worlds = msg.split(" ").length;
			int lines = msg.split("\n").length-1;
			int characters = msg.split("").length;
			System.out.println("  "+lines+" "+worlds+" "+characters+" "+args[0]);
		} catch (Exception e) {
			System.out.println("file not found");
		}
	}
}