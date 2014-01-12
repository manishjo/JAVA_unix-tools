package manishjo.unixtools.reduceSpace;
import manishjo.unixtools.fileOprations.*;

import java.io.*;

class removeSpace{
        public String remove_extra_space(String data){
            return data.replaceAll("\\ +"," ");
        }
    }

public class reduceSpace {
        public static void main(String[] args) {
            String data = null;
                String sCurrentLine;
                fs fs = new fs();
                data = fs.readFile(args[0]);
                removeSpace removeSpace = new removeSpace();
                data = removeSpace.remove_extra_space(data);
                fs fileWriter = new fs();
                fileWriter.writeFile(args[0],data);
        }
}
