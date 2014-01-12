package manishjo.unixtools;
import manishjo.unixtools.fileOprations.fs;
import java.util.Arrays;

/**
 * Created by manishjo on 1/11/14.
 */

class SortData {
    public String showSortedData(String data){
        String lines[] = data.split("\n");
        String sortedData = null;
        Arrays.sort(lines);
        for(int i=0;i<lines.length;i++)
            sortedData += lines[i];
        return sortedData;
    }
}

public class Sort {
    public static void main(String[] args) {
        String data = null;
        int times = 10;
        fs fs = new fs();
        SortData show_head = new SortData();
        data = show_head.showSortedData(data);
        System.out.println(data);
    }
}




