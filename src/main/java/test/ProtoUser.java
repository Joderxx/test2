package test;

import com.google.protobuf.InvalidProtocolBufferException;
import test.model.UserEntity;

import java.util.Arrays;

/**
 * create by dell on 2018/11/23
 */
public class ProtoUser {

    public static void newUser() throws InvalidProtocolBufferException {
        UserEntity.User.Builder builder = UserEntity.User.newBuilder();
        UserEntity.User.Phone.Builder p = UserEntity.User.Phone.newBuilder();

        UserEntity.User user = builder.setEmail("123@qq.com")
                        .addPhone(p.setNumber("1234")
                        .build()).setId(1).setName("谢谢").build();
        byte[] data = user.toByteArray();
        System.out.println(Arrays.toString(data));
        System.out.println(data.length);

        UserEntity.User user1 = UserEntity.User.parseFrom(data);
        System.out.println(user1);
    }

    public static void main(String[] args) throws InvalidProtocolBufferException {
        newUser();
    }
}
