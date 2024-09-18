package user.constants;

import user.model.User;

import java.util.ArrayList;
import java.util.List;

public class UsersList {

    public static final List<User> USERS_LIST;

    static {
        USERS_LIST = new ArrayList<>();
        USERS_LIST.add(User.builder()
                .name("Sasha")
                .surname("Tyutyaev")
                .mail("sasha@mail.ru")
                .build());
        USERS_LIST.add(User.builder()
                .name("Masha")
                .surname("MashaSurname")
                .mail("masha@mail.ru")
                .build());
        USERS_LIST.add(User.builder()
                .name("Medved")
                .surname("MedvedSurname")
                .mail("medved@mail.ru")
                .build());
    }
}
