package user.service;

import user.constants.UsersList;
import user.model.User;

import java.io.*;

public class SingleUserService implements SerializationService {

    private static final String PATH = "./src/main/resources/users.txt";

    @Override
    public void serialize(User... user) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(PATH))) {
            oos.writeObject(user[0]);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deserialize() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PATH))) {
            User deserializedUser = (User) ois.readObject();
            System.out.println(deserializedUser);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
