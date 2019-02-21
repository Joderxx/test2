package test;

import java.io.File;

/**
 * create by dell on 2018/11/23
 */
public class CreateUser {

    public static void create(){
        String protoFile = "User.proto";
        String cmd = "protoc -I=src/main/proto --java_out=src/main/java src/main/proto/"+protoFile;
        try {
            Process exec = Runtime.getRuntime().exec(cmd);
            exec.waitFor();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        create();
    }
}
