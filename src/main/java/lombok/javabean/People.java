package lombok.javabean;

import lombok.Builder;
import lombok.ToString;
import lombok.Value;
import lombok.experimental.ExtensionMethod;

/**
 * @author xiejiedun on 2019/2/1
 */
@Builder
@ToString
@ExtensionMethod({Hello.class})
public class People {

    private int id = 1;
    private String name;
    private int age;

    public String toCase(){
        name = name.toTitleCase();
        return name.or("tom".toTitleCase());
    }
}

class Hello{
    public static <T> T or(T obj,T isnull){
        return obj==null?isnull:obj;
    }

    public static String toTitleCase(String s){
        if (s==null||s.isEmpty()){
            return s;
        }
        return s.substring(0,1).toUpperCase()+s.substring(1);
    }
}
