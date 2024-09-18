package user.service;

import user.model.User;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class ManyUsersService {

    public void serializeUsers(List<User> users) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("usersList.txt"))) {
            oos.writeObject(users);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deserializeUsers() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("usersList.txt"))) {
            List<User> deserializedUsers = (List<User>) ois.readObject();
            printUsers(deserializedUsers);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void printUsers(List<User> users) {
        for (User user : users) {
            System.out.println(user);
        }
    }
}
