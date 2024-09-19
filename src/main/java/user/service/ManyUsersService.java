package user.service;

import user.model.User;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ManyUsersService implements SerializationService {

    private static final String PATH = "./src/main/resources/usersList.txt";

    @Override
    public void serialize(User... users) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(PATH))) {
            oos.writeObject(users);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deserialize() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PATH))) {
            User[] deserializedUsers = (User[]) ois.readObject();
            printUsers(deserializedUsers);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void printUsers(User[] users) {
        for (User user : users) {
            System.out.println(user);
        }
    }
}
