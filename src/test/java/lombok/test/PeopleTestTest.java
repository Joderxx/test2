package lombok.test;

import lombok.javabean.People;
import lombok.javabean.User;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.*;

/**
 * @author xiejiedun on 2019/2/1
 */
public class PeopleTestTest {

    @Test
    public void name() {
        try (InputStream is = new FileInputStream("")){

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test1(){
        People people = People.builder().id(1).name("tom").age(1).build();
        System.out.println(people.toCase());
    }
}