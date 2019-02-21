package lombok.test;

import lombok.javabean.People;
import lombok.javabean.User;
import lombok.var;
import org.junit.Test;

/**
 * @author xiejiedun on 2019/2/1
 */
public class PeopleTest {

    @Test
    public void test1(){
        People people = People.builder()
                .age(20)
                .name("jack")
                .build();
        System.out.println(people.toCase());
        System.out.println(people);
    }

    @Test
    public void test2(){
        ;
//        User user = new User();
//        User user = User.of(10);
//        System.out.println(User.JACK);
//        var x = 10.0;
//        System.out.println(x);

    }
}
