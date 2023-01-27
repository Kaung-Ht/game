import java.io.*;
import java.util.*;
class Jan12b {
    public static void main(String[] args) {
        Stack<File> stack = new Stack<> ();
        File root = new File("/");
        stack.push(root);
        while(!stack.empty()) {
            File f = stack.pop();
            if(!f.isDirectory()) {
                System.out.println(f.getName());
            }else{
                File[] e = f.listFiles();
                for(File x:e) {
                    if(x.isDirectory())
                    stack.push(x);
                    else
                    System.out.println(x.getName());
                }
            }
        }

    }
    