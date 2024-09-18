package user;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//   ОДИН ЮЗЕР!!!
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./src/main/resources/users.txt"))) {
            oos.writeObject(User.builder()
                    .name("Sasha")
                    .surname("Tyutyaev")
                    .mail("sasha@mail.ru")
                    .build());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        User deserializedUser;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./src/main/resources/users.txt"))) {
            deserializedUser = (User) ois.readObject();
            System.out.println(deserializedUser.getName());
            System.out.println(deserializedUser.getSurname());
            System.out.println(deserializedUser.getMail());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

//    СПИСОК ЮЗЕРОВ!!!
        List<User> users = new ArrayList<>();
        users.add(User.builder()
                .name("Sasha")
                .surname("Tyutyaev")
                .mail("sasha@mail.ru")
                .build());
        users.add(User.builder()
                .name("Masha")
                .surname("MashaSurname")
                .mail("masha@mail.ru")
                .build());
        users.add(User.builder()
                .name("Medved")
                .surname("MedvedSurname")
                .mail("medved@mail.ru")
                .build());

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./src/main/resources/usersList.txt"))) {
            oos.writeObject(users);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./src/main/resources/usersList.txt"))) {
            List<User> deserializedUsers = (List<User>) ois.readObject();

            for (User user : deserializedUsers) {
                System.out.println(user);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}