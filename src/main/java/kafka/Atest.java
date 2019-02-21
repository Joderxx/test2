package kafka;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.*;

/**
 * @author xiejiedun on 2018/12/21
 */
public class Atest {

    public static void main(String[] args) throws Exception {
        File file = new File("E:\\git resp\\springboot-lw");
        for (String s:listFiles("E:\\git resp\\springboot-lw",".idea",".git")){
            System.out.println(s);
        }
    }

    public static List<String> listFiles(String path,String...exclude){
        List<String> list = new ArrayList<>();
        listFiles(new File(path),list,new HashSet<>(Arrays.asList(exclude)));
        return list;
    }

    private static void listFiles(File file, List<String> list, Set<String> exclude){
        if (exclude.contains(file.getName())){
            return;
        }
        if (file.isDirectory()){
            for (File f: file.listFiles()){
                listFiles(f,list,exclude);
            }
        }else {
            list.add(file.getAbsolutePath());
        }
    }
}
