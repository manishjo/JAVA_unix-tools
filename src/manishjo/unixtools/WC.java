package manishjo.unixtools.WC;
import java.io.BufferedReader;
import java.io.FileReader;
import manishjo.unixtools.fileOprations.*;

public class WC{ 
	public static void main(String[] args) {
		String msg = null;
        String sCurrentLine;
        if(args.length == 0){
            System.out.println("filename is not given");
            return;}
        fs fs = new fs();
        msg = fs.readFile(args[0]);
        int worlds = msg.split(" ").length;
        int lines = msg.split("\n").length-1;
        int characters = msg.split("").length;
        System.out.println("  "+lines+" "+worlds+" "+characters+" "+args[0]);

	}
}