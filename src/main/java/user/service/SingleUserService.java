package user.service;

import user.model.User;

import java.io.*;

public class SingleUserService {

    private static final String PATH = "./src/main/resources/users.txt";

    public void serializeUser(User user) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(PATH))) {
            oos.writeObject(user);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void deserializeUser() {
        User deserializedUser = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PATH))) {
            deserializedUser = (User) ois.readObject();
            System.out.println(deserializedUser);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
